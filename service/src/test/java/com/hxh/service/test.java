package com.hxh.service;

import com.hxh.entity.User;
import com.hxh.mapper.UserDao;
import com.hxh.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName test
 * @Description
 * @Author huxuanhao
 * @Date 2023/11/16 15:14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-dao.xml","classpath:spring-service.xml" }) // 指定Spring配置文件的位置
public class test {
    @Autowired
    private UserServiceImpl userService;
    //@Autowired
    //private UserDao userDao;
    @Test
    public void t(){
        List<User> allUser = userService.getAllUser();
    }
}