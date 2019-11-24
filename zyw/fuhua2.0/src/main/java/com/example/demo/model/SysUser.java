package com.example.demo.model;/**
 * Created by hasee on 2019/11/22.
 */

import io.ebean.Model;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author zyw
 * @Description  偏正式用户表的建立  sys_user实体类
 * @Date 11:43 2019/11/11
 * @Param: null
 * @Return
 */
@Entity
@Table(name = "sys_user")
@Data
public class SysUser extends Model implements Serializable {

    /**
     * 对应id 数据库字段是：id  <br>
     */
    @Id
    private String id;

    /**
     * 账号 数据库字段是：account  <br>
     */
    private String account;

    /**
     * 密码(经过处理加密之后的密码) 数据库字段是：password  <br>
     */
    private String password;

    /**
     * 盐(密码加密需要的) 数据库字段是：salt  <br>
     */
    private String salt;

    /**
     * tokne值(从新登陆做修改) 数据库字段是：token  <br>
     */
    private String token;

    /**
     * 登陆时间,最近一次操作该表的时间 数据库字段是：login_time  <br>
     */
    private Date loginTime;

    /**
     * 登陆的ip地址 数据库字段是：login_ip  <br>
     */
    private String loginIp;

    /**
     * 登录人的手机号码(可作为唯一键表示，当账号跟这个同样时候) 数据库字段是：login_phone  <br>
     */
    private String loginPhone;

    /**
     * 状态(0停用  1在用) 数据库字段是：status  <br>
     */
    private Integer status;

    /**
     * 版本号 数据库字段是：data_version  <br>
     */
    private Integer dataVersion;

    /**
     * 备注 数据库字段是：remark  <br>
     */
    private String remark;

    /**
     * 是否删除(逻辑删除控制的字段 0是在用 1.删除) 数据库字段是：is_delete  <br>
     */
    private Integer isDelete;

    /**
     * 新增时间 数据库字段是：gmt_create  <br>
     */
    private Date gmtCreate;

    /**
     * 修改时间 数据库字段是：gmt_modify  <br>
     */
    private Date gmtModify;

    /**
     * 新增人 数据库字段是：create_user_id  <br>
     */
    private String createUserId;

    /**
     * 修改人 数据库字段是：modify_user_id  <br>
     */
    private String modifyUserId;

}
