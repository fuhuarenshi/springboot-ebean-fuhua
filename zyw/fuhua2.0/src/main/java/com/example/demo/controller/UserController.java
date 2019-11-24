package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * @Author zyw
 * @Description 用户管理controller
 * @Date 12:06 2019/11/11
 * @Param: null
 * @Return
 */
@Api(tags = "UserController", description = "用户管理")
@Controller
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;



    @ApiOperation("获取所有用户")
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAll() {
        return userService.getAll();
    }


    @ApiOperation("获取指定用户的信息")
    @RequestMapping(value = "getById", method = RequestMethod.GET)
    @ResponseBody
    public User getById(@RequestParam(value = "id") Integer id) {
        return userService.getById(id);
    }

}
