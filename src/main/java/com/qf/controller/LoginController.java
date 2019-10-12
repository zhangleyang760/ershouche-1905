package com.qf.controller;



import com.qf.domain.Seller;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


@RestController
public class LoginController {
    @RequiresAuthentication
    @RequestMapping("/checkLogin")
    public String userInfo(){
        return "成功";
    }

    @RequestMapping("/login")
    public String login(@RequestBody Seller seller,HttpSession session){
        String username=seller.getUsername();
        String password=seller.getPassword();
        if(username!=""&&username!=null&&password!=""&&password!=null) {
            System.out.println(seller);
            try {
                Subject subject = SecurityUtils.getSubject();
                UsernamePasswordToken token = new UsernamePasswordToken(seller.getUsername(), seller.getPassword());
                subject.login(token);
                if (subject.isAuthenticated()) {
                    session.setAttribute("username",username);
                    return seller.getUsername();
                } else {
                    return null;
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("登录失败");
            }
        }
    return "值不能为空";
}
    /**
     *
     * @param session
     * @return获取用户名
     */
    @RequestMapping(value = "/getUserSession",method = RequestMethod.POST)
    public String getUserSession(HttpSession session){
        return (String)session.getAttribute("username");
    }
    @RequestMapping("/loginout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "退出成功";
    }


}
