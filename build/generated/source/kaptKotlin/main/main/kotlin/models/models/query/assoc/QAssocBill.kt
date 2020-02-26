package main.kotlin.models.models.query.assoc;

import io.ebean.typequery.PDouble;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import main.kotlin.models.models.Bill;
import main.kotlin.models.models.query.QBill;
import models.query.assoc.QAssocUser;

/**
 * Association query bean for AssocBill.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.kotlin-generator")
@TypeQueryBean
class QAssocBill<R> : TQAssocBean<Bill,R> {

  lateinit var billId: PInteger<R>
  lateinit var billName: PString<R>
  lateinit var listOfPeople: QAssocUser<R>
  lateinit var amount: PDouble<R>
  lateinit var payee: QAssocUser<R>

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  fun fetch(vararg properties: TQProperty<QBill>) : R {
    return fetchProperties(*properties)
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  fun fetchQuery(vararg properties: TQProperty<QBill>) : R {
    return fetchQueryProperties(*properties)
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  fun fetchCache(vararg properties: TQProperty<QBill>) : R {
    return fetchCacheProperties(*properties)
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  fun fetchLazy(vararg properties: TQProperty<QBill>) : R {
    return fetchLazyProperties(*properties)
  }

  constructor(name: String, root: R) : super(name, root)

  constructor(name: String, root: R, prefix: String) : super(name, root, prefix)
}
