package com.qf.controller;

import com.qf.bean.DetailResponse;
import com.qf.domain.Car;
import com.qf.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailController {
    @Autowired
    private DetailService detailService;
    @RequestMapping("/detail")
    public DetailResponse showDetail(@RequestBody Car car){
        System.out.println(car);
        DetailResponse detailResponse = detailService.showDetail(car.getCid());
        System.out.println(detailResponse);
        return detailResponse;
    }
}
