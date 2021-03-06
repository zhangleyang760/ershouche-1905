package com.qf.dao;

import com.qf.bean.IndexRequest;
import com.qf.domain.Car;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    int insert(Car record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    int insertSelective(Car record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    Car selectByPrimaryKey(Integer cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Car record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Car record);

    List<Car> findBySearchTag(IndexRequest indexRequest);
    Integer findTotal(IndexRequest indexRequest);

    int findCid(@Param("cname") String cname,@Param("mileage") String mileage);
    List findByClick(Integer num);

    void addClick(Integer id);
}