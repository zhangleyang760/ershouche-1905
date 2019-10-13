package com.qf.service.impl;

import com.qf.bean.IndexRequest;
import com.qf.bean.IndexResponse;
import com.qf.dao.CarMapper;
import com.qf.dao.CarRepository;
import com.qf.dao.CarSpecificationExecutor;
import com.qf.domain.Car;
import com.qf.service.IndexService;
import com.qf.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    private CarMapper carMapper;
    @Override
    public IndexResponse findBySearch(IndexRequest indexRequest) {
        IndexResponse indexResponse = new IndexResponse();
        List<Car> bySearchTag = carMapper.findBySearchTag(indexRequest);
        long total = carMapper.findTotal(indexRequest);
        indexResponse.setTotal(total);
        indexResponse.setCars(bySearchTag);
        return indexResponse;
    }

    @Override
    public List findByClick(Integer num) {
        return carMapper.findByClick(num);
    }

    @Override
    public void addClick(Integer id) {
        carMapper.addClick(id);
    }
}
