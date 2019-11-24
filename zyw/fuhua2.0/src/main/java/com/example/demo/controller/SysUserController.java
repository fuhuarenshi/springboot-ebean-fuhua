package com.example.demo.controller;

import com.example.demo.aop.Log;
import com.example.demo.common.result.MyPagedList;
import com.example.demo.common.result.ResultBean;
import com.example.demo.enums.BusinessType;
import com.example.demo.model.SysUser;
import com.example.demo.model.User;
import com.example.demo.service.SysUserService;
import com.example.demo.util.UuidUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Result;
import java.util.List;


/**
 * @Author zyw
 * @Description 用户管理controller
 * @Date 12:06 2019/11/11
 * @Param: null
 * @Return
 */
@Api(tags = "SysUserController", description = "系统用户管理")
@Controller
@RequestMapping("/sysUser")
public class SysUserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SysUserController.class);

    @Autowired
    private SysUserService sysUserService;


    @ApiOperation("获取所有用户")
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    @ResponseBody
    public ResultBean getAll() {
        return ResultBean.ofSuccess(sysUserService.getAll());
    }


    @ApiOperation("获取指定用户的信息")
    @RequestMapping(value = "getById", method = RequestMethod.GET)
    @ResponseBody
    public ResultBean getById(@RequestParam(value = "id") String id) {
        return ResultBean.ofSuccess(sysUserService.getById(id));
    }


    @ApiOperation("用户的信息的新增 ")
    @RequestMapping(value = "addSysUser", method = RequestMethod.POST)
    @ApiImplicitParam(name = "sysUser", value = "系统用户表", required = true, dataType = "SysUser")
    @ResponseBody
    @Log(title = "用户的信息的新增【新增】", businessType = BusinessType.OTHER)
    public ResultBean addSysUser(@RequestBody SysUser sysUser) {
        /*新增信息*/
        sysUser.setId(UuidUtils.getUUID());
        sysUserService.insertSysUser(sysUser);
        return ResultBean.ofSuccess();
    }


    @ApiOperation("用户的信息的修改 ")
    @RequestMapping(value = "saveSysUser", method = RequestMethod.POST)
    @ApiImplicitParam(name = "sysUser", value = "系统用户表", required = true, dataType = "SysUser")
    @ResponseBody
    public ResultBean save(@RequestBody SysUser user) {
        //修改用户信息
        sysUserService.saveSysUser(user);
        return ResultBean.ofSuccess(user);
    }

    @ApiOperation("用户的信息的分页获取 ")
    @RequestMapping(value = "pageSysUser", method = RequestMethod.POST)
    @ResponseBody
    @Log(title = "用户的分页的获取【查询】", businessType = BusinessType.OTHER)
    public ResultBean getPage(@RequestParam Integer firstRow ,@RequestParam Integer pageSize) {
        /*按条件获取对应的数据分页*/
        /*return success(service.gets(pagedList));*/
        MyPagedList<SysUser> pagedList = new MyPagedList<>();
        pagedList.setFirstRow(firstRow);
        pagedList.setPageSize(pageSize);
        List<SysUser> sysUserList = sysUserService.getPageSysUser(pagedList);
        return ResultBean.ofSuccess(sysUserList);
    }

    @ApiOperation("用户的信息的事物管理 ")
    @RequestMapping(value = "transSysUser", method = RequestMethod.POST)
    @ResponseBody
    public ResultBean testTranscation(String name) {
       /*按条件获取对应的事物管理？*/
//        return success(service.testTransaction(name));
        return ResultBean.ofSuccess();
    }

    @ApiOperation("用户的信息的根据式查询 ")
    @RequestMapping(value = "FormulaSysUser", method = RequestMethod.GET)
    @ResponseBody
    public ResultBean testFormula(String name) {
        /*暂时未知*/
       /* return success(service.findIncludeSizeByName(name));*/
        return ResultBean.ofSuccess();
    }



}
