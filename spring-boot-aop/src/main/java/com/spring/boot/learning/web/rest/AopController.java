package com.spring.boot.learning.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhimingli on 2017-3-17 0017.
 */
@RestController

public class AopController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @GetMapping("/aop")
    public String aop(){
        logger.info("---->执行aop方法");

        return "hello aop";
    }
}
