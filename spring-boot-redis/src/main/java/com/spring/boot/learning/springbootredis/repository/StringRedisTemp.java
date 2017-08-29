package com.spring.boot.learning.springbootredis.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;


/**
 * @author lizhiming  2017/8/29 14:33
 */
@Component
public class StringRedisTemp {

    private static final Logger logger = LoggerFactory.getLogger(StringRedisTemp.class);

    private StringRedisTemplate stringRedisTemplate;

    public StringRedisTemp(StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }

    public void testKeys(String patter) {
        stringRedisTemplate.keys(patter).forEach(str -> {
            logger.info(this.getClass() + " testKey,Str={}", str);
        });
    }
}
