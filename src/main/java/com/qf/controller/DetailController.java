package com.qf.controller;

import com.qf.bean.DetailResponse;
import com.qf.domain.Car;
import com.qf.service.DetailService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailController {
    @Autowired
    private DetailService detailService;
    @RequiresAuthentication
    @RequestMapping("/detail")
    public DetailResponse showDetail(@RequestBody Car car){
        //System.out.println(car);
        DetailResponse detailResponse = detailService.showDetail(car.getCid());
        //System.out.println(detailResponse);
        return detailResponse;
    }
}
