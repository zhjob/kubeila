package kubeila.employee.shiro;

import com.shrio.dao.service.UserLoginService;
import com.shrio.model.UserLogin;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者：@author zym
 * 创建时间：2019/8/3010:22
 * 创建描述：
 *
 * 修 改 者：  
 * 修改时间： 
 * 修改描述： 
 *
 * 审 核 者：
 * 审核时间：
 * 审核描述：
 *
 */
public class MyRealm extends AuthorizingRealm {


    @Autowired
    private UserLoginService userLoginService;
    /**
     * 进行权限验证
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        //如果身份认证的时候没有传入User对象，这里只能取到userName
        //也就是SimpleAuthenticationInfo构造的时候第一个参数传递需要User对象
        UserLogin user  = (UserLogin)principalCollection.getPrimaryPrincipal();
        authorizationInfo.

        return authorizationInfo;
    }

    /**
     * 身份验证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        UserLogin userLogin = new UserLogin();
        userLogin.setLoginAccount(username);
        if(!StringUtils.isEmpty(username)) {
            userLogin = userLoginService.findByParam(userLogin);
        }
        if (!"javaboy".equals(username)) {
            throw new UnknownAccountException("账户不存在!");
        }
        //Object obj = new SimpleHash("md5", "123", userLogin.getSalt(), 1);
        return new SimpleAuthenticationInfo(username, userLogin.getLoginPwd(), ByteSource.Util.bytes(userLogin.getSalt()), getName());
    }
}
