package com.qf.controller;

import com.qf.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class customercontroller {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/findBuyer")
    public List findBuyer(){
        return customerService.findAll();
    }
}
