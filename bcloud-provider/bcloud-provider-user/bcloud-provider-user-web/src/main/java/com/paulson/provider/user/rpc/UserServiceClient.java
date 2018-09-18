package com.paulson.provider.user.rpc;


import com.paulson.feign.api.user.UserFeignServiceApi;
import com.paulson.provider.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author create by zhangbao  
 * @date 2018/9/5 10:55
 * @desc  
 */
@RefreshScope
@RestController
public class UserServiceClient implements UserFeignServiceApi {

    @Autowired
    private UserService userService;
    
    
    @Override
    public String getUserName() {
        return userService.getCurrentUser("zhang") + ",Phone:15766665555 from UserFeignService" ;
    }

}
