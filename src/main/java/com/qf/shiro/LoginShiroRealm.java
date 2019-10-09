package com.qf.shiro;

import com.qf.dao.SellerMapper;
import com.qf.domain.Seller;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;


import javax.annotation.Resource;

public class LoginShiroRealm extends AuthorizingRealm {
    @Resource
    private SellerMapper sellerMapper;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
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
