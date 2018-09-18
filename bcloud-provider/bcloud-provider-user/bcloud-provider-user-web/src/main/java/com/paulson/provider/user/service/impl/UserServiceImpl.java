package com.paulson.provider.user.service.impl;

import com.paulson.provider.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author create by zhangbao  
 * @date 2018/9/5 10:04
 * @desc  
 */  
@Service
public class UserServiceImpl implements UserService {


    @Override
    public String getCurrentUser(String name) {
        return "UserService Server From Name:" + name;
    }
}
