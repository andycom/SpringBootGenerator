package com.fancv.generator.BO;

/**
 *
 */
public class Result {

    private String message;

    private int code;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private String type;

    private Object data;


    public Result(String message, int code, String type) {
        this.message = message;
        this.code = code;
        this.type = type;
    }

    public Result(Object data) {
        this.message = "success";
        this.code = 0;
        this.type = "OK";
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
