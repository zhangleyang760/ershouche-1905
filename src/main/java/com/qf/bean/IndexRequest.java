package com.qf.bean;

import lombok.Data;

@Data
public class IndexRequest {
    private Integer currentPage;
    private Integer size;
    private Integer currentIndex;
    private String type;
    private String brand;
    private String color;
    private Integer minPrice;
    private Integer maxPrice;
    private String name;
}
