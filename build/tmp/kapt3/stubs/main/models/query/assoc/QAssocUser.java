package models.query.assoc;

import java.lang.System;

/**
 * Association query bean for AssocUser.
 *
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@javax.annotation.Generated(value = {"io.ebean.querybean.kotlin-generator"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ+\u0010\u001e\u001a\u00028\u00002\u001e\u0010\u001f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\"0!0 \"\b\u0012\u0004\u0012\u00020\"0!\u00a2\u0006\u0002\u0010#J+\u0010$\u001a\u00028\u00002\u001e\u0010\u001f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\"0!0 \"\b\u0012\u0004\u0012\u00020\"0!\u00a2\u0006\u0002\u0010#J+\u0010%\u001a\u00028\u00002\u001e\u0010\u001f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\"0!0 \"\b\u0012\u0004\u0012\u00020\"0!\u00a2\u0006\u0002\u0010#J+\u0010&\u001a\u00028\u00002\u001e\u0010\u001f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\"0!0 \"\b\u0012\u0004\u0012\u00020\"0!\u00a2\u0006\u0002\u0010#R \u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006\'"}, d2 = {"Lmodels/query/assoc/QAssocUser;", "R", "Lio/ebean/typequery/TQAssocBean;", "Lmodels/User;", "name", "", "root", "(Ljava/lang/String;Ljava/lang/Object;)V", "prefix", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "email", "Lio/ebean/typequery/PString;", "getEmail", "()Lio/ebean/typequery/PString;", "setEmail", "(Lio/ebean/typequery/PString;)V", "firstName", "getFirstName", "setFirstName", "user", "getUser", "()Lmodels/query/assoc/QAssocUser;", "setUser", "(Lmodels/query/assoc/QAssocUser;)V", "userId", "Lio/ebean/typequery/PInteger;", "getUserId", "()Lio/ebean/typequery/PInteger;", "setUserId", "(Lio/ebean/typequery/PInteger;)V", "fetch", "properties", "", "Lio/ebean/typequery/TQProperty;", "Lmodels/query/QUser;", "([Lio/ebean/typequery/TQProperty;)Ljava/lang/Object;", "fetchCache", "fetchLazy", "fetchQuery", "SplitBill"})
@io.ebean.typequery.TypeQueryBean()
public final class QAssocUser<R extends java.lang.Object> extends io.ebean.typequery.TQAssocBean<models.User, R> {
    @org.jetbrains.annotations.NotNull()
    public models.query.assoc.QAssocUser<R> user;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PInteger<R> userId;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PString<R> firstName;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PString<R> email;
    
    @org.jetbrains.annotations.NotNull()
    public final models.query.assoc.QAssocUser<R> getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    models.query.assoc.QAssocUser<R> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PInteger<R> getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PInteger<R> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PString<R> getFirstName() {
        return null;
    }
    
    public final void setFirstName(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PString<R> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PString<R> getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PString<R> p0) {
    }
    
    /**
     * Eagerly fetch this association loading the specified properties.
     */
    public final R fetch(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.TQProperty<models.query.QUser>... properties) {
        return null;
    }
    
    /**
     * Eagerly fetch this association using a 'query join' loading the specified properties.
     */
    public final R fetchQuery(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.TQProperty<models.query.QUser>... properties) {
        return null;
    }
    
    /**
     * Eagerly fetch this association using L2 cache.
     */
    public final R fetchCache(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.TQProperty<models.query.QUser>... properties) {
        return null;
    }
    
    /**
     * Use lazy loading for this association loading the specified properties.
     */
    public final R fetchLazy(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.TQProperty<models.query.QUser>... properties) {
        return null;
    }
    
    public QAssocUser(@org.jetbrains.annotations.NotNull()
    java.lang.String name, R root) {
        super(null, null);
    }
    
    public QAssocUser(@org.jetbrains.annotations.NotNull()
    java.lang.String name, R root, @org.jetbrains.annotations.NotNull()
    java.lang.String prefix) {
        super(null, null);
    }
}