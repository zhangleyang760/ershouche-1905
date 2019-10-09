package com.qf.controller;

import com.qf.domain.Car;
import com.qf.domain.Seller;
import com.qf.service.SellerService;
import org.apache.shiro.SecurityUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class sellercontroller {
    @Resource
    SellerService sellerService;

    @RequestMapping("/findSeller")
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

    @RequestMapping("/findBySellerName")
    public List findBySellerName() {
        String loginname=(String)SecurityUtils.getSubject().getPrincipal();
        return sellerService.findBySellerName(loginname);
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
    //    @RequestMapping("/upload")
////    public void upload(@RequestParam("cname")String cname, @RequestParam("brand")String brand, @RequestParam("miaoshu")String miaoshu, @RequestParam("ctype")String ctype, @RequestParam("price")double price, @RequestParam("cyear")String cyear, @RequestParam("mileage")String mileage, @RequestParam("color")String color, @RequestParam("pic")MultipartFile pic){
////        sellerService.upload(cname,brand,ctype,cyear,miaoshu,mileage,price,color,pic);
////    }
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public void upload(@RequestBody Car car){
        sellerService.upload(car);
    }
//    @RequestMapping("/uploadPic")
//    public void uploadPic(@RequestParam("pic")MultipartFile file,@RequestParam("cname")String cname,@RequestParam("brand")String brand){
//        sellerService.upload();
//    }


}
