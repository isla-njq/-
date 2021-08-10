package com.mall.Impl;/*
    @author Administrator
    @create 2021-07-14 18:29
*/

import com.mall.Mapper.UserMapper;
import com.mall.Service.IUserService;
import com.mall.entity.Users;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public Users adminLogin(Users users) {
        return userMapper.find(users);
    }
}
