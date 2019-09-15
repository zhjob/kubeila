package kubeila.employee.controller;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestShiro {


    @RequestMapping("/admin")
    @RequiresRoles({"admin"})
    public String testAdmin(){
        return "/authc/admin.html";
    }
    @RequestMapping("/user")
    @RequiresRoles({"user"})
    public String testUser(){
        return "/authc/user.html";
    }
}
