package com.qf.service;

import com.qf.domain.Seller;

import java.util.List;

public interface SellerService {




    List<Seller> findSeller();

    List<Seller> findCustomer();

    Seller findById(Seller seller);

    Seller update(Seller seller);

    void deleteSeller(Integer sid);
}
