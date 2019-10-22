package com.itheima.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/welcome/{name}")
    @ResponseBody
    public String hello(@PathVariable("name") String name){

        return helloService.getHelloString(name);

    }

}
