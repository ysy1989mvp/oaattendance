//package com.qkz5.oaattendance.controller.request;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//@RequestMapping(value = "/merchant/requestUser")
//public class UserRestController {
//	private static Logger LOG = LoggerFactory.getLogger(UserRestController.class);
//
//	@RequestMapping(value = "/showform/{id}", method = { RequestMethod.GET, RequestMethod.POST })
//    public String showform(@PathVariable String id , Model model, HttpServletRequest request) {
//    	LOG.info("有访问来自，IP: %s USER-AGENT: %s", request.getRemoteAddr(), request.getHeader("user-agent"));
//    	LOG.info("SessionId %s", request.getSession().getId());
//    	//将当前时间传到前端
////    	model.addAttribute("currentTime", DateTimeUtils.formateDateToStr(new Date(),DateTimeUtils.FORMAT_YMD_HMS));
//    	//将当前运用名称传到前端
//
//    	model.addAttribute("articleColumnGroupAO", "放个对象在这里");
//
//    	return "跳转的页面路径";
//    }
//
//	@RequestMapping(value = "/toLogin", method = { RequestMethod.GET, RequestMethod.POST })
//    public ModelAndView showform(ModelAndView mv,HttpServletRequest request,HttpServletResponse response) {
////    	LOG.info("有登录访问来自，IP: %s USER-AGENT: %s", request.getRemoteAddr(), request.getHeader("user-agent"));
////    	LOG.info("SessionId %s", request.getSession().getId());
//		System.out.println("请求已经进入登录，开始跳转页面");
//    	mv.setViewName("../../login");
//    	return mv;
//    }
//
//	@RequestMapping("/")
//	public String index() {
//		System.out.println("请求已经进入登录，开始跳转页面");
//		return "login";
//	}
//
//	@RequestMapping("/test")
//	public String test() {
//		System.out.println("test");
//		return "test";
//	}
//
//}
