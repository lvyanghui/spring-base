package com.lv.study.controller;

import com.lv.study.bean.User;
import com.lv.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lvyanghui on 2018/7/14.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public int addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @RequestMapping("/getall")
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }

    @RequestMapping("/getUserByName")
    public List<User> getUserByName(@RequestParam String name){
        return userService.getUserByName(name);
    }

    @RequestMapping("/updateUserById/password/{password}/id/{id}")
    public int updateUserById(@PathVariable String password,@PathVariable int id){
        return userService.updateUserById(password,id);
    }
}
