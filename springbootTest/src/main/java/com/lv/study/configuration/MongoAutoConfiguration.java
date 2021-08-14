package com.lv.study.configuration;

import com.lv.study.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lvyanghui on 2018/7/16.
 */
@Configuration
@ConditionalOnClass(User.class)
@EnableConfigurationProperties(MongoProperties.class)
public class MongoAutoConfiguration {

    //@Autowired
    private MongoProperties mongoProperties;
}
