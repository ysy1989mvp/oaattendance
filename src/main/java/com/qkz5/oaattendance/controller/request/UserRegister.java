package com.qkz5.oaattendance.controller.request;

import com.qkz5.oaattendance.entity.pojo.EmployeeBasicInformation;
import com.qkz5.oaattendance.service.IEmployeeBasicInformationService;
import com.qkz5.oaattendance.serviceImpl.EmployeeBasicInformationService;
import com.slkj.autocode.entity.ServiceResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
/**
 * Author: caidingnu
 * Date:   2018/11/1
 * Time：  11:09
 * Content:
 */

@Api(value = "员工信息录入请求",description = "员工信息录入")
@Controller
public class UserRegister {
    @Resource
    EmployeeBasicInformationService iEmployeeBasicInformationService;
  @Resource
    EmployeeBasicInformation employeeBasicInformation;

    @ApiOperation(value = "注册",notes = "注册")
    @RequestMapping("/register")
    @ResponseBody
    public int register(EmployeeBasicInformation employeeBasicInformation){

//        System.out.println(password);
//      String password="123456";
//      employeeBasicInformation.setWorkId(5);
//      employeeBasicInformation.setName("李白222");
      String hashAlgorithmName="Md5";
      Object credentials=employeeBasicInformation.getPassword();
      Object salt= ByteSource.Util.bytes(credentials);
      int hashIterations=1023;
       Object pass2=new SimpleHash(hashAlgorithmName, credentials, salt, hashIterations);
       String pass=String.valueOf(pass2);
       employeeBasicInformation.setPassword(pass);
//       String pass3=String.valueOf(pass2);
//           employeeBasicInformation.setPassword(pass3);
//        employeeBasicInformation.setWorkId(workId);
//        employeeBasicInformation.setPassword(password);
        ServiceResult<Integer> result= iEmployeeBasicInformationService.addEmployeeBasicInformation(employeeBasicInformation);
        System.out.println(result.getMsg());



//        ServiceResult o = iEmployeeBasicInformationService.selectById(1);
//       System.out.println(o.getData());

//       查询所有
//        List  x=iEmployeeBasicInformationService.chaxun();
        return result.getCode();
    }

    @RequestMapping("/openlogin")
    public String openlogin(){
        return "login";
    }

}
