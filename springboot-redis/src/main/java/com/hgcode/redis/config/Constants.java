package com.hgcode.redis.config;

public class Constants {
    //生成pdf队列
    public static final String PDF_TOPIC="top:pdf";
    //签章队列
    public static final String SIGN_TOPIC="top:sign";
    /**
     * 默认监听处理方式
     */
    public static final String DEFAULT_LISTENER_METHOD="receive";
}
