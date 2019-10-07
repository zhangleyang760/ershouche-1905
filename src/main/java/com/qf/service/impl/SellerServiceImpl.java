package com.qf.service.impl;

import com.qf.dao.SellerRepository;
import com.qf.domain.Seller;
import com.qf.service.SellerService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

public class SellerServiceImpl implements SellerService {

    @Resource
    SellerRepository sellerRepository;

    @Override
    public List<Seller> findSeller() {
        return sellerRepository.findAll();
    }

    @Override
    public Seller findById(Seller seller) {
        Optional<Seller> byId = sellerRepository.findById(seller.getSid());
        if (byId.isPresent()){
            return byId.get();
        }
        return null;
    }

    @Override
    public Seller update(Seller seller) {
     return sellerRepository.saveAndFlush(seller);
    }

    @Override
    public void deleteSeller(Integer sid) {
        sellerRepository.deleteById(sid);
    }

}
