package com.ysdevelop.add.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author oldhuang
 * @date 2018/10/18
 * @description
 */
@RestController
public class ComputeController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DiscoveryClient client;

    @GetMapping(value = "/add")
    public Integer add(Integer a, Integer b) {
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a + b;
        logger.info("/add, host" + instance.getHost() + ",service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }


}
