package com.paulson.feign.api.user;

import com.paulson.feign.api.user.hystrix.UserFeignServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author create by zhangbao  
 * @date 2018/9/13 18:33
 * @desc  
 */  
@FeignClient(value = "user-service",fallback = UserFeignServiceHystrix.class)
public interface UserFeignServiceApi {


    @RequestMapping(value = "/user/current")
    String getUserName();

}
