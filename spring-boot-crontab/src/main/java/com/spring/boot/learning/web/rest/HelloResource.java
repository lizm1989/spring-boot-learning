package com.spring.boot.learning.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhimingli on 2017/6/23.
 */
@RestController
@RequestMapping("/api")
public class HelloResource {

    @GetMapping("/hello")
    public String hello() {

        return "hello";
    }
}
