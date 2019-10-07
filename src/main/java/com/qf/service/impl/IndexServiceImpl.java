package com.qf.service.impl;

import com.qf.bean.IndexRequest;
import com.qf.bean.IndexResponse;
import com.qf.dao.CarRepository;
import com.qf.dao.CarSpecificationExecutor;
import com.qf.service.IndexService;
import com.qf.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.util.List;

public class IndexServiceImpl implements IndexService {
    @Autowired
    private PageUtils pageUtils;
    @Autowired
    private CarSpecificationExecutor carSpecificationExecutor;
    @Autowired
    private CarRepository carRepository;
    @Override
    public IndexResponse findBySearch(IndexRequest indexRequest) {
        IndexResponse indexResponse = new IndexResponse();
        if (indexRequest.getSearch()!=null&&indexRequest.getSearch()!=""){
            Page listBySearch = pageUtils.getListBySearch(indexRequest.getCurrentPage(), indexRequest.getSize(), indexRequest.getSearch(), carSpecificationExecutor);
            List cars = listBySearch.getContent();
            long total = listBySearch.getTotalElements();
            indexResponse.setCars(cars);
            indexResponse.setTotal(total);
        }else {
            Page list = pageUtils.getList(indexRequest.getCurrentPage(), indexRequest.getSize(), carRepository);
            List cars = list.getContent();
            long total = list.getTotalElements();
            indexResponse.setTotal(total);
            indexResponse.setCars(cars);
        }
        return indexResponse;
    }
}
