package com.qf.controller;

import com.qf.domain.Seller;
import com.qf.service.SellerService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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

    @RequestMapping("/findCustomer")
    public List findcustomer(){
        return sellerService.findCustomer();
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
    @RequestMapping("/upload")
    public void upload(@RequestParam("cname")String cname, @RequestParam("brand")String brand, @RequestParam("miaoshu")String miaoshu, @RequestParam("ctype")String ctype, @RequestParam("price")double price, @RequestParam("cyear")String cyear, @RequestParam("mileage")String mileage, @RequestParam("color")String color, @RequestParam("pic")MultipartFile pic){
        sellerService.upload(cname,brand,ctype,cyear,miaoshu,mileage,price,color,pic);
    }

}
