package com.qf.service;

import com.qf.bean.IndexRequest;
import com.qf.bean.IndexResponse;
import org.springframework.stereotype.Service;


@Service
public interface IndexService {

    public IndexResponse findBySearch(IndexRequest indexRequest);

}
