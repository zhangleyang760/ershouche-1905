package com.qf.utils;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.stereotype.Component;


@Component
public class Md5Utils {
    public String getPasswordCode(String password,String name){
        String algorithmName = "MD5";//加密算法
        Object source = password;//要加密的密码
        Object salt = name;//盐值，用用户名即可
        int hashIterations = 1024;//加密次数
        SimpleHash simpleHash = new SimpleHash(algorithmName,source,salt,hashIterations);
        return simpleHash.toString();
    }

}
