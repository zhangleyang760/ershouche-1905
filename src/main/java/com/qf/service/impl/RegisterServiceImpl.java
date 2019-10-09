package com.qf.service.impl;

import com.qf.dao.CodeMapper;
import com.qf.dao.CodeRepository;
import com.qf.dao.SellerMapper;
import com.qf.dao.SellerRepository;
import com.qf.domain.Code;
import com.qf.domain.Seller;
import com.qf.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private CodeRepository codeRepository;
    @Resource
    private CodeMapper codeMapper;
    @Resource
    private SellerRepository sellerRepository;
    @Override
    public void addCode(Code userCode) {
        codeRepository.save(userCode);
    }

    @Override
    public String getCode(String email) {
        Code codeByName = codeMapper.findCodeByName(email);
        return codeByName.getCode();
    }

    @Override
    public Seller addSellerAdmin(Seller seller) {
        return sellerRepository.save(seller);
    }

}
