package com.example.demo.common.constant;/**
 * Created by Administrator on 2019/2/28.
 */

/***
 * @ClassName: SmsTypeEnum
 * @Description: TODO
 * @Auther: zyw
 * @Date: 2019/2/28 13:36
 * @version : V1.0
 */
public enum SmsTypeEnum {

    Register("01","注册"),
    ReSetPwd("02","重置密码");

    private  String code;
    private String name;
    SmsTypeEnum(String sCode,String sName)
    {
        this.code = sCode;
        this.name = sName;
    }

    public String getCode()
    {
        return  code;
    }

    public  String getName()
    {
        return name;
    }
}
