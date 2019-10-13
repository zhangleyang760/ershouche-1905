package com.qf.service;

import com.qf.bean.IndexRequest;
import com.qf.bean.IndexResponse;

import java.util.List;

public interface IndexService {
    IndexResponse findBySearch(IndexRequest indexRequest);
    List findByClick(Integer num);


    void addClick(Integer id);
}
