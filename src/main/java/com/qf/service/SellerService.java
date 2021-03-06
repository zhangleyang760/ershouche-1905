package com.qf.service;

import com.qf.domain.Car;
import com.qf.domain.CarPic;
import com.qf.domain.Seller;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface SellerService {




    List<Seller> findSeller();

    List<Seller> findCustomer();

    Seller findById(Seller seller);

    Seller update(Seller seller);

    void deleteSeller(Integer sid);

//    void upload(String cname, String brand, String ctype, String cyear, String miaoshu, String mileage, double price, String color, MultipartFile pic);
    String upload(Car car,String loginName);

    Seller findBySellerName(String loginName);

    Seller findBySellerNameId(Integer sid);

    String uploadPic(CarPic carPic);

}
