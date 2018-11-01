//package com.qkz5.oaattendance.controller.request;
//
//import com.qkz5.oaattendance.entity.pojo.EmployeeBasicInformation;
//import com.qkz5.oaattendance.service.IEmployeeBasicInformationService;
//import com.qkz5.oaattendance.serviceImpl.EmployeeBasicInformationService;
//import com.slkj.autocode.entity.ServiceResult;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.omg.CORBA.Object;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.annotation.Resource;
//import java.util.List;
//
//
///**
// * Author: caidingnu
// * Date:   2018/11/1
// * Time：  11:09
// * Content:
// */
//
//@Api(value = "员工信息录入请求",description = "员工信息录入")
//@Controller
//public class UserRegister {
//    @Resource
//    EmployeeBasicInformationService iEmployeeBasicInformationService;
//  @Resource
//    EmployeeBasicInformation employeeBasicInformation;
//
//    @ApiOperation(value = "注册",notes = "注册")
//    @RequestMapping("/register")
//    @ResponseBody
//    public List register(){
//      employeeBasicInformation.setWorkId(2222);
//      employeeBasicInformation.setName("李白");
////        ServiceResult<Integer> result= iEmployeeBasicInformationService.addEmployeeBasicInformation(employeeBasicInformation);
//        ServiceResult o = iEmployeeBasicInformationService.selectById(1);
//       System.out.println(o.getData());
//
////       查询所有
//        List  x=iEmployeeBasicInformationService.chaxun();
//        return x;
//    }
//
//}
