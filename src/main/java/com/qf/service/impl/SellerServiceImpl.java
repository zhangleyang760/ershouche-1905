package com.qf.service.impl;

import com.qf.dao.*;
import com.qf.domain.Car;
import com.qf.domain.CarPic;
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
    @Resource
    private CarMapper carMapper;
    @Resource
    private SellerCarMapper sellerCarMapper;
    @Resource
    private CarPicMapper carPicMapper;


    private Integer cid;

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
    public Seller findBySellerName(String loginName) {

        return sellerRepository.findByUsername(loginName);
    }

    @Override
    public Seller findBySellerNameId(Integer sid) {
        Optional<Seller> byId = sellerRepository.findById(sid);
        if (byId.isPresent()){
          return   byId.get();
        }
        return null;
    }


    @Override
    public void upload(Car car,String LoginName) {
        carRepository.saveAndFlush(car);
        Integer sid=sellerMapper.findByUsername(LoginName);
        String cname=car.getCname();
        String mileage=car.getMileage();
        Integer cid=carMapper.findCid(cname,mileage);
        sellerCarMapper.insertScid(sid,cid);


    }
    @Override
    public String uploadPic(CarPic carPic) {
        carPicMapper.insertCpic(cid,carPic.getPic());

        return "上传成功";
    }
}
