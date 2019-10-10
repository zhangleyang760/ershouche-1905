package com.qf.domain;

import lombok.Data;

import java.io.Serializable;
@Data
public class Permission implements Serializable {

    private Integer permissionid;
    private String permissionname;
}
