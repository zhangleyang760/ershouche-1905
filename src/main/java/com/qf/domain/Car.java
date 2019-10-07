package com.qf.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "car")
@Data
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.cname
     *
     * @mbg.generated
     */
    private String cname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.brand
     *
     * @mbg.generated
     */
    private String brand;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.ctype
     *
     * @mbg.generated
     */
    private String ctype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.price
     *
     * @mbg.generated
     */
    private Double price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.mileage
     *
     * @mbg.generated
     */
    private String mileage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.cyear
     *
     * @mbg.generated
     */
    private String cyear;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.color
     *
     * @mbg.generated
     */
    private String color;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.pic
     *
     * @mbg.generated
     */
    private String pic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column car.miaoshu
     *
     * @mbg.generated
     */
    private String miaoshu;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public Car(Integer cid, String cname, String brand, String ctype, Double price, String mileage, String cyear, String color, String pic, String miaoshu) {
        this.cid = cid;
        this.cname = cname;
        this.brand = brand;
        this.ctype = ctype;
        this.price = price;
        this.mileage = mileage;
        this.cyear = cyear;
        this.color = color;
        this.pic = pic;
        this.miaoshu = miaoshu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public Car() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.cid
     *
     * @return the value of car.cid
     *
     * @mbg.generated
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.cid
     *
     * @param cid the value for car.cid
     *
     * @mbg.generated
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.cname
     *
     * @return the value of car.cname
     *
     * @mbg.generated
     */
    public String getCname() {
        return cname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.cname
     *
     * @param cname the value for car.cname
     *
     * @mbg.generated
     */
    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.brand
     *
     * @return the value of car.brand
     *
     * @mbg.generated
     */
    public String getBrand() {
        return brand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.brand
     *
     * @param brand the value for car.brand
     *
     * @mbg.generated
     */
    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.ctype
     *
     * @return the value of car.ctype
     *
     * @mbg.generated
     */
    public String getCtype() {
        return ctype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.ctype
     *
     * @param ctype the value for car.ctype
     *
     * @mbg.generated
     */
    public void setCtype(String ctype) {
        this.ctype = ctype == null ? null : ctype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.price
     *
     * @return the value of car.price
     *
     * @mbg.generated
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.price
     *
     * @param price the value for car.price
     *
     * @mbg.generated
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.mileage
     *
     * @return the value of car.mileage
     *
     * @mbg.generated
     */
    public String getMileage() {
        return mileage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.mileage
     *
     * @param mileage the value for car.mileage
     *
     * @mbg.generated
     */
    public void setMileage(String mileage) {
        this.mileage = mileage == null ? null : mileage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.cyear
     *
     * @return the value of car.cyear
     *
     * @mbg.generated
     */
    public String getCyear() {
        return cyear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.cyear
     *
     * @param cyear the value for car.cyear
     *
     * @mbg.generated
     */
    public void setCyear(String cyear) {
        this.cyear = cyear == null ? null : cyear.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.color
     *
     * @return the value of car.color
     *
     * @mbg.generated
     */
    public String getColor() {
        return color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.color
     *
     * @param color the value for car.color
     *
     * @mbg.generated
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.pic
     *
     * @return the value of car.pic
     *
     * @mbg.generated
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.pic
     *
     * @param pic the value for car.pic
     *
     * @mbg.generated
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column car.miaoshu
     *
     * @return the value of car.miaoshu
     *
     * @mbg.generated
     */
    public String getMiaoshu() {
        return miaoshu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column car.miaoshu
     *
     * @param miaoshu the value for car.miaoshu
     *
     * @mbg.generated
     */
    public void setMiaoshu(String miaoshu) {
        this.miaoshu = miaoshu == null ? null : miaoshu.trim();
    }
}