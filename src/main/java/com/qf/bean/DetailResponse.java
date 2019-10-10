package com.qf.bean;

import com.qf.domain.Car;
import com.qf.domain.Seller;
import lombok.Data;

import java.util.List;

@Data
public class DetailResponse {
    private Car car;
    private Seller seller;
    private List pics;
}
