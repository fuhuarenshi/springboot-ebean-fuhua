package com.example.demo.model.query.assoc;

import com.example.demo.model.SysUser;
import com.example.demo.model.query.QSysUser;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PString;
import io.ebean.typequery.PUtilDate;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;

/**
 * Association query bean for AssocSysUser.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QAssocSysUser<R> extends TQAssocBean<SysUser,R> {

  public PString<R> id;
  public PString<R> account;
  public PString<R> password;
  public PString<R> salt;
  public PString<R> token;
  public PUtilDate<R> loginTime;
  public PString<R> loginIp;
  public PString<R> loginPhone;
  public PInteger<R> status;
  public PInteger<R> dataVersion;
  public PString<R> remark;
  public PInteger<R> isDelete;
  public PUtilDate<R> gmtCreate;
  public PUtilDate<R> gmtModify;
  public PString<R> createUserId;
  public PString<R> modifyUserId;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetch(TQProperty<QSysUser>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchQuery(TQProperty<QSysUser>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchCache(TQProperty<QSysUser>... properties) {
    return fetchCacheProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchLazy(TQProperty<QSysUser>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocSysUser(String name, R root) {
    super(name, root);
  }

  public QAssocSysUser(String name, R root, String prefix) {
    super(name, root, prefix);
  }
}
