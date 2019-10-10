package com.qf.controller;

import com.qf.domain.Car;
import com.qf.domain.Seller;
import com.qf.service.SellerService;
import com.qf.utils.UploadUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class sellercontroller {
    @Resource
    SellerService sellerService;
    @Autowired
    private UploadUtils uploadUtils;

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
        System.out.println(sellerService.findById(seller));
        return sellerService.findById(seller);
    }

    @RequestMapping("/findBySellerName")
    public Seller findBySellerName() {
        String loginname=(String)SecurityUtils.getSubject().getPrincipal();
        Seller bySellerName = sellerService.findBySellerName(loginname);
       System.out.println(bySellerName);
        return bySellerName;
    }

    @RequestMapping("/findBySellerNameId")
    public Seller updateSeller(@RequestBody Seller seller){

        return null;
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
        String loginname=(String)SecurityUtils.getSubject().getPrincipal();
        sellerService.upload(car,loginname);
    }
    @RequestMapping(value = "/uploadPic",method = RequestMethod.POST)
    public String upload(MultipartFile file){
        return uploadUtils.upload(file);
    }

    

}
