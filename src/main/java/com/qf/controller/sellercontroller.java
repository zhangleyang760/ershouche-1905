package com.qf.controller;

import com.qf.domain.Seller;
import com.qf.service.SellerService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class sellercontroller {
    @Resource
    SellerService sellerService;

    @RequestMapping("/findseller")
    public List findseller(){
        return  sellerService.findSeller();
    }

    @RequestMapping("/findBySellerId")
    public Seller findBySeller(@RequestBody Seller seller){
        return sellerService.findById(seller);
    }

    @RequestMapping("/updateSeller")
    public Seller update(@RequestBody Seller seller){
        return  sellerService.update(seller);
    }

    @RequestMapping("/deleteSeller")
    public void delete(@RequestBody Seller seller){
        int sid=seller.getSid();
        sellerService.deleteSeller(sid);
    }

}
