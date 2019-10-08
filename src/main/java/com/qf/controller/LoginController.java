package com.qf.controller;



import com.qf.domain.Seller;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {
@RequestMapping("/login")
    public String login(@RequestBody Seller seller){
    //System.out.println(usersLogin);
    try {
        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(seller.getUsername(),seller.getPassword());
        subject.login(token);
        if (subject.isAuthenticated()){
            return "登录成功";
        }
    }catch (Exception e){
        e.printStackTrace();
        System.out.println("登录失败");
    }
    return null;
}

}
