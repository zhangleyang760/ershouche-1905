package com.qf.controller;



import com.qf.domain.Seller;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {
    @RequiresAuthentication
    @RequestMapping("/checkLogin")
    public String userInfo(){
        return "成功";
    }

    @RequestMapping("/login")
    public String login(@RequestBody Seller seller){
    System.out.println(seller);
    try {
        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(seller.getUsername(),seller.getPassword());
        subject.login(token);
        if (subject.isAuthenticated()){
            return seller.getUsername();
        }
    }catch (Exception e){
        e.printStackTrace();
        System.out.println("登录失败");
    }
    return null;
}
    @RequestMapping("/loginout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "退出成功";
    }


}
