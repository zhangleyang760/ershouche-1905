package com.qf.service.impl;

import com.qf.dao.CustomerRepository;
import com.qf.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List findAll() {
        return customerRepository.findAll();
    }
}
