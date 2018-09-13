package com.paulson.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author create by zhangbao
 * @date 2018/9/13 17:36
 * @desc  网关
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableHystrix
@RefreshScope
public class BcloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BcloudGatewayApplication.class, args);
	}
}
