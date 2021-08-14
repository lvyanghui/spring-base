package com.lv.study.service;

import com.lv.study.bean.User;

import java.util.List;

/**
 * Created by lvyanghui on 2018/7/14.
 */
public interface UserService {
    List<User> getAllUsers();
    int addUser(User user);
    List<User> getUserByName(String name);
    int updateUserById(String password,int id);
}
