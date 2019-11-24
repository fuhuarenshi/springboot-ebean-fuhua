package com.example.demo.service;/**
 * Created by hasee on 2019/11/11.
 */

import com.example.demo.common.result.MyPagedList;
import com.example.demo.model.SysUser;
import com.example.demo.model.query.QSysUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zyw
 * @Description  对应系统用户service
 * @Date 12:01 2019/11/11
 * @Param: null
 * @Return
 */
@Service
public interface SysUserService {


    public List<SysUser> getAll();

    public SysUser getById(String id);

    public Integer insertSysUser(SysUser sysUser);

    public Integer saveSysUser(SysUser sysUser);

    public List<SysUser> getPageSysUser(MyPagedList<SysUser> pagedList);



}
