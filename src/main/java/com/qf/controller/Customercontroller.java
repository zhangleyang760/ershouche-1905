package com.qf.controller;

import com.qf.domain.Customer;
import com.qf.service.CustomerService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class Customercontroller {
    @Resource
    CustomerService customerService;

    @RequestMapping("/findCustomer")
    public List findseller(){
        return  customerService.findCustomer();
    }

    @RequestMapping("/findByCustomerId")
    public Customer findBySeller(@RequestBody Customer customer){
        return customerService.findById(customer);
    }

    @RequestMapping("/updateCustomer")
    public Customer update(@RequestBody Customer customer){
        return  customerService.update(customer);
    }

    @RequestMapping("/deleteCustomer")
    public void delete(@RequestBody Customer Customer){
        int sid=Customer.getBid();
        customerService.deleteCustomer(sid);
    }
}
