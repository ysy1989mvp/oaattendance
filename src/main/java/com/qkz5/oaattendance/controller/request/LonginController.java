//package com.qkz5.oaattendance.controller.request;
//
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.AuthenticationException;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.subject.Subject;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Author: WeiRunfeng
// * Date:   2018/11/1
// * Time：  11:09
// * Content:
// */
//@Controller
//@RequestMapping(value = "/login")
//public class LonginController {
//    private static Logger LOG = LoggerFactory.getLogger(LonginController.class);
//    @RequestMapping("/login")
//    public String login(@RequestParam("username") String username,
//                        @RequestParam("password") String password  , HttpServletRequest request, HttpServletResponse response){
//        //1.获取当前对象
//        Subject currentUser = SecurityUtils.getSubject();
//
//        if (!currentUser.isAuthenticated()) {
//            // 把用户名和密码封装为 UsernamePasswordToken 对象
//            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
//            // rememberme
//            token.setRememberMe(true);
//            try {
//                System.out.println("1. " + token.hashCode());
//                // 执行登录.
//                currentUser.login(token);
//            }
//            // ... catch more exceptions here (maybe custom ones specific to your application?
//            // 所有认证时异常的父类.
//            catch (AuthenticationException ae) {
//                //unexpected condition?  error?
//                System.out.println("登录失败: " + ae.getMessage());
//            }
//        }
//
//
//
//
//       return "login";
//    }
//
//}
