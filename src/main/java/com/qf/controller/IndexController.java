package com.qf.controller;

import com.qf.bean.IndexRequest;
import com.qf.bean.IndexResponse;
import com.qf.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private IndexService indexService;
    @RequestMapping("/index")
    public IndexResponse index(@RequestBody IndexRequest indexRequest){
        IndexResponse bySearch = indexService.findBySearch(indexRequest);
        System.out.println(bySearch);
        return bySearch;

    }
}
