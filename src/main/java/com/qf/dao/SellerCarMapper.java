package com.qf.dao;

import com.qf.domain.Seller;
import com.qf.domain.SellerCar;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SellerCarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_car
     *
     * @mbg.generated
     */
    int insert(SellerCar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller_car
     *
     * @mbg.generated
     */
    int insertSelective(SellerCar record);

    Seller findSeller(Integer cid);
    void insertScid (Integer sid,Integer cid);
}