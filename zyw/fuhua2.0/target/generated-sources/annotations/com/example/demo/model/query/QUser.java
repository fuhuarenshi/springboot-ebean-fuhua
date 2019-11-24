package com.example.demo.model.query;

import com.example.demo.model.User;
import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;

/**
 * Query bean for User.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QUser extends TQRootBean<User,QUser> {

  private static final QUser _alias = new QUser(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QUser alias() {
    return _alias;
  }

  public PInteger<QUser> id;
  public PString<QUser> username;
  public PString<QUser> password;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QUser forFetchGroup() {
    return new QUser(FetchGroup.queryFor(User.class));
  }


  /**
   * Construct with a given Database.
   */
  public QUser(Database server) {
    super(User.class, server);
  }

  /**
   * Construct using the default Database.
   */
  public QUser() {
    super(User.class);
  }

  /**
   * Construct for Alias.
   */
  private QUser(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QUser(Query<User> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PInteger<QUser> id = _alias.id;
    public static PString<QUser> username = _alias.username;
    public static PString<QUser> password = _alias.password;
  }
}
