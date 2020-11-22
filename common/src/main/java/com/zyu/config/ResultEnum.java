package com.zyu.config;

public enum ResultEnum {
    web_success("0000", "系统成功", true),
    web_error("9999", "系统错误");
    private String code;
    private String message;
    private boolean status;

    ResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
        this.status = false;
    }

    ResultEnum(String code, String message, boolean status) {
        this.code = code;
        this.message = message;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
