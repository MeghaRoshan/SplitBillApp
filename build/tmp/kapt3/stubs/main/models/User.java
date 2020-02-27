package models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bH\u00c6\u0003J3\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u00d6\u0003J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001J\t\u0010-\u001a\u00020\u0005H\u00d6\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R:\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0015j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016`\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR:\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0015j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016`\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006."}, d2 = {"Lmodels/User;", "Lio/ebean/Model;", "userId", "", "firstName", "", "email", "bill", "Lmain/kotlin/models/models/Bill;", "(ILjava/lang/String;Ljava/lang/String;Lmain/kotlin/models/models/Bill;)V", "getBill", "()Lmain/kotlin/models/models/Bill;", "setBill", "(Lmain/kotlin/models/models/Bill;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getFirstName", "setFirstName", "owes", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getOwes", "()Ljava/util/HashMap;", "setOwes", "(Ljava/util/HashMap;)V", "paid", "getPaid", "setPaid", "getUserId", "()I", "setUserId", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "SplitBill"})
@javax.persistence.Table(name = "users_table")
@javax.persistence.Entity()
public final class User extends io.ebean.Model {
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Column()
    private java.util.HashMap<java.lang.Integer, java.lang.Double> paid;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Column()
    private java.util.HashMap<java.lang.Integer, java.lang.Double> owes;
    @javax.persistence.Id()
    private int userId;
    @org.jetbrains.annotations.NotNull()
    @io.ebean.annotation.Length(value = 100)
    private java.lang.String firstName;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Column(unique = true)
    private java.lang.String email;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.JoinColumn(name = "billId")
    @javax.persistence.ManyToOne()
    private main.kotlin.models.models.Bill bill;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.Integer, java.lang.Double> getPaid() {
        return null;
    }
    
    public final void setPaid(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.Integer, java.lang.Double> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.Integer, java.lang.Double> getOwes() {
        return null;
    }
    
    public final void setOwes(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.Integer, java.lang.Double> p0) {
    }
    
    public final int getUserId() {
        return 0;
    }
    
    public final void setUserId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    public final void setFirstName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final main.kotlin.models.models.Bill getBill() {
        return null;
    }
    
    public final void setBill(@org.jetbrains.annotations.Nullable()
    main.kotlin.models.models.Bill p0) {
    }
    
    public User(int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    main.kotlin.models.models.Bill bill) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final main.kotlin.models.models.Bill component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final models.User copy(int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    main.kotlin.models.models.Bill bill) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}