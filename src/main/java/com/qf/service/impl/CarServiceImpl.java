package com.qf.service.impl;

import com.qf.bean.PageBean;
import com.qf.dao.CarRepository;
import com.qf.domain.Car;
import com.qf.service.CarService;
import com.qf.utils.UploadUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {
    @Resource
   private CarRepository carRepository;
    @Resource
    UploadUtils uploadUtils;

    @Override
    public PageBean findCarAll(Integer page, Integer size) {
        Pageable pageable=PageRequest.of(page-1,size);
        Page<Car> all = carRepository.findAll(pageable);
        PageBean pageBean=new PageBean();
        pageBean.setList(all.getContent());
        pageBean.setTotal(all.getTotalElements());
        return pageBean;
    }

    @Override
    public void deleteCar(Integer cid) {
        carRepository.deleteById(cid);
    }

    @Override
    public Car findById(Car car) {
        Optional<Car> byId = carRepository.findById(car.getCid());
        if (byId.isPresent()){
            return byId.get();
        }
        return null;
    }

    @Override
    public Car update(Car car) {

        return carRepository.saveAndFlush(car);
    }

    @Override
    public void upload(MultipartFile file) {
        String path="";
        if (file!=null&&file.getOriginalFilename()!=""){
            path=uploadUtils.upload(file);
        }

    }

}
