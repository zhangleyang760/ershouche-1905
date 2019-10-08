package com.qf.dao;

import com.qf.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CarSpecificationExecutor extends JpaRepository<Car,Integer> ,JpaSpecificationExecutor<Car> {

}
