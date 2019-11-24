package com.example.demo.common.constant;


public enum BaseEnum {


    EC000000("000000", "交易成功"),
    EC990000("990000", "参数验证失败"),
    EC990010("990010","该账号只能发布特定商品对应的任务，具体详情咨询客服"),
    EC999999("999999", "交易失败");

    private String code;

    private String message;

    BaseEnum(String code, String message) {
        this.code = code;
        this.message = message;
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
}
