package com.lv.study.service.impl;

import com.lv.study.bean.User;
import com.lv.study.dao.UserDao;
import com.lv.study.mapper.UserMapper;
import com.lv.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lvyanghui on 2018/7/14.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getAllUsers() {
        return userMapper.selectAllUser();
    }

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    public List<User> getUserByName(String name){
        return userDao.getUserByName(name);
    }


    public int updateUserById(String password,int id){
        return userDao.updateUserById(password,id);
    }
}
