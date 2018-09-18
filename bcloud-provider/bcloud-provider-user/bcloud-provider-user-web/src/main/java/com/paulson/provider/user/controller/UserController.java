package com.paulson.provider.user.controller;


import com.paulson.feign.api.user.UserFeignServiceApi;
import com.paulson.provider.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author create by zhangbao
 * @date 2018/9/5 10:09
 * @desc
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserFeignServiceApi userFeignServiceApi;


    @RequestMapping(value = "/currentUser", method = RequestMethod.GET)
    public String getCurrentUser(@RequestParam(name = "name")String name){
        return userService.getCurrentUser(name);
    }

    @RequestMapping(value = "/current/feign", method = RequestMethod.GET)
    public String getCurrentUserPhone(@RequestParam(name = "name")String name){
        return userFeignServiceApi.getUserName();
    }


}
