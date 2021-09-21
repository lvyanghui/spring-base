package com.lyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by lvyanghui
 * 2019/2/24 17:19
 */
@SpringBootApplication
public class JarApp {
    public static void main(String[] args) {
        SpringApplication.run(JarApp.class,args);

        Object o = null;

        try{
            System.out.println("ClassLoader.getSystemClassLoader():" + ClassLoader.getSystemClassLoader());
            //System.out.println("ClassLoader.getSystemClassLoader():" + SpringContextHolder);
            System.out.println("ClassLoader.getSystemClassLoader():" + ClassLoader.getSystemClassLoader());
            System.out.println("ClassLoader.getSystemClassLoader():" + ClassLoader.getSystemClassLoader());
            System.out.println("ClassLoader.getSystemClassLoader():" + ClassLoader.getSystemClassLoader());
            System.out.println("ClassLoader.getSystemClassLoader():" + ClassLoader.getSystemClassLoader());
            System.out.println("ClassLoader.getSystemClassLoader():" + ClassLoader.getSystemClassLoader());
            System.out.println("ClassLoader.getSystemClassLoader():" + ClassLoader.getSystemClassLoader());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
