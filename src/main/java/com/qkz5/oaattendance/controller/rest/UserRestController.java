//package com.qkz5.oaattendance.controller.rest;
//
//import java.util.List;
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.AuthenticationException;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.subject.Subject;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//import com.slkj.autocode.entity.ServiceResult;
//import com.qkz5.oaattendance.criteria.UserCriteria;
//import com.qkz5.oaattendance.entity.mojo.UserAO;
//import com.qkz5.oaattendance.entity.pojo.User;
//import com.qkz5.oaattendance.service.IUserService;
//import com.qkz5.oaattendance.util.MD5Util;
//import com.wordnik.swagger.annotations.ApiOperation;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiImplicitParam;
//import io.swagger.annotations.ApiImplicitParams;
//import io.swagger.annotations.ApiResponse;
//import io.swagger.annotations.ApiResponses;
//
///**
// *
// * @author sunny Yang
// * @date 2018-10-24
// * @discribe
// * 商家用户相关请求
// *
// */
//@RestController
//@RequestMapping("/merchant/restUser")
//@Api("userController相关api")
//public class UserRestController {
//	private Logger log = LoggerFactory.getLogger(UserRestController.class);
//	@Resource
//	IUserService merchantUserService;
////		@Value("${test.msg}")
////	    private String msg;
//		 @ApiImplicitParams({
//		 @ApiImplicitParam(paramType="header",name="userName",dataType="String",required=true,value="用户名",defaultValue="admin"),
//		 @ApiImplicitParam(paramType="query",name="password",dataType="String",required=true,value="用户的密码",defaultValue="123456")
//		 })
//		 @ApiResponses({
//		 @ApiResponse(code=10001,message="登录账号或者密码错误"),
//		 })
//		 @RequestMapping(value="/loginCheck",method = RequestMethod.POST)
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
//
//
//}