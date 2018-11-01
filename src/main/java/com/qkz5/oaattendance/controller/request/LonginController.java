//package com.qkz5.oaattendance.controller.request;
//
//import com.qkz5.oaattendance.util.MD5Util;
//import com.slkj.autocode.entity.ServiceResult;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.IncorrectCredentialsException;
//import org.apache.shiro.authc.UnknownAccountException;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.subject.Subject;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
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
//    @RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
//    public Object pcDoLogin(Model model, User user,
//                            HttpServletRequest request, HttpServletResponse response) {
//        LOG.info("有访问来自，IP: %s USER-AGENT: %s", request.getRemoteAddr(),
//                request.getHeader("user-agent"));
//        LOG.info("SessionId %s", request.getSession().getId());
//        String sessionId = request.getSession().getId();
//        ServiceResult<Object> ret = new ServiceResult<Object>();
//        String pwd = MD5Util.MD5Encode(user.getPassword());
//        UsernamePasswordToken passwordToken = new UsernamePasswordToken(
//                user.getAccount(), pwd);
//        model.addAttribute("user", user);
//        // 使用shiro的SecurityUtils获取主题对象
//        Subject subject = SecurityUtils.getSubject();
//        try {
//            // 验证用户名和密码
//            /**
//             * 如果没有抛出异常，则说明用户名和密码输入正确，将用户名和密码存放到Session中
//             * 如果抛出异常，则说明用户名和密码输入错误，这就是shiro的认证机制
//             */
//            subject.login(passwordToken);
//            // 希望将用户的信息保存到Session
//            ServiceResult<UserAO> retUser =userService.getUserAoInfo( (UserAO) subject.getPrincipal());
//            if(retUser.isSucceed()){
//                ServiceResult<Boolean> sr = sessionService.set(Constant.SESSION_PC_USER.concat(retUser.getData().getCode()), retUser.getData());
//                if(sr.isSucceed()){
//                    ret.setSucceed(true);
//                    ret.setCode(0);
//                    ret.setMsg("登录成功");
//                    CookieUtil util=new CookieUtil(request,response,-1);
//                    util.addCookie(Constant.SESSION_PC_USER, retUser.getData().getCode());
//                }else{
//                    ret.setSucceed(false);
//                    ret.setCode(0);
//                    ret.setMsg("登录失败");
//                }
//            }else{
//                ret.setSucceed(false);
//                ret.setCode(0);
//                ret.setMsg(retUser.getMsg());
//            }
//            return ret;
//        } catch (UnknownAccountException e) {// 账号不存在异常
//            ret.setSucceed(false);
//            ret.setCode(0);
//            ret.setMsg("账号不存在");
//            return ret;
//        } catch (IncorrectCredentialsException e) {// 密码错误异常
//            ret.setSucceed(false);
//            ret.setCode(0);
//            ret.setMsg("密码错误！");
//            return ret;
//        } catch (AuthenticationException e) {
//            ret.setSucceed(false);
//            ret.setCode(0);
//            ret.setMsg("用户禁用!");
//            return ret;
//        }
//    }
//
//}
