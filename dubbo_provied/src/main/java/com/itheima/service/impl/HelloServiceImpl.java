package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.service.HelloService;
import org.springframework.transaction.annotation.Transactional;

@Service( interfaceClass = HelloService.class)

public class HelloServiceImpl implements HelloService {

    public String getHelloString(String name) {

        return "welcome"+name;

    }
}
