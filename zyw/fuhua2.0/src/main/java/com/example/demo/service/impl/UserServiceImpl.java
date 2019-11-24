package com.example.demo.service.impl;/**
 * Created by hasee on 2019/11/13.
 */

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import io.ebean.EbeanServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author zyw
 * @Description 用户实现类
 * @Date 18:25 2019/11/13
 * @Param: null
 * @Return
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private EbeanServer ebeanServer;

    @Override
    public List<User> getAll() {
        List<User> list = ebeanServer.find(User.class).findList();

        return list;
    }

    @Override
    public User getById(Integer id) {
        return ebeanServer.find(User.class).where().eq("id", id).findOne();
    }
}
