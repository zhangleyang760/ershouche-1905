package com.qf.controller;


import com.qf.domain.Seller;
import com.qf.service.SellerService;
import org.apache.shiro.SecurityUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RealinnfoController {
    @Resource
    SellerService sellerService;
    @RequestMapping("/srealinfo")
    public void updateseller(@RequestBody Seller seller){
        //System.out.println("卖调用了");
        String loginname=(String)SecurityUtils.getSubject().getPrincipal();
        Seller bySellerName = sellerService.findBySellerName(loginname);
        seller.setUsername(bySellerName.getUsername());
        seller.setPassword(bySellerName.getPassword());
        seller.setEmail(bySellerName.getEmail());
        seller.setSid(bySellerName.getSid());
        seller.setIfseller(1);
        sellerService.update(seller);
    }
    @RequestMapping("/crealinfo")
    public void updatecustomer(@RequestBody Seller seller){
        System.out.println("买调用了");
        String loginname=(String)SecurityUtils.getSubject().getPrincipal();
        Seller bySellerName = sellerService.findBySellerName(loginname);
        seller.setUsername(bySellerName.getUsername());
        seller.setPassword(bySellerName.getPassword());
        seller.setEmail(bySellerName.getEmail());
        seller.setSid(bySellerName.getSid());
        seller.setIfseller(1);
        sellerService.update(seller);
    }
}
