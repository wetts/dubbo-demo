package com.wetts.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wetts.dubbo.dubbo.service.DubboService;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Reference(version="1.0.0")
    private DubboService dubboService;

    public String hello(String name) {
        return dubboService.hello(name);
    }

}
