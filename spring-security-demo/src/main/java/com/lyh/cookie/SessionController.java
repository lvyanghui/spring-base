package com.lyh.cookie;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by lvyanghui
 * 2020/3/14 13:55
 */
@RestController
public class SessionController {

    @RequestMapping("/loginSession")
    public String loginSession(HttpServletRequest request, HttpServletResponse response, @RequestParam String name, @RequestParam String password){

        if(name.equals("lvyanghui") && password.equals("123456")) {
            HttpSession session = request.getSession();
            session.setAttribute("username",name);
            session.setMaxInactiveInterval(60);
            return name + " login success!";
        }

        if(name.equals("lvsuiping") && password.equals("987654")) {
            HttpSession session = request.getSession();
            session.setAttribute("username",name);
            session.setMaxInactiveInterval(60);
            return  name + " login success!";
        }
        return "login fail!";
    }

    @RequestMapping("/logoutSession")
    public String logoutSession(HttpServletRequest request, HttpServletResponse response, @RequestParam String name){

        if(name.equals("lvyanghui")){
            HttpSession session = request.getSession();
            deleteSessionName("username",session);
            return name + " logout success!";
        }

        if(name.equals("lvsuiping")){
            HttpSession session = request.getSession();
            deleteSessionName("username",session);
            return name + " logout success!";
        }
        return "logout fail!";
    }

    private void deleteSessionName(String name,HttpSession session){
        if(null == session){
            return;
        }
        session.removeAttribute(name);
    }
}
