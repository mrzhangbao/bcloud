package com.paulson.feign.api.user.hystrix;

import com.paulson.feign.api.user.UserFeignServiceApi;
import org.springframework.stereotype.Component;

@Component
public class UserFeignServiceHystrix implements UserFeignServiceApi{
    @Override
    public String getUserName() {
        return "sorry userService error!!!";
    }
}
