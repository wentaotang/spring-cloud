package com.hgcode.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserCache;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.cache.NullUserCache;
import org.springframework.security.crypto.password.PasswordEncoder;


/**
 * @author wentao_tang
 * @version v1.0
 * @description: 处理认证
 * @date 2018/5/23 14:11
 */

@Configuration
public class MyAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

    @Autowired
    private MyUserDetailService userDetailService;
    @Autowired
    private MyPreAuthenticationChecker authenticationChecker;
    @Autowired
    private MyPostAuthenticationChecker myPostAuthenticationChecker;
    @Autowired
    private PasswordEncoder passwordEncoder;

    private UserCache userCache = new NullUserCache();

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        if (authentication.getCredentials() == null) {
            logger.warn("Authentication failed: no credentials provided");
            throw new BadCredentialsException("Bad credentials");
        }

        String presentedPassword = authentication.getCredentials().toString();

        if (!passwordEncoder.matches(userDetails.getPassword(), presentedPassword)) {
            logger.warn("Authentication failed: password does not match stored value");
            throw new BadCredentialsException("Bad credentials");
        }
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = (authentication.getPrincipal() == null) ? "NONE_PROVIDED" : authentication.getName();
        boolean cacheWasUsed = true;
        UserDetails user=userCache.getUserFromCache(username);
        if (user == null) {
            cacheWasUsed = false;
            try {
                user = retrieveUser(username, (UsernamePasswordAuthenticationToken) authentication);
            } catch (UsernameNotFoundException notFound) {
                throw notFound;
            }
        }
        try {
            authenticationChecker.check(user);
            additionalAuthenticationChecks(user, (UsernamePasswordAuthenticationToken) authentication);
        } catch (AuthenticationException exception) {
            throw exception;
        }
        myPostAuthenticationChecker.check(user);
        if (!cacheWasUsed)
        {
            this.userCache.putUserInCache(user);
        }
        Object principalToReturn = user;
        return createSuccessAuthentication(principalToReturn, authentication, user);
    }

    @Override
    protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        return userDetailService.loadUserByUsername(username);
    }

}
