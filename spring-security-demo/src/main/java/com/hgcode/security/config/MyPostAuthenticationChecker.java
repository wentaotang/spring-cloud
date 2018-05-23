package com.hgcode.security.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsChecker;

@Configuration
public class MyPostAuthenticationChecker implements UserDetailsChecker {

    private static final Logger logger=LoggerFactory.getLogger(MyPostAuthenticationChecker.class);

    @Override
    public void check(UserDetails user) {
        if (!user.isCredentialsNonExpired()) {
            logger.warn("User credentials have expired");
            throw new CredentialsExpiredException("User credentials have expired");
        }
    }
}
