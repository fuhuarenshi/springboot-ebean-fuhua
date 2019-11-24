package com.example.demo.service;/**
 * Created by hasee on 2019/11/11.
 */

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zyw
 * @Description  对应用户service
 * @Date 12:01 2019/11/11
 * @Param: null
 * @Return
 */
@Service
public interface UserService {


    public List<User> getAll();

    public User getById(Integer id);

}
