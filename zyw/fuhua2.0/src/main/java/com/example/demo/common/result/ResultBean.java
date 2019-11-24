package com.example.demo.common.result;

import com.example.demo.common.constant.BaseEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ResultBean<T> implements Serializable {

    private static final long serialVersionUID = -2361820086956983473L;

    // 数据明细
    @JsonProperty(value = "RetObject")
    private T retObject;
    @JsonProperty(value = "RetCode")
    private String retCode;
    @JsonProperty(value = "RetMsg")
    private String retMsg;



    public static <T> ResultBean<T> ofSuccess() {
        return of(null, BaseEnum.EC000000);
    }

    public static <T> ResultBean<T> ofSuccess(T data) {
        return of(data, BaseEnum.EC000000);
    }

    public static <T> ResultBean<T> ofError() {
        return of(null, BaseEnum.EC999999);
    }

    public static <T> ResultBean<T> ofError(String sMsg) {

        return of(null, BaseEnum.EC999999.getCode(),sMsg);
    }

    public static <T> ResultBean<T> ofError(BaseEnum errEnum,T data) {

        return of(data, errEnum.getCode(),errEnum.getMessage());
    }


    public static <T> ResultBean<T> of(T data, BaseEnum baseEnum) {
        ResultBean<T> resultBean = new ResultBean<>();
        resultBean.setRetObject(data);
        resultBean.setRetCode(baseEnum.getCode());
        resultBean.setRetMsg(baseEnum.getMessage());
        return resultBean;
    }

    public static <T> ResultBean<T> of(T data, String sCode,String sMessage) {
        ResultBean<T> resultBean = new ResultBean<>();
        resultBean.setRetObject(data);
        resultBean.setRetCode(sCode);
        resultBean.setRetMsg(sMessage);
        return resultBean;
    }



}
