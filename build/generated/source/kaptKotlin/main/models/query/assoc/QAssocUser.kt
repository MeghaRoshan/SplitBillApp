package models.query.assoc;

import io.ebean.typequery.PInteger;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import main.kotlin.models.models.query.assoc.QAssocBill;
import models.User;
import models.query.QUser;

/**
 * Association query bean for AssocUser.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.kotlin-generator")
@TypeQueryBean
class QAssocUser<R> : TQAssocBean<User,R> {

  lateinit var userId: PInteger<R>
  lateinit var firstName: PString<R>
  lateinit var email: PString<R>
  lateinit var bill: QAssocBill<R>

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  fun fetch(vararg properties: TQProperty<QUser>) : R {
    return fetchProperties(*properties)
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  fun fetchQuery(vararg properties: TQProperty<QUser>) : R {
    return fetchQueryProperties(*properties)
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  fun fetchCache(vararg properties: TQProperty<QUser>) : R {
    return fetchCacheProperties(*properties)
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  fun fetchLazy(vararg properties: TQProperty<QUser>) : R {
    return fetchLazyProperties(*properties)
  }

  constructor(name: String, root: R) : super(name, root)

  constructor(name: String, root: R, prefix: String) : super(name, root, prefix)
}
