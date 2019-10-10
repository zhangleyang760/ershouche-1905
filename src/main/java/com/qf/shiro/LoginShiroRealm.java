package com.qf.shiro;

import com.qf.dao.PermissionMapper;
import com.qf.dao.SellerMapper;
import com.qf.domain.Permission;
import com.qf.domain.Seller;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;


import javax.annotation.Resource;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class LoginShiroRealm extends AuthorizingRealm {
    @Resource
    private SellerMapper sellerMapper;
    @Resource
    private PermissionMapper permissionMapper;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = (String) principalCollection.getPrimaryPrincipal();     //得到用户名
        List<Permission> list = permissionMapper.selectPermissionByUsername(username);

        Collection set=new HashSet();       //HashSet底层由hashmap实现，不允许集合中有重
        // 复的值出现， 使用该方式时，需要重写equals（）
        //和hashcode（）方法

        for (Permission permission : list) {
            set.add(permission.getPermissionname());               //将权限去重
        }

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addStringPermissions(set);
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username=(String) authenticationToken.getPrincipal();
        //System.out.println(username);
        Seller byName = sellerMapper.findByName(username);

        //System.out.println(byName);
        SimpleAuthenticationInfo simpleAuthenticationInfo=new SimpleAuthenticationInfo(byName.getUsername(),byName.getPassword(),getName());
        return simpleAuthenticationInfo;
    }
}
