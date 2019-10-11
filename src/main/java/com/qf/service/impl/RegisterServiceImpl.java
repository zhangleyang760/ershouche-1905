package com.qf.service.impl;

import com.qf.dao.CodeMapper;
import com.qf.dao.CodeRepository;
import com.qf.dao.SellerMapper;
import com.qf.dao.SellerRepository;
import com.qf.domain.Code;
import com.qf.domain.Seller;
import com.qf.service.RegisterService;
import com.qf.utils.Md5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private Md5Utils md5Utils;
    @Autowired
    private CodeRepository codeRepository;
    @Resource
    private CodeMapper codeMapper;
    @Resource
    private SellerRepository sellerRepository;
    @Override
    public void addCode(Code userCode) {
        if (codeMapper.findCodeByName(userCode.getEmail())==null){
            codeRepository.save(userCode);
        }
        Code byName = codeMapper.findCodeByName(userCode.getEmail());
            userCode.setCodeid(byName.getCodeid());
            codeRepository.save(userCode);
    }

    @Override
    public String getCode(String email) {
        Code codeByName = codeMapper.findCodeByName(email);
        return codeByName.getCode();
    }

    @Override
    public Seller addSellerAdmin(Seller seller) {
        String passwordCode = md5Utils.getPasswordCode(seller.getPassword(), seller.getUsername());
        seller.setPassword(passwordCode);
        return sellerRepository.save(seller);
    }

}
