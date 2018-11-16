package com.ysdevelop.ribbon.controller;

import com.ysdevelop.ribbon.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author oldhuang
 * @date 2018/10/18
 * @description
 */
@RestController
public class ConsumerController {

    @Autowired
    private ComputeService computeService;

    @GetMapping(value = "/add")
    public String add() {
        return computeService.addService();
    }


}
