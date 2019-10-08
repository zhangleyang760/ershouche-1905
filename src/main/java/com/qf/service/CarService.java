package com.qf.service;

import com.qf.domain.Car;

import java.util.List;

public interface CarService  {

    List<Car> findCarAll();

    void deleteCar(Integer cid);

    Car findById(Car car);

    Car update(Car car);
}
