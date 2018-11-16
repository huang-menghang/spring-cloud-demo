package com.ysdevelop.cloud.config.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author oldhuang
 * @date 2018/11/16
 * @description
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(Boolean.TRUE).run(args);
    }

}
