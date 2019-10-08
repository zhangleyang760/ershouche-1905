package com.qf.service.impl;

import com.qf.dao.CarRepository;
import com.qf.domain.Car;
import com.qf.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DetailServiceImpl implements DetailService {
    @Autowired
    private CarRepository carRepository;
    @Override
    public Car showDetail(Integer cid) {
        Optional<Car> byId = carRepository.findById(cid);
        if (byId.isPresent()){
            Car car = byId.get();
            return car;
        }
        return null;
    }
}
