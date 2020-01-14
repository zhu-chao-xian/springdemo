package com.study.demo.sevice.impl;


import com.study.demo.mapper.UserInfoMapper;
import com.study.demo.pojo.UserInfo;
import com.study.demo.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserById(Integer id) {
        return userInfoMapper.getUserById(id);
    }
}
