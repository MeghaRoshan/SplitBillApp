package main.kotlin.models.models.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.typequery.PDouble;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.Generated;
import main.kotlin.models.models.Bill;
import models.query.assoc.QAssocUser;

/**
 * Query bean for Bill.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.kotlin-generator")
@TypeQueryBean
class QBill : TQRootBean<Bill, QBill> {

  companion object {
    /**
     * shared 'Alias' instance used to provide
     * properties to select and fetch clauses
     */
    val _alias = QBill(true)

    /**
     * Return a query bean used to build a FetchGroup.
     */
    fun forFetchGroup(): QBill {
      return QBill(FetchGroup.queryFor(Bill::class.java));
    }
  }

  lateinit var billId: PInteger<QBill>
  lateinit var billName: PString<QBill>
  lateinit var listOfPeople: QAssocUser<QBill>
  lateinit var amount: PDouble<QBill>
  lateinit var payee: QAssocUser<QBill>


  /**
   * Construct with a given Database.
   */
  constructor(database: Database) : super(Bill::class.java, database)

  /**
   * Construct using the default Database.
   */
  constructor() : super(Bill::class.java)

  /**
   * Construct for Alias.
   */
  private constructor(dummy: Boolean) : super(dummy)

  /**
   * Private constructor for FetchGroup building.
   */
  private constructor(fetchGroupQuery: Query<Bill>) : super(fetchGroupQuery)
}
