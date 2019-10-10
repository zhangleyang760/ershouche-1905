package com.qf.service.impl;

import com.qf.bean.DetailResponse;
import com.qf.dao.CarPicMapper;
import com.qf.dao.CarRepository;
import com.qf.dao.SellerCarMapper;
import com.qf.domain.Car;
import com.qf.domain.Seller;
import com.qf.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetailServiceImpl implements DetailService {
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private SellerCarMapper sellerCarMapper;
    @Autowired
    private CarPicMapper carPicMapper;
    @Override
    public DetailResponse showDetail(Integer cid) {
        DetailResponse detailResponse=new DetailResponse();
        Optional<Car> byId = carRepository.findById(cid);
        if (byId.isPresent()){
            Car car = byId.get();
            detailResponse.setCar(car);
        }
        Seller seller = sellerCarMapper.findSeller(cid);
        detailResponse.setSeller(seller);
        List pics = carPicMapper.getPics(cid);
        detailResponse.setPics(pics);
        return detailResponse;
    }
}
