package com.spring.boot.learning.config;

import com.google.gson.Gson;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhimingli on 2017-3-17 0017.
 */
@Aspect
@Component
public class WebAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Pointcut("execution(public * com.spring.boot.learning.web.rest.*.*(..))")
    public void webLog(){}

    @Before("webLog()")
    public void before(JoinPoint joinPoint){
        //接受到的请求
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

        HttpServletRequest httpServletRequest = attributes.getRequest();
        HttpServletResponse httpServletResponse = attributes.getResponse();

        //
        logger.info("---->before");

    }

    @Around("webLog()")
   public Object arount(ProceedingJoinPoint joinPoint) throws Throwable {
       //接受到的请求
       ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

       HttpServletRequest httpServletRequest = attributes.getRequest();
       HttpServletResponse httpServletResponse = attributes.getResponse();

        String url = httpServletRequest.getRequestURL().toString();
        String method = httpServletRequest.getMethod();
        String uri = httpServletRequest.getRequestURI();
        String queryString = httpServletRequest.getQueryString();
        logger.info("---->请求开始, 各个参数, url: {}, method: {}, uri: {}, params: {}", url, method, uri, queryString);

        // result的值就是被拦截方法的返回值
        Object result = joinPoint.proceed();
        Gson gson = new Gson();
        logger.info("---->请求结束，controller的返回值是 " + gson.toJson(result));

        return result;
   }
}
