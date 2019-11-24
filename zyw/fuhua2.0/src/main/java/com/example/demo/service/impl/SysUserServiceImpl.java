package com.example.demo.service.impl;/**
 * Created by hasee on 2019/11/13.
 */

import com.example.demo.common.result.MyPagedList;
import com.example.demo.model.SysUser;
import com.example.demo.model.query.QSysUser;
import com.example.demo.service.SysUserService;
import io.ebean.EbeanServer;
import io.ebean.PagedList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.List;

import static org.springframework.util.ObjectUtils.isEmpty;

/**
 * @Author zyw
 * @Description 用户实现类
 * @Date 18:25 2019/11/13
 * @Param: null
 * @Return
 */
@Component
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private EbeanServer ebeanServer;

    @Override
    public List<SysUser> getAll() {
        List<SysUser> list = new QSysUser().findList();

        return list;
    }

    @Override
    public SysUser getById(String id) {
        /*查询有二种*/
        SysUser sysUser1 =  ebeanServer.find(SysUser.class).where().eq("id", id).findOne();
        SysUser sysUser2 = new QSysUser()
                .id.eq(id)
                .findOne();

        SysUser sysUser3 = new QSysUser()
                .raw("id=?",id)
                .findOne();

        return sysUser1;
    }

    @Override
    public Integer insertSysUser(SysUser sysUser) {
        /*直接在对应部分调用对应实例类，然后.save();*/
        sysUser.save();
        return 1;
    }

    @Override
    public Integer saveSysUser(SysUser sysUser) {
        SysUser sysUserSelect = new QSysUser()
                .id.eq(sysUser.getId())
                .findOne();
        /*这里可能需要遍历对象 是否值为null*/
        /*未想到比较好的更新方法*/

        return null;
    }

    @Override
    public List<SysUser> getPageSysUser(MyPagedList<SysUser> pagedList) {
        PagedList<SysUser> sysUsers = new QSysUser()
//                .orderBy().id.asc()
                .setFirstRow(pagedList.getFirstRow())
                .setMaxRows(pagedList.getPageSize())
                .findPagedList();
        if(isEmpty(pagedList.getTotal())) {
            pagedList.setTotal(sysUsers.getTotalCount());
        }
        return sysUsers.getList();
    }
}
