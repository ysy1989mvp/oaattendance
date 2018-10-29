package com.qkz5.oaattendance.config;
			
import java.util.ArrayList;
import java.util.List;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

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
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        logger.info("验证当前Subject时获取到token为：" + token.toString());
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
        return null;
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