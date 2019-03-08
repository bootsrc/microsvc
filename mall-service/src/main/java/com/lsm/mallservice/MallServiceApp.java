package com.lsm.mallservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableHystrixDashboard
public class MallServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(MallServiceApp.class, args);
    }

}
