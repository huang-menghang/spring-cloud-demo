package com.ysdevelop.feign.hystrix;

import com.ysdevelop.feign.service.ComputeClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author oldhuang
 * @date 2018/10/19
 * @description 断路器
 */
@Component
public class ComputeClientHystrix implements ComputeClient {


    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
