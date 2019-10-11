package com.qf.dao;

import com.qf.domain.CarPic;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CarPicMapper {
    void insertCpic(@Param("cid") Integer cid, @Param("pic") String pic);
    List getPics(Integer cid);
}