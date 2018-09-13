package com.paulson.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author create by zhangbao  
 * @date 2018/9/13 17:14
 * @desc  
 */  
@EnableEurekaServer
@SpringBootApplication
public class BcloudDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BcloudDiscoveryApplication.class, args);
	}
}
