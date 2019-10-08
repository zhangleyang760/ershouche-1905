package com.qf.bean;

import lombok.Data;

@Data
public class IndexRequest {
    private Integer currentPage;
    private Integer size;
    private String search;
}
