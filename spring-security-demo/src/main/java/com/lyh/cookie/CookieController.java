package com.lyh.cookie;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lvyanghui
 * 2020/3/14 13:55
 */
@RestController
public class CookieController {

    @RequestMapping("/loginCookie")
    public String loginCookie(HttpServletRequest request, HttpServletResponse response, @RequestParam String name, @RequestParam String password){

        if(name.equals("lvyanghui") && password.equals("123456")) {
            Cookie cookie = new Cookie("username", name);
            cookie.setMaxAge(60);
            response.addCookie(cookie);
            return name + " login success!";
        }

        if(name.equals("lvsuiping") && password.equals("987654")) {
            Cookie cookie = new Cookie("username", name);
            cookie.setMaxAge(60);
            response.addCookie(cookie);
            return  name + " login success!";
        }
        return "login fail!";
    }

    @RequestMapping("/logoutCookie")
    public String logoutCookie(HttpServletRequest request, HttpServletResponse response, @RequestParam String name){

        if(name.equals("lvyanghui")){
            Cookie[] cookies = request.getCookies();
            deleteCookieName(name,cookies,response);
            return name + " logout success!";
        }

        if(name.equals("lvsuiping")){
            Cookie[] cookies = request.getCookies();
            deleteCookieName(name,cookies,response);
            return name + " logout success!";
        }
        return "logout fail!";
    }

    private void deleteCookieName(String name,Cookie[] cookies,HttpServletResponse response){
        if(null == cookies){
            return;
        }
        for(Cookie coo : cookies){
            if(coo.getValue().equals(name)){
                Cookie cookie = new Cookie("username", null);
                //cookie.setPath("/");//路径要相同
                cookie.setMaxAge(0);//生命周期设置为0
                response.addCookie(cookie);
            }
        }
    }
}
