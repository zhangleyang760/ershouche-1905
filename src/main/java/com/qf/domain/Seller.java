package com.qf.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "seller")
@Data
public class Seller {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.sid
     *
     * @mbg.generated
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.cid
     *
     * @mbg.generated
     */
    private Integer cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.sname
     *
     * @mbg.generated
     */
    private String sname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.provice
     *
     * @mbg.generated
     */
    private String provice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.city
     *
     * @mbg.generated
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.Idcard
     *
     * @mbg.generated
     */
    private String idcard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.sex
     *
     * @mbg.generated
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seller.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller
     *
     * @mbg.generated
     */
    public Seller(Integer sid, Integer cid, String sname, String username, String password, String provice, String city, String phone, String idcard, String sex, String email) {
        this.sid = sid;
        this.cid = cid;
        this.sname = sname;
        this.username = username;
        this.password = password;
        this.provice = provice;
        this.city = city;
        this.phone = phone;
        this.idcard = idcard;
        this.sex = sex;
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table seller
     *
     * @mbg.generated
     */
    public Seller() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.sid
     *
     * @return the value of seller.sid
     *
     * @mbg.generated
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.sid
     *
     * @param sid the value for seller.sid
     *
     * @mbg.generated
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.cid
     *
     * @return the value of seller.cid
     *
     * @mbg.generated
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.cid
     *
     * @param cid the value for seller.cid
     *
     * @mbg.generated
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.sname
     *
     * @return the value of seller.sname
     *
     * @mbg.generated
     */
    public String getSname() {
        return sname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.sname
     *
     * @param sname the value for seller.sname
     *
     * @mbg.generated
     */
    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.username
     *
     * @return the value of seller.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.username
     *
     * @param username the value for seller.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.password
     *
     * @return the value of seller.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.password
     *
     * @param password the value for seller.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.provice
     *
     * @return the value of seller.provice
     *
     * @mbg.generated
     */
    public String getProvice() {
        return provice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.provice
     *
     * @param provice the value for seller.provice
     *
     * @mbg.generated
     */
    public void setProvice(String provice) {
        this.provice = provice == null ? null : provice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.city
     *
     * @return the value of seller.city
     *
     * @mbg.generated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.city
     *
     * @param city the value for seller.city
     *
     * @mbg.generated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.phone
     *
     * @return the value of seller.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.phone
     *
     * @param phone the value for seller.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.Idcard
     *
     * @return the value of seller.Idcard
     *
     * @mbg.generated
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.Idcard
     *
     * @param idcard the value for seller.Idcard
     *
     * @mbg.generated
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.sex
     *
     * @return the value of seller.sex
     *
     * @mbg.generated
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.sex
     *
     * @param sex the value for seller.sex
     *
     * @mbg.generated
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seller.email
     *
     * @return the value of seller.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seller.email
     *
     * @param email the value for seller.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}