package com.qf.service;

import com.qf.bean.PageBean;
import com.qf.domain.Car;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CarService  {

    PageBean findCarAll(Integer page, Integer size);

    void deleteCar(Integer cid);

    Car findById(Car car);

    Car update(Car car);

    void upload(MultipartFile file);
}
