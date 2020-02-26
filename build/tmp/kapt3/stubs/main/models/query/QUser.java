package models.query;

import java.lang.System;

/**
 * Query bean for User.
 *
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@javax.annotation.Generated(value = {"io.ebean.querybean.kotlin-generator"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\"B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0006B\u000f\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB\u0015\b\u0012\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u00a2\u0006\u0002\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006#"}, d2 = {"Lmodels/query/QUser;", "Lio/ebean/typequery/TQRootBean;", "Lmodels/User;", "database", "Lio/ebean/Database;", "(Lio/ebean/Database;)V", "()V", "dummy", "", "(Z)V", "fetchGroupQuery", "Lio/ebean/Query;", "(Lio/ebean/Query;)V", "email", "Lio/ebean/typequery/PString;", "getEmail", "()Lio/ebean/typequery/PString;", "setEmail", "(Lio/ebean/typequery/PString;)V", "firstName", "getFirstName", "setFirstName", "user", "Lmodels/query/assoc/QAssocUser;", "getUser", "()Lmodels/query/assoc/QAssocUser;", "setUser", "(Lmodels/query/assoc/QAssocUser;)V", "userId", "Lio/ebean/typequery/PInteger;", "getUserId", "()Lio/ebean/typequery/PInteger;", "setUserId", "(Lio/ebean/typequery/PInteger;)V", "Companion", "SplitBill"})
@io.ebean.typequery.TypeQueryBean()
public final class QUser extends io.ebean.typequery.TQRootBean<models.User, models.query.QUser> {
    @org.jetbrains.annotations.NotNull()
    public models.query.assoc.QAssocUser<models.query.QUser> user;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PInteger<models.query.QUser> userId;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PString<models.query.QUser> firstName;
    @org.jetbrains.annotations.NotNull()
    public io.ebean.typequery.PString<models.query.QUser> email;
    
    /**
     * shared 'Alias' instance used to provide
     * properties to select and fetch clauses
     */
    @org.jetbrains.annotations.NotNull()
    private static final models.query.QUser _alias = null;
    public static final models.query.QUser.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final models.query.assoc.QAssocUser<models.query.QUser> getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    models.query.assoc.QAssocUser<models.query.QUser> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PInteger<models.query.QUser> getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PInteger<models.query.QUser> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PString<models.query.QUser> getFirstName() {
        return null;
    }
    
    public final void setFirstName(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PString<models.query.QUser> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.typequery.PString<models.query.QUser> getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    io.ebean.typequery.PString<models.query.QUser> p0) {
    }
    
    /**
     * Construct with a given Database.
     */
    public QUser(@org.jetbrains.annotations.NotNull()
    io.ebean.Database database) {
        super(null);
    }
    
    /**
     * Construct using the default Database.
     */
    public QUser() {
        super(null);
    }
    
    /**
     * Construct for Alias.
     */
    private QUser(boolean dummy) {
        super(null);
    }
    
    /**
     * Private constructor for FetchGroup building.
     */
    private QUser(io.ebean.Query<models.User> fetchGroupQuery) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lmodels/query/QUser$Companion;", "", "()V", "_alias", "Lmodels/query/QUser;", "get_alias", "()Lmodels/query/QUser;", "forFetchGroup", "SplitBill"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final models.query.QUser get_alias() {
            return null;
        }
        
        /**
         * Return a query bean used to build a FetchGroup.
         */
        @org.jetbrains.annotations.NotNull()
        public final models.query.QUser forFetchGroup() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}