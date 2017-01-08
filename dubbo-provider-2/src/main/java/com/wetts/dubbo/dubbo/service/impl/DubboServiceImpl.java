package com.wetts.dubbo.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wetts.dubbo.dubbo.service.DubboService;

@Service(version = "1.0.0", retries = 0, timeout = 2000)
public class DubboServiceImpl implements DubboService {

    @Override
    public String hello(String name) {
        return "你是猪， " + name;
    }
}
