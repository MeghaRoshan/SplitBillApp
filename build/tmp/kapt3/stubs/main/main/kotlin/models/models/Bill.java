package main.kotlin.models.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\nH\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bH\u00c6\u0003JC\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001J\t\u0010$\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006%"}, d2 = {"Lmain/kotlin/models/models/Bill;", "Lio/ebean/Model;", "billId", "", "billName", "", "listOfPeople", "", "Lmodels/User;", "amount", "", "payee", "(ILjava/lang/String;Ljava/util/List;DLmodels/User;)V", "getAmount", "()D", "setAmount", "(D)V", "getBillId", "()I", "getBillName", "()Ljava/lang/String;", "getListOfPeople", "()Ljava/util/List;", "getPayee", "()Lmodels/User;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "SplitBill"})
@javax.persistence.Table(name = "bills_table")
@javax.persistence.Entity()
public final class Bill extends io.ebean.Model {
    @javax.persistence.Id()
    private final int billId = 0;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Column()
    private final java.lang.String billName = null;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OneToMany(mappedBy = "bill", cascade = {javax.persistence.CascadeType.ALL})
    private final java.util.List<models.User> listOfPeople = null;
    @javax.persistence.Column()
    private double amount;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.OneToOne()
    private final models.User payee = null;
    
    public final int getBillId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBillName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<models.User> getListOfPeople() {
        return null;
    }
    
    public final double getAmount() {
        return 0.0;
    }
    
    public final void setAmount(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final models.User getPayee() {
        return null;
    }
    
    public Bill(int billId, @org.jetbrains.annotations.NotNull()
    java.lang.String billName, @org.jetbrains.annotations.NotNull()
    java.util.List<models.User> listOfPeople, double amount, @org.jetbrains.annotations.Nullable()
    models.User payee) {
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
    public final java.util.List<models.User> component3() {
        return null;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final models.User component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final main.kotlin.models.models.Bill copy(int billId, @org.jetbrains.annotations.NotNull()
    java.lang.String billName, @org.jetbrains.annotations.NotNull()
    java.util.List<models.User> listOfPeople, double amount, @org.jetbrains.annotations.Nullable()
    models.User payee) {
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