package com.lsm.mallservice.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("biz")
public class BizController {

    @RequestMapping("add")
    public int add(int x, int y) {
        return x + y;
    }
}
