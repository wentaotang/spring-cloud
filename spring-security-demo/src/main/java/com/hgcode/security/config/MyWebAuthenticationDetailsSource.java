package com.hgcode.security.config;

import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import javax.servlet.http.HttpServletRequest;

public class MyWebAuthenticationDetailsSource extends WebAuthenticationDetailsSource {

    @Override
    public MyWebAuthenticationDetails buildDetails(HttpServletRequest context) {
        return new MyWebAuthenticationDetails(context);
    }

}
