package com.qf.service.impl;

import com.qf.dao.CustomerRepository;
import com.qf.domain.Customer;
import com.qf.domain.Seller;
import com.qf.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Resource
    CustomerRepository customerRepository;
    @Override
    public List<Customer> findCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Customer customer) {
        Optional<Customer> byId = customerRepository.findById(customer.getBid());
        if (byId.isPresent()){
            return byId.get();
        }
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        return customerRepository.saveAndFlush(customer);
    }

    @Override
    public void deleteCustomer(Integer bid) {
                customerRepository.deleteById(bid);
    }
}
