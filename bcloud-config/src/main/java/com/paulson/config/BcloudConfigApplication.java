package com.paulson.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author create by zhangbao  
 * @date 2018/9/13 17:23
 * @desc  配置中心
 */  
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
@EnableEurekaClient
public class BcloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(BcloudConfigApplication.class, args);
	}
}
