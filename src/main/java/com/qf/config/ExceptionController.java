package com.qf.config;

import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 54110 on 2019-09-19.
 */
@ControllerAdvice
@ResponseBody
public class ExceptionController {

    @ExceptionHandler(value = UnauthorizedException.class)
    public String defaultErrorHandler(){
        return "unauth";
    }

    @ExceptionHandler(value =UnauthenticatedException.class )
    public String UnauthenticatedExceptionHandle(Exception e){
        //System.out.println("未登录！！");
        return "未登录";
    }
    @ExceptionHandler(value = AuthorizationException.class)
    public String AuthorizationExceptionHandle(Exception e){
        System.out.println(e.getMessage());
        return "权限不够，请向管理员申请权限";
    }
}
