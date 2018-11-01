package com.qkz5.oaattendance.config;

import java.util.ArrayList;
import java.util.List;

import com.qkz5.oaattendance.criteria.EmployeeBasicInformationCriteria;
import com.qkz5.oaattendance.entity.mojo.EmployeeBasicInformationAO;
import com.qkz5.oaattendance.entity.pojo.EmployeeBasicInformation;
import com.qkz5.oaattendance.service.IEmployeeBasicInformationService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.annotation.Resources;

public class ShiroRealm extends AuthorizingRealm {

    private Logger logger = LoggerFactory.getLogger(ShiroRealm.class);

    //一般这里都写的是servic，我省略了service的接口和实现方法直接调用的dao
//    @Autowired
//    private MerchantUserDAO merchantUserDAO;

    /**
     * 登录认证
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Resource
    IEmployeeBasicInformationService iEmployeeBasicInformationService;


    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        logger.info("验证当前Subject时获取到token为：" + token.toString());

        //1. 把 AuthenticationToken 转换为 UsernamePasswordToken
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;

        //2. 从 UsernamePasswordToken 中来获取 username
        String telephoneNum = upToken.getUsername();

        //3. 调用数据库的方法, 从数据库中查询 username 对应的用户记录
        System.out.println("从数据库中获取 username: " + telephoneNum + " 所对应的用户信息.");
        EmployeeBasicInformationCriteria employeeBasicInformationCriteria = new EmployeeBasicInformationCriteria();
        employeeBasicInformationCriteria.andTelephoneEquals(telephoneNum);
        //通过手机号查询
        List<EmployeeBasicInformationAO> employeeBasicInformationAOList = iEmployeeBasicInformationService.selectByCriteria(employeeBasicInformationCriteria).getData();
        logger.info("查询到的用户：" + employeeBasicInformationAOList.toString());
        if (employeeBasicInformationAOList.size() == 1) {
            EmployeeBasicInformationAO employeeBasicInformationAO = employeeBasicInformationAOList.get(0);
            // 若存在，将此用户存放到登录认证info中，无需自己做密码对比，Shiro会为我们进行密码对比校验
            return new SimpleAuthenticationInfo(employeeBasicInformationAO, employeeBasicInformationAO.getPassword(), getName());
        }else {
            //4. 若用户不存在, 则可以抛出 UnknownAccountException 异常
            throw new UnknownAccountException("用户不存在!");
        }
/*        //4. 若用户不存在, 则可以抛出 UnknownAccountException 异常
        if("unknown".equals(telephoneNum)){
            throw new UnknownAccountException("用户不存在!");
        }

        //5. 根据用户信息的情况, 决定是否需要抛出其他的 AuthenticationException 异常.
        if("monster".equals(telephoneNum)){
            throw new LockedAccountException("用户被锁定");
        }

        //6. 根据用户的情况, 来构建 AuthenticationInfo 对象并返回. 通常使用的实现类为: SimpleAuthenticationInfo
        //以下信息是从数据库中获取的.
        //1). principal: 认证的实体信息. 可以是 username, 也可以是数据表对应的用户的实体类对象.
        Object principal = telephoneNum;
        //2). credentials: 密码.
        Object credentials = null; //"fc1709d0a95a6be30bc5926fdb7f22f4";
        if("admin".equals(telephoneNum)){
            credentials = "038bdaf98f2037b31f1e75b5b4c9b26e";
        }else if("user".equals(telephoneNum)){
            credentials = "098d2c478e9c11555ce2823231e02ec1";
        }

        //3). realmName: 当前 realm 对象的 name. 调用父类的 getName() 方法即可
        String realmName = getName();
        //4). 盐值.
        ByteSource credentialsSalt = ByteSource.Util.bytes(telephoneNum);

        SimpleAuthenticationInfo info = null; //new SimpleAuthenticationInfo(principal, credentials, realmName);
        info = new SimpleAuthenticationInfo(principal, credentials, credentialsSalt, realmName);
        return info;*/


//        MerchantUserCriteria userCriteria = new MerchantUserCriteria();
//        userCriteria.merchantUserNameEquals(token.getUsername());
//        //查出是否有此用户
//        List<MerchantUser> merchantUsers = merchantUserDAO.selectByCriteria(userCriteria);
//        logger.info("查询到的用户："+merchantUsers.toString());
//        if(merchantUsers.size()==1){
//        	MerchantUser hasUser = merchantUsers.get(0);
//         // 若存在，将此用户存放到登录认证info中，无需自己做密码对比，Shiro会为我们进行密码对比校验
//            return new SimpleAuthenticationInfo(hasUser, hasUser.getMerchantPassword(), getName());
//        }
        //return null;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    /**
     * 权限认证
     *
     * @param principalCollection
     * @return
     */


}