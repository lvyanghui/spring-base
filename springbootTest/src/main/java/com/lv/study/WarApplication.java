package com.lv.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by lvyanghui on 2018/7/11.
 */
//@EnableEurekaClient
//@EnableDiscoveryClient
@SpringBootApplication
//@MapperScan("com.lv.study.mapper")
public class WarApplication {

    // 类成员属性注入方式
    /*@Autowired
    @Qualifier("ds1")
    private DataSource dataSource1;

    @Resource(name = "ds2")
    private DataSource dataSource2;*/


    public static void main(String[] args){
        SpringApplication.run(WarApplication.class,args);
    }
}
