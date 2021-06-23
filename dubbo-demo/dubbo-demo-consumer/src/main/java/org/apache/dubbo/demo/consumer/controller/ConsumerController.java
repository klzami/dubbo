package org.apache.dubbo.demo.consumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.demo.api.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @since 2021/2/22
 */
@RestController
public class ConsumerController {

    @DubboReference
    private DemoService demoService;

    @RequestMapping("/test")
    public String test(String text) {
        return demoService.sayHello(text);
    }

}
