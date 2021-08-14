package com.lv.study.dao;

import com.lv.study.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by lvyanghui on 2018/7/14.
 */
//@Mapper
public interface UserDao {

    @Select("select * from t_user where user_name=#{name}")
    public List<User> getUserByName(String name);


    @Update("update t_user set password=#{password} where user_id=#{id}")
    public int updateUserById(@Param("password") String password, @Param("id") int id);
}
