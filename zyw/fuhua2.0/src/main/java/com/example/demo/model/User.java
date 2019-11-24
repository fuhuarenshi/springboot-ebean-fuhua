package com.example.demo.model;/**
 * Created by hasee on 2019/11/11.
 */

import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Author zyw
 * @Description 用户表的建立  user实体类
 * @Date 11:43 2019/11/11
 * @Param: null
 * @Return
 */
@Entity
@Table(name="user")
public class User extends Model implements Serializable {
    @Id
    private Integer id;

    private String username;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*以下是否是必须的 需要测试*/
    public User(Integer id, String username, String password) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

}
