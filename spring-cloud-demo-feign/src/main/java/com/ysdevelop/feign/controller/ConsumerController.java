package com.ysdevelop.feign.controller;

import com.ysdevelop.feign.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author oldhuang
 * @date 2018/10/18
 * @description
 */
@RestController
public class ConsumerController {

    @Autowired
    ComputeClient computeClient;

    @GetMapping(value = "/add")
    public Integer add() {
        return computeClient.add(100, 200);
    }

}
