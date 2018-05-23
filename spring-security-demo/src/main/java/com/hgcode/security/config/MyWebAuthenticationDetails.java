package com.hgcode.security.config;

import org.springframework.security.web.authentication.WebAuthenticationDetails;

import javax.servlet.http.HttpServletRequest;
/**
* @description: 扩展类，用于接受表单的验证码字段
* @author wentao_tang
* @date 2018/5/23 15:50
* @version v1.0
*/
public class MyWebAuthenticationDetails extends WebAuthenticationDetails {

    private static final String captchaCodeParameter="captchaCode";
    /**
     * Records the remote address and will also set the session Id if a session already
     * exists (it won't create one).
     *
     * @param request that the authentication request was received from
     */
    public MyWebAuthenticationDetails(HttpServletRequest request) {
        super(request);
        this.captchaCode=this.obtainCaptchaCode(request);
    }

    private String captchaCode;


    public String getCaptchaCode() {
        return captchaCode;
    }

    protected String obtainCaptchaCode(HttpServletRequest request) {
        return request.getParameter(captchaCodeParameter);
    }
}
