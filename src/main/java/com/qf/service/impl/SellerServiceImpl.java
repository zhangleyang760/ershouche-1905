package com.qf.service.impl;

import com.qf.dao.SellerMapper;
import com.qf.dao.SellerRepository;
import com.qf.domain.Seller;
import com.qf.service.SellerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;
@Service
public class SellerServiceImpl implements SellerService {

    @Resource
    SellerRepository sellerRepository;
    @Resource
    SellerMapper sellerMapper;

    @Override
    public List<Seller> findSeller() {
        return sellerMapper.findSeller();
    }

    @Override
    public List<Seller> findCustomer() {
        return sellerMapper.findCustomer();
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
