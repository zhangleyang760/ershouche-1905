package com.qf.service.impl;

import com.qf.dao.CarRepository;
import com.qf.domain.Car;
import com.qf.service.CarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {
    @Resource
   private CarRepository carRepository;
    @Override
    public List<Car> findCarAll() {
        return carRepository.findAll();
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
}
