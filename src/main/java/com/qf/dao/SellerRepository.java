package com.qf.dao;

import com.qf.domain.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SellerRepository extends JpaRepository<Seller,Integer> {
    List<Seller> findByUsername(String name);
}
