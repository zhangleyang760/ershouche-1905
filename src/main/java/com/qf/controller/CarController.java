package com.qf.controller;

import com.qf.domain.Car;
import com.qf.service.CarService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CarController {

    @Resource
    CarService carService;

    @RequestMapping("/findCarAll")
    public List findcar(){
        return carService.findCarAll();
    }

    @RequestMapping("/deleteCar")
    public  void deletecar(@RequestBody Car car){
        int cid =car.getCid();
        carService.deleteCar(cid);
    }

    @RequestMapping("/findCarId")
    public Car findCarId(@RequestBody Car car){
        return  carService.findById(car);
    }

    @RequestMapping(value = "/updateCar",method = RequestMethod.POST)
    public Car updateCar(@RequestBody Car car){
        return carService.update(car);
    }
}
