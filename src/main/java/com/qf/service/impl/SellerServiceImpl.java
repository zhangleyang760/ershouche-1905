package com.qf.service.impl;

import com.qf.dao.CarRepository;
import com.qf.dao.SellerMapper;
import com.qf.dao.SellerRepository;
import com.qf.domain.Car;
import com.qf.domain.Seller;
import com.qf.service.SellerService;
import com.qf.utils.UploadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;
@Service
public class SellerServiceImpl implements SellerService {

    @Resource
    SellerRepository sellerRepository;
    @Resource
    SellerMapper sellerMapper;
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private UploadUtils uploadUtils;

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

//    @Override
//    public void upload(String cname, String brand, String ctype, String cyear, String miaoshu, String mileage, double price, String color, MultipartFile pic) {
//        String path="";
//        if(pic!=null&&pic.getOriginalFilename()!=""){
//            path=uploadUtils.upload(pic);
//        }
//        Car car=new Car();
//        car.setCname(cname);
//        car.setBrand(brand);
//        car.setCtype(ctype);
//        car.setColor(color);
//        car.setCyear(cyear);
//        car.setMiaoshu(miaoshu);
//        car.setMileage(mileage);
//        car.setPrice(price);
//        car.setPic(path);
//        carRepository.saveAndFlush(car);
//    }

    @Override
    public List<Seller> findBySellerName(String loginName) {
        return sellerRepository.findByUsername(loginName);
    }

    @Override
    public Seller findBySellerNameId(int sid) {
        Optional<Seller> byId = sellerRepository.findById(sid);
        if (byId.isPresent()){
          return   byId.get();
        }
        return null;
    }

    @Override
    public void upload(Car car) {
        carRepository.saveAndFlush(car);
    }
}
