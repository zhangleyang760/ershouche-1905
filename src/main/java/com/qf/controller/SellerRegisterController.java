package com.qf.controller;


import com.qf.domain.Code;
import com.qf.domain.Customer;
import com.qf.domain.Seller;
import com.qf.service.RegisterService;
import com.qf.utils.EmailUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SellerRegisterController {
    @Autowired
    private EmailUtils emailUtils;
    @Autowired
private RegisterService registerService;
    @RequestMapping("/sendEmail")
public String sendEmail(@RequestBody Code userCode){

        //System.out.println(userCode);
        String s = emailUtils.sendEmail(userCode.getEmail());
            if (s!=null&&s!=""){
                return "发送成功";
            }else {
                return "";
            }
    }
    @RequestMapping("/sellerregister")
    public String sellerregister(@RequestBody Seller seller){
        //System.out.println(usersLogin);
        String code = registerService.getCode(seller.getEmail());
        if (code.equals(seller.getCode())){
            registerService.addSellerAdmin(seller);
                    return "注册成功";
        }
        return null;
    }
    @RequestMapping("/customerregister")
    public String customerregister(@RequestBody Customer customer){
        //System.out.println(usersLogin);
        String code = registerService.getCode(customer.getEmail());
        if (code.equals(customer.getCode())){
            registerService.addCustomerAdmin(customer);
            return "注册成功";
        }
        return null;
    }
}

