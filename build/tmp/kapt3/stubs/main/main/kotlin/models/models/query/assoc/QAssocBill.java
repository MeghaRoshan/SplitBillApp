package main.kotlin.models.models.query.assoc;

import java.lang.System;

/**
 * Association query bean for AssocBill.
 *
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@javax.annotation.Generated(value = {"io.ebean.querybean.kotlin-generator"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ+\u0010%\u001a\u00028\u00002\u001e\u0010&\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020)0(0\'\"\b\u0012\u0004\u0012\u00020)0(\u00a2\u0006\u0002\u0010*J+\u0010+\u001a\u00028\u00002\u001e\u0010&\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020)0(0\'\"\b\u0012\u0004\u0012\u00020)0(\u00a2\u0006\u0002\u0010*J+\u0010,\u001a\u00028\u00002\u001e\u0010&\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020)0(0\'\"\b\u0012\u0004\u0012\u00020)0(\u00a2\u0006\u0002\u0010*J+\u0010-\u001a\u00028\u00002\u001e\u0010&\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020)0(0\'\"\b\u0012\u0004\u0012\u00020)0(\u00a2\u0006\u0002\u0010*R \u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!\u00a8\u0006."}, d2 = {"Lmain/kotlin/models/models/query/assoc/QAssocBill;", "R", "Lio/ebean/typequery/TQAssocBean;", "Lmain/kotlin/models/models/Bill;", "name", "", "root", "(Ljava/lang/String;Ljava/lang/Object;)V", "prefix", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "amount", "Lio/ebean/typequery/PDouble;", "getAmount", "()Lio/ebean/typequery/PDouble;", "setAmount", "(Lio/ebean/typequery/PDouble;)V", "billId", "Lio/ebean/typequery/PInteger;", "getBillId", "()Lio/ebean/typequery/PInteger;", "setBillId", "(Lio/ebean/typequery/PInteger;)V", "billName", "Lio/ebean/typequery/PString;", "getBillName", "()Lio/ebean/typequery/PString;", "setBillName", "(Lio/ebean/typequery/PString;)V", "listOfPeople", "Lmodels/query/assoc/QAssocUser;", "getListOfPeople", "()Lmodels/query/assoc/QAssocUser;", "setListOfPeople", "(Lmodels/query/assoc/QAssocUser;)V", "payee", "getPayee", "setPayee", "fetch", "properties", "", "Lio/ebean/typequery/TQProperty;", "Lmain/kotlin/models/models/query/QBill;", "([Lio/ebean/typequery/TQProperty;)Ljava/lang/Object;", "fetchCache", "fetchLazy", "fetchQuery", "SplitBill"})
@io.ebean.typequery.TypeQueryBean()
public final class QAssocBill<R extends java.lang.Object> extends io.ebean.typequery.TQAssocBean<main.kotlin.models.models.Bill, R> {
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PInteger<R> billId;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PString<R> billName;
    @org.jetbrains.annotations.NotNull()
    public models.query.assoc.QAssocUser<R> listOfPeople;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PDouble<R> amount;
    @org.jetbrains.annotations.NotNull()
    public models.query.assoc.QAssocUser<R> payee;
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PInteger<R> getBillId() {
        return null;
    }
    
    public final void setBillId(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PInteger<R> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PString<R> getBillName() {
        return null;
    }
    
    public final void setBillName(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PString<R> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final models.query.assoc.QAssocUser<R> getListOfPeople() {
        return null;
    }
    
    public final void setListOfPeople(@org.jetbrains.annotations.NotNull()
    models.query.assoc.QAssocUser<R> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PDouble<R> getAmount() {
        return null;
    }
    
    public final void setAmount(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PDouble<R> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final models.query.assoc.QAssocUser<R> getPayee() {
        return null;
    }
    
    public final void setPayee(@org.jetbrains.annotations.NotNull()
    models.query.assoc.QAssocUser<R> p0) {
    }
    
    /**
     * Eagerly fetch this association loading the specified properties.
     */
    public final R fetch(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.TQProperty<main.kotlin.models.models.query.QBill>... properties) {
        return null;
    }
    
    /**
     * Eagerly fetch this association using a 'query join' loading the specified properties.
     */
    public final R fetchQuery(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.TQProperty<main.kotlin.models.models.query.QBill>... properties) {
        return null;
    }
    
    /**
     * Eagerly fetch this association using L2 cache.
     */
    public final R fetchCache(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.TQProperty<main.kotlin.models.models.query.QBill>... properties) {
        return null;
    }
    
    /**
     * Use lazy loading for this association loading the specified properties.
     */
    public final R fetchLazy(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.TQProperty<main.kotlin.models.models.query.QBill>... properties) {
        return null;
    }
    
    public QAssocBill(@org.jetbrains.annotations.NotNull()
    java.lang.String name, R root) {
        super(null, null);
    }
    
    public QAssocBill(@org.jetbrains.annotations.NotNull()
    java.lang.String name, R root, @org.jetbrains.annotations.NotNull()
    java.lang.String prefix) {
        super(null, null);
    }
}