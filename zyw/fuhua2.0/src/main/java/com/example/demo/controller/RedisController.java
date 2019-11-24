package com.example.demo.controller;


import com.example.demo.common.result.ResultBean;
import com.example.demo.model.User;
import com.example.demo.redis.RedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author zyw
 * @Description  redis 直接调用的接口
 * @Date 10:17 2019/11/24
 * @Param: null
 * @Return
 */
@Api(tags = "redis", description = "redi缓存玩玩")
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @ApiOperation("往redis中传入值")
    @RequestMapping(value = "put", method = RequestMethod.GET)
    @ResponseBody
    public ResultBean put(String username , String  password) {
        String tokenId = "1";
        User test = new User(username,password);
        Boolean yy = redisService.set(tokenId, test);
        return ResultBean.ofSuccess(yy);

    }

    @ApiOperation("从redis中获取值根据key")
    @RequestMapping(value = "getById", method = RequestMethod.GET)
    @ResponseBody
    public User get(String username) {
        return (User) redisService.get(username);
    }

}
