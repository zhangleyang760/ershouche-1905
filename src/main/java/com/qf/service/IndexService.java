package com.qf.service;

import com.qf.bean.IndexRequest;
import com.qf.bean.IndexResponse;

public interface IndexService {
    public IndexResponse findBySearch(IndexRequest indexRequest);

}
