package com.example.demo.model.query;

import com.example.demo.model.SysUser;
import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PString;
import io.ebean.typequery.PUtilDate;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;

/**
 * Query bean for SysUser.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QSysUser extends TQRootBean<SysUser,QSysUser> {

  private static final QSysUser _alias = new QSysUser(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QSysUser alias() {
    return _alias;
  }

  public PString<QSysUser> id;
  public PString<QSysUser> account;
  public PString<QSysUser> password;
  public PString<QSysUser> salt;
  public PString<QSysUser> token;
  public PUtilDate<QSysUser> loginTime;
  public PString<QSysUser> loginIp;
  public PString<QSysUser> loginPhone;
  public PInteger<QSysUser> status;
  public PInteger<QSysUser> dataVersion;
  public PString<QSysUser> remark;
  public PInteger<QSysUser> isDelete;
  public PUtilDate<QSysUser> gmtCreate;
  public PUtilDate<QSysUser> gmtModify;
  public PString<QSysUser> createUserId;
  public PString<QSysUser> modifyUserId;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QSysUser forFetchGroup() {
    return new QSysUser(FetchGroup.queryFor(SysUser.class));
  }


  /**
   * Construct with a given Database.
   */
  public QSysUser(Database server) {
    super(SysUser.class, server);
  }

  /**
   * Construct using the default Database.
   */
  public QSysUser() {
    super(SysUser.class);
  }

  /**
   * Construct for Alias.
   */
  private QSysUser(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QSysUser(Query<SysUser> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PString<QSysUser> id = _alias.id;
    public static PString<QSysUser> account = _alias.account;
    public static PString<QSysUser> password = _alias.password;
    public static PString<QSysUser> salt = _alias.salt;
    public static PString<QSysUser> token = _alias.token;
    public static PUtilDate<QSysUser> loginTime = _alias.loginTime;
    public static PString<QSysUser> loginIp = _alias.loginIp;
    public static PString<QSysUser> loginPhone = _alias.loginPhone;
    public static PInteger<QSysUser> status = _alias.status;
    public static PInteger<QSysUser> dataVersion = _alias.dataVersion;
    public static PString<QSysUser> remark = _alias.remark;
    public static PInteger<QSysUser> isDelete = _alias.isDelete;
    public static PUtilDate<QSysUser> gmtCreate = _alias.gmtCreate;
    public static PUtilDate<QSysUser> gmtModify = _alias.gmtModify;
    public static PString<QSysUser> createUserId = _alias.createUserId;
    public static PString<QSysUser> modifyUserId = _alias.modifyUserId;
  }
}
