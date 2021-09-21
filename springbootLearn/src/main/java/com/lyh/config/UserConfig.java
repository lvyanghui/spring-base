package com.lyh.config;

import com.lyh.entity.UserSpring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lvyanghui
 * 2021/9/14 22:23
 */
@Configuration
public class UserConfig {

    @Bean
    public UserSpring userSpring(){
        return new UserSpring();
    }
}
