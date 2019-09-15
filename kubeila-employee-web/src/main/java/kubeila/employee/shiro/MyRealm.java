package kubeila.employee.shiro;

import kubeila.employee.entity.SysUsers;
import kubeila.employee.entity.SysUsersExample;
import kubeila.employee.entity.SysUsersRoles;
import kubeila.employee.entity.SysUsersRolesExample;
import kubeila.employee.service.SysUsersRolesService;
import kubeila.employee.service.SysUsersService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.List;

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
    private SysUsersService sysUsersService;

    @Autowired
    private SysUsersRolesService sysUsersRolesService;
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
        String username = (String) principalCollection.getPrimaryPrincipal();
        SysUsersRoles param = new SysUsersRoles();
        if("admin".equals(username)){
            param.setUserId(1L);
        }else{
            param.setUserId(2L);
        }

         List<SysUsersRoles> list = sysUsersRolesService.selectUserstoRole(param);
         for(SysUsersRoles sysUsersRoles : list){
             authorizationInfo.addRole(sysUsersRoles.getRolename());
         }
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
        SysUsersExample example = new SysUsersExample();
        SysUsersExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<SysUsers> list =  sysUsersService.selectByExample(example);
        if(list.size()!=1){
            throw new UnknownAccountException("账户异常!");
        }
        SysUsers userLogin = list.get(0);
        Object obj = new SimpleHash("md5", "123", userLogin.getSalt(), 1);
        return new SimpleAuthenticationInfo(username, userLogin.getPassword(), null, getName());
    }
}
