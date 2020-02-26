package main.kotlin.models.models.query;

import java.lang.System;

/**
 * Query bean for Bill.
 *
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@javax.annotation.Generated(value = {"io.ebean.querybean.kotlin-generator"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001(B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0006B\u000f\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB\u0015\b\u0012\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u00a2\u0006\u0002\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00000 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b\'\u0010$\u00a8\u0006)"}, d2 = {"Lmain/kotlin/models/models/query/QBill;", "Lio/ebean/typequery/TQRootBean;", "Lmain/kotlin/models/models/Bill;", "database", "Lio/ebean/Database;", "(Lio/ebean/Database;)V", "()V", "dummy", "", "(Z)V", "fetchGroupQuery", "Lio/ebean/Query;", "(Lio/ebean/Query;)V", "amount", "Lio/ebean/typequery/PDouble;", "getAmount", "()Lio/ebean/typequery/PDouble;", "setAmount", "(Lio/ebean/typequery/PDouble;)V", "billId", "Lio/ebean/typequery/PInteger;", "getBillId", "()Lio/ebean/typequery/PInteger;", "setBillId", "(Lio/ebean/typequery/PInteger;)V", "billName", "Lio/ebean/typequery/PString;", "getBillName", "()Lio/ebean/typequery/PString;", "setBillName", "(Lio/ebean/typequery/PString;)V", "listOfPeople", "Lmodels/query/assoc/QAssocUser;", "getListOfPeople", "()Lmodels/query/assoc/QAssocUser;", "setListOfPeople", "(Lmodels/query/assoc/QAssocUser;)V", "payee", "getPayee", "setPayee", "Companion", "SplitBill"})
@io.ebean.typequery.TypeQueryBean()
public final class QBill extends io.ebean.typequery.TQRootBean<main.kotlin.models.models.Bill, main.kotlin.models.models.query.QBill> {
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PInteger<main.kotlin.models.models.query.QBill> billId;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PString<main.kotlin.models.models.query.QBill> billName;
    @org.jetbrains.annotations.NotNull()
    public models.query.assoc.QAssocUser<main.kotlin.models.models.query.QBill> listOfPeople;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PDouble<main.kotlin.models.models.query.QBill> amount;
    @org.jetbrains.annotations.NotNull()
    public models.query.assoc.QAssocUser<main.kotlin.models.models.query.QBill> payee;
    
    /**
     * shared 'Alias' instance used to provide
     * properties to select and fetch clauses
     */
    @org.jetbrains.annotations.NotNull()
    private static final main.kotlin.models.models.query.QBill _alias = null;
    public static final main.kotlin.models.models.query.QBill.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PInteger<main.kotlin.models.models.query.QBill> getBillId() {
        return null;
    }
    
    public final void setBillId(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PInteger<main.kotlin.models.models.query.QBill> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PString<main.kotlin.models.models.query.QBill> getBillName() {
        return null;
    }
    
    public final void setBillName(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PString<main.kotlin.models.models.query.QBill> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final models.query.assoc.QAssocUser<main.kotlin.models.models.query.QBill> getListOfPeople() {
        return null;
    }
    
    public final void setListOfPeople(@org.jetbrains.annotations.NotNull()
    models.query.assoc.QAssocUser<main.kotlin.models.models.query.QBill> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PDouble<main.kotlin.models.models.query.QBill> getAmount() {
        return null;
    }
    
    public final void setAmount(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PDouble<main.kotlin.models.models.query.QBill> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final models.query.assoc.QAssocUser<main.kotlin.models.models.query.QBill> getPayee() {
        return null;
    }
    
    public final void setPayee(@org.jetbrains.annotations.NotNull()
    models.query.assoc.QAssocUser<main.kotlin.models.models.query.QBill> p0) {
    }
    
    /**
     * Construct with a given Database.
     */
    public QBill(@org.jetbrains.annotations.NotNull()
    io.ebean.Database database) {
        super(null);
    }
    
    /**
     * Construct using the default Database.
     */
    public QBill() {
        super(null);
    }
    
    /**
     * Construct for Alias.
     */
    private QBill(boolean dummy) {
        super(null);
    }
    
    /**
     * Private constructor for FetchGroup building.
     */
    private QBill(io.ebean.Query<main.kotlin.models.models.Bill> fetchGroupQuery) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lmain/kotlin/models/models/query/QBill$Companion;", "", "()V", "_alias", "Lmain/kotlin/models/models/query/QBill;", "get_alias", "()Lmain/kotlin/models/models/query/QBill;", "forFetchGroup", "SplitBill"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final main.kotlin.models.models.query.QBill get_alias() {
            return null;
        }
        
        /**
         * Return a query bean used to build a FetchGroup.
         */
        @org.jetbrains.annotations.NotNull()
        public final main.kotlin.models.models.query.QBill forFetchGroup() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}