package com.hxh.mapper;

import com.hxh.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserDao
 * @Description
 * @Author huxuanhao
 * @Date 2023/11/16 14:42
 */
@Repository
public interface UserDao {
   List<User> getAllUser();
   List<User> getAll();
}