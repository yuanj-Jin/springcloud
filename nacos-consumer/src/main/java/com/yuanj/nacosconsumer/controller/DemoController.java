package com.yuanj.nacosconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;
//    @Value("${spring.application.name}")
    private String appName="nacos-producer";

    @RequestMapping(value = "/echo/{param}", method = RequestMethod.GET)
    public String hello(@PathVariable String param){

//        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-producer");
//        String path = String.format("http://%s:%s/seeyou/%s",serviceInstance.getHost(),serviceInstance.getPort(),appName);
//        System.out.println("request path:" +path);
//        return restTemplate.getForObject(path,String.class);
        return restTemplate.getForObject("http://nacos-producer/seeyou/" + param, String.class);
    }
}
