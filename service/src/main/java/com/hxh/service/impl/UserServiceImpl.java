package com.hxh.service.impl;

import com.hxh.entity.User;
import com.hxh.mapper.UserDao;
import com.hxh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Author huxuanhao
 * @Date 2023/11/16 14:53
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getAllUser() {
        List<User> allUser = userDao.getAllUser();
        System.out.println(allUser);
        return null;
    }
}