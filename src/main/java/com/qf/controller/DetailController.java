package com.qf.controller;

import com.qf.domain.Car;
import com.qf.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailController {
    @Autowired
    private DetailService detailService;
    @RequestMapping("/showDetail")
    public Car showDetail(Integer cid){
        Car car=detailService.showDetail(cid);
        System.out.println(car);
        return car;
    }
}
