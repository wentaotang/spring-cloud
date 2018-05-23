package com.hgcode.security.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsChecker;

@Configuration
public class MyPreAuthenticationChecker implements UserDetailsChecker {

    private static final Logger logger=LoggerFactory.getLogger(MyPreAuthenticationChecker.class);

    @Override
    public void check(UserDetails user) {
        if (!user.isAccountNonLocked()) {
            logger.warn("User account is locked");
            throw new LockedException("User account is locked");
        }

        if (!user.isEnabled()) {
            logger.warn("User account is disabled");
            throw new DisabledException("User account is disabled");
        }
        if (!user.isAccountNonExpired()) {
            logger.warn("User account is expired");
            throw new AccountExpiredException("User account has expired");
        }
    }
}
