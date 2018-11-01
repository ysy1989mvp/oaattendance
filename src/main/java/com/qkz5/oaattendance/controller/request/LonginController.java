package com.qkz5.oaattendance.controller.request;

import com.qkz5.oaattendance.util.MD5Util;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Author: WeiRunfeng
 * Date:   2018/11/1
 * Time：  11:09
 * Content:
 */
@Controller
@RequestMapping(value = "/login")
public class LonginController {
    private static Logger LOG = LoggerFactory.getLogger(LonginController.class);
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password  , HttpServletRequest request, HttpServletResponse response){
        //1.获取当前对象
        Subject currentUser = SecurityUtils.getSubject();

        if (!currentUser.isAuthenticated()) {
            // 把用户名和密码封装为 UsernamePasswordToken 对象
            password = MD5Util.MD5Encode(password);
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            // rememberme
            token.setRememberMe(true);
            try {
                System.out.println("1. " + token.hashCode());
                // 执行登录.
                currentUser.login(token);
            }
            // ... catch more exceptions here (maybe custom ones specific to your application?
            // 所有认证时异常的父类.
            catch (AuthenticationException ae) {
                //unexpected condition?  error?
                System.out.println("登录失败: " + ae.getMessage());
            }
        }




       return "login";
    }


//    @RequestMapping(value="/loginCheck",method = RequestMethod.POST)
//		 @ApiOperation(value = "用户登录验证请求",httpMethod ="POST", response = String.class,notes = "loginCheck")
//		 @ResponseBody
//		 public ServiceResult<User> loginCheck(@RequestHeader("userName") String userName, @RequestParam("password") String password
//				 ,HttpServletRequest request,HttpServletResponse response) {
//			 ServiceResult<User> serviceResult = new ServiceResult<User>();
////			 获取sessionid，登录成功后用于在缓存中存储用户信息
//			 String sessionId = request.getSession().getId();
//			 //首先对密码加严
//			 password = MD5Util.MD5Encode(password);
//			 UsernamePasswordToken passwordToken = new UsernamePasswordToken(userName, password);
//			 Subject subject = SecurityUtils.getSubject();
//			 try{
//				 subject.login(passwordToken);
//			 }catch(AuthenticationException e){
//				serviceResult.setCode(10001);
//				serviceResult.setMsg("账号或密码错误！");
//				serviceResult.setSucceed(true);
//				serviceResult.setData(null);
//				return serviceResult;
//			 }
//			 UserCriteria criteria = new UserCriteria();
//			 criteria.merchantUserNameEquals(userName);
//			 ServiceResult<List<User>> result = merchantUserService.selectByCriteria(criteria);
//			 User resultEntity = result.getData().get(0);
//			 HttpSession session = request.getSession();
//			 //判断内存中是否存在该对象，如果存在删除内存中的对象则先移除内存中的对象
//			 if(session.getAttribute(resultEntity.getUserNo())!=null){
//				 String sessionOldId = (String)session.getAttribute(resultEntity.getUserNo()+"_id");
//				 session.removeAttribute(sessionOldId);
//				 session.removeAttribute(resultEntity.getUserNo()+"_id");
//			 }
//			 session.setAttribute(sessionId, resultEntity);
//			 session.setAttribute(resultEntity.getUserNo()+"_id",sessionId);
//			 UserAO merchantUserAO = (UserAO) resultEntity;
////			 merchantUserAO.setToken(sessionId);
//			 serviceResult.setData(merchantUserAO);
//			 serviceResult.setCode(200);
//			 serviceResult.setMsg("登录验证成功！");
//			 serviceResult.setSucceed(true);
//		 return serviceResult;
//		 }

}
