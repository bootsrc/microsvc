package com.lsm.mallapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MallApp {
    public static void main(String[] args){
        SpringApplication.run(MallApp.class, args);
    }
}
