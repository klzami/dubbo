package org.apache.dubbo.demo.provider.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.demo.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @since 2021/2/23
 */
@DubboService
public class DemoServiceImpl implements DemoService {

    private static final Logger log = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Override
    public String sayHello(String name) {
        log.info("name:{}", name);
        return "Hello " + (name == null ? "null" : name);
    }
}
