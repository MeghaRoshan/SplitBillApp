package models.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import main.kotlin.models.models.query.assoc.QAssocBill;
import models.User;

/**
 * Query bean for User.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.kotlin-generator")
@TypeQueryBean
class QUser : TQRootBean<User, QUser> {

  companion object {
    /**
     * shared 'Alias' instance used to provide
     * properties to select and fetch clauses
     */
    val _alias = QUser(true)

    /**
     * Return a query bean used to build a FetchGroup.
     */
    fun forFetchGroup(): QUser {
      return QUser(FetchGroup.queryFor(User::class.java));
    }
  }

  lateinit var userId: PInteger<QUser>
  lateinit var firstName: PString<QUser>
  lateinit var email: PString<QUser>
  lateinit var bill: QAssocBill<QUser>


  /**
   * Construct with a given Database.
   */
  constructor(database: Database) : super(User::class.java, database)

  /**
   * Construct using the default Database.
   */
  constructor() : super(User::class.java)

  /**
   * Construct for Alias.
   */
  private constructor(dummy: Boolean) : super(dummy)

  /**
   * Private constructor for FetchGroup building.
   */
  private constructor(fetchGroupQuery: Query<User>) : super(fetchGroupQuery)
}
