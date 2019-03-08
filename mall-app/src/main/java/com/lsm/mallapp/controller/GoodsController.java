package com.lsm.mallapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("goods")
public class GoodsController {
    private static final Logger logger = LoggerFactory.getLogger(GoodsController.class);
    @Autowired
    private LoadBalancerClient balancerClient;
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private RestTemplate restTemplate;

    private static final String serviceName = "mallService";

    /**
     * LoadBalancerClient#choose(serviceId)的执行速度比DiscoveryClient#getInstances(serviceId)的速度快得多。
     * balancerClient.choose(serviceId).getInstanceId 值为"localhost:27050"
     * 而discoveryClient.getInstances(serviceId).getInstanceId 值为"mallService_0"
     * @return
     */
    @RequestMapping("list")
    public String list() {
        ServiceInstance serviceInstance = balancerClient.choose(serviceName);
        String url = serviceInstance.getUri().toString()
                + "/goods/list";
//        String result = new RestTemplate().getForObject(url, String.class);
        logger.info("======url={}", url);
        String result = restTemplate.getForObject(url, String.class);
        logger.info(">>>balancerClient__result={}", result);

        // Test discoveryClient.getInstances
        List<ServiceInstance> instanceList = discoveryClient.getInstances("mallService");
        logger.info("--->instanceList={}", instanceList);
        // 这里instanceList是size==0的， 需要查下原因。
        return result;
    }
}
