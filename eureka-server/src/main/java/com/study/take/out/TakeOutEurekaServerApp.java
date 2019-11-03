package com.study.take.out;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TakeOutEurekaServerApp {

    public static void main(String[] args) {
        SpringApplication.run(TakeOutEurekaServerApp.class, args);
    }
}
