package org.apache.dubbo.demo.provider.controller;

import org.apache.dubbo.demo.api.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @since 2021/2/23
 */
@RestController
public class HelloController {

    @Resource
    private DemoService demoService;

    @RequestMapping("/hello")
    public String hello(String name) {
        return demoService.sayHello(name);
    }

}
