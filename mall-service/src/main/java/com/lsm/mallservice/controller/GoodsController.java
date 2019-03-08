package com.lsm.mallservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("goods")
public class GoodsController {
    private static final Logger logger = LoggerFactory.getLogger(GoodsController.class);

    @Autowired
    private LoadBalancerClient balancerClient;
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("list")
    public String list() {
        List<String> serviceList =  discoveryClient.getServices();
        logger.info("----serviceList={}", serviceList);

        List<ServiceInstance> instanceList = discoveryClient.getInstances("mallService");
        logger.info("InMy_instanceList={}", instanceList);
        return "this is goods/list value.";
    }
}
