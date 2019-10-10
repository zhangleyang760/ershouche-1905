package com.qf.dao;

import com.qf.domain.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PermissionMapper {
    List<Permission> selectPermissionByUsername(@Param("username") String username);

}
