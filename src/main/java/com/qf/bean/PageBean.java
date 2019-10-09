package com.qf.bean;

import lombok.Data;

import java.util.List;

@Data
public class PageBean<T> {

    private List<T> list;

    private Long total;
}
