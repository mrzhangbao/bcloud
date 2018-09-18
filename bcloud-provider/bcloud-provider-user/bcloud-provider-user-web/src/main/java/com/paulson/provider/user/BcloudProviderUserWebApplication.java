package com.paulson.provider.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author create by zhangbao  
 * @date 2018/9/14 10:52
 * @desc  
 */  
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableEurekaClient
@EnableHystrix
public class BcloudProviderUserWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BcloudProviderUserWebApplication.class, args);
	}
}
