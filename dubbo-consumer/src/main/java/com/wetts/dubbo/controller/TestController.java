package com.wetts.dubbo.controller;

import com.wetts.dubbo.service.TestService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping(value = "/hello/{name}", produces = "text/html;charset=UTF-8")
    public String hello(@PathVariable String name) {
        return testService.hello(name);
    }

}
