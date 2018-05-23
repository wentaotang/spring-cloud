package com.hgcode.security.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import java.util.Collection;

@Configuration
public class MyAccessDecisionManager implements AccessDecisionManager {

    private static final Logger LOGGER=LoggerFactory.getLogger(MyAccessDecisionManager.class);

    @Override
    public void decide(Authentication authentication, Object o, Collection<ConfigAttribute> collection) throws AccessDeniedException, InsufficientAuthenticationException {
        if(collection==null || collection.isEmpty()){
            throw new AccessDeniedException("无权限访问该资源");
        }
        Collection<? extends GrantedAuthority> myRoles = authentication.getAuthorities();

        for(GrantedAuthority grantedAuthority : myRoles){
           boolean flag=collection.stream().filter(w-> w.getAttribute().equals(grantedAuthority.getAuthority())).findAny().isPresent();
           if(flag){
               return;
           }
        }
        throw new AccessDeniedException("无权限访问该资源");
    }

    @Override
    public boolean supports(ConfigAttribute configAttribute) {
        return true;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
