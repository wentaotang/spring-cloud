package com.hgcode.order.client.exception;

public class CustomerException extends RuntimeException {

    private int code;

    public CustomerException() {
        super();
    }

    public CustomerException(int code, String message) {
        super(message);
        this.setCode(code);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
