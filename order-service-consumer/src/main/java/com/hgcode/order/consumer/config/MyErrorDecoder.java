package com.hgcode.order.consumer.config;

import com.sun.jdi.InternalException;
import feign.Response;
import org.springframework.context.annotation.Configuration;

/*@Configuration
public class MyErrorDecoder implements feign.codec.ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {
        try {
            Response.Body body=  response.body();
            String str=body.toString();

        } catch (Exception var4) {
            return new InternalException(var4.getMessage());
        }
        return new InternalException("系统异常,请联系管理员");
    }

    static class ErrorResponse{
        int code;
        String message;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}*/
