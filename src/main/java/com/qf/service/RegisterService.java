package com.qf.service;

import com.qf.domain.Code;
import com.qf.domain.Seller;

public interface RegisterService {
    void addCode(Code userCode);

    String getCode(String email);

    Seller addSellerAdmin(Seller seller);

}
