package com.lyh.cookie;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by lvyanghui
 * 2019/2/24 17:20
 */
@RestController
public class HelloController {

    @RequestMapping("/helloCookie")
    public String helloCookie(HttpServletRequest request, HttpServletResponse response){

        Cookie[] cookies = request.getCookies();
        if(verifyCookieName("username",cookies)){
            return "hello cookie!";
        }
        return "please login!";
    }

    private boolean verifyCookieName(String name,Cookie[] cookies){
        boolean status = false;
        if(null == cookies){
            return status;
        }
        for(Cookie cookie : cookies){
            if(cookie.getName().equals(name)){
                String value = cookie.getValue();
                if(null != value){
                    status = true;
                }
            }
        }

        return status;
    }

    @RequestMapping("/helloSession")
    public String helloSession(HttpServletRequest request, HttpServletResponse response){

        HttpSession session = request.getSession();
        if(verifySessionName("username",session)){
            return "hello session!";
        }
        return "please login!";
    }

    private boolean verifySessionName(String name,HttpSession session){
        boolean status = false;
        if(null == session){
            return status;
        }

        String value = (String) session.getAttribute(name);
        if(null != value){
            status = true;
        }
        return status;
    }
}
