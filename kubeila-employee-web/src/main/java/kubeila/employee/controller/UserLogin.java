package kubeila.employee.controller;

import kubeila.employee.entity.SysUsers;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserLogin {

    @RequestMapping(value = "/userlogin")
    public String submitLogin(SysUsers sysUsers, HttpServletRequest request) {
        try {
            UsernamePasswordToken token = new UsernamePasswordToken(sysUsers.getUsername(), sysUsers.getPassword());
            Subject subject = SecurityUtils.getSubject();
            subject.login(token);
            SecurityUtils.getSubject().getSession().setTimeout(180);
        } catch (UnknownAccountException e) {
            return "/login.html";
        } catch (IncorrectCredentialsException e) {
            return "/login.html";
        } catch (LockedAccountException e) {
            return "/login.html";
        } catch (AuthenticationException e) {
            return "/login.html";
        }

        // 执行到这里说明用户已登录成功
        return "/authc/index.html";
    }


    @RequestMapping(value = "/unauth", method = RequestMethod.GET)
    public String loginPage() {
        return "/unauth.html";
    }


    //被踢出后跳转的页面
    @RequestMapping(value = "/loginout", method = RequestMethod.GET)
    public String loginout( Model model) {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        model.addAttribute("msg","安全退出！");
        return "/login.html";


    }

}
