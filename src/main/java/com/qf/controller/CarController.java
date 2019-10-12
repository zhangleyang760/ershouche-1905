package com.qf.controller;

import com.qf.bean.PageBean;
import com.qf.domain.Car;
import com.qf.service.CarService;
import com.qf.utils.UploadUtils;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CarController {

    @Resource
    CarService carService;
    @Resource
    UploadUtils uploadUtils;
    @RequiresAuthentication
    @RequestMapping("/findCarAll/{page}/{size}")
    public PageBean findcar(@PathVariable("page")Integer page, @PathVariable("size")Integer size){
        return carService.findCarAll(page,size);
    }
    @RequestMapping("/deleteCar")
    public  void deletecar(@RequestBody Car car){
        int cid =car.getCid();
        carService.deleteCar(cid);
    }
    public Car findCarId(@RequestBody Car car){
        return  carService.findById(car);
    }

    @RequestMapping(value = "/updateCar",method = RequestMethod.POST)
    public Car updateCar(@RequestBody Car car){

        return carService.update(car);
    }
    @RequiresAuthentication
    @RequestMapping("/updateCarPic")
    public void updateCarPic(MultipartFile file){
        carService.upload(file);
    }
}
