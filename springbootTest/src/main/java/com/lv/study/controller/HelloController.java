package com.lv.study.controller;

import com.lv.study.dao.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by lvyanghui on 2018/7/11.
 */
@RestController
@RequestMapping("/springboot")
public class HelloController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String Hello(){
        return "hello springboot" + discoveryClient.getServices();
    }
    @RequestMapping("/users")
    public List<MyUser> getUsers(){

        List<MyUser> userList = new ArrayList<MyUser>();
        MyUser user = null;
        for (int i = 0; i < 5; i++) {
            user = new MyUser();
            user.setName("andy" + i);
            user.setAddress("深圳" + i);
            user.setAge(i+10);
            userList.add(user);
        }
        return userList;
    }

    @RequestMapping("/postUsers")
    public List<MyUser> getUsersId(@RequestBody MyUser user){

        List<MyUser> userList = new ArrayList<MyUser>();
        for (int i = 0; i < 5; i++) {
            MyUser myUser = new MyUser();
            myUser.setName(user.getName() + i);
            myUser.setAddress(user.getAddress() + i);
            myUser.setAge(i+10);
            userList.add(myUser);
        }
        return userList;
    }
}
