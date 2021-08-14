package com.lv.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Created by lvyanghui on 2018/7/16.
 */
//@Configuration
public class MyWebAppConfigurer implements EnvironmentAware{

    private static final Logger logger = LoggerFactory.getLogger(MyWebAppConfigurer.class);

    @Autowired
    private Environment env;

    //@Value("${spring.datasource.url}")
    private String myUrl;
    @Override
    public void setEnvironment(Environment env) {

        logger.info(env.getProperty("JAVA_HOME"));
        logger.info(myUrl);

        String url = env.getProperty("pring.datasource.url");
        logger.info(url);

    }
}
