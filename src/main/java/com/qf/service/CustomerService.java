package com.qf.service;

<<<<<<< HEAD
import java.util.List;

public interface CustomerService {

    List findAll();
=======
import com.qf.domain.Customer;
import com.qf.domain.Seller;

import java.util.List;


public interface CustomerService {



    List<Customer> findCustomer();

    Customer findById(Customer customer);

    Customer update(Customer customer);

    void deleteCustomer(Integer bid);
>>>>>>> origin/master
}
