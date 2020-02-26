package main.kotlin.models.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007J6\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007J\u001e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011J\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001c\u001a\u00020\u000fJ\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0004J\u001e\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010$\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u0016\u0010%\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010&\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0011R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lmain/kotlin/models/service/UserServices;", "", "()V", "billsList", "", "Lmain/kotlin/models/models/Bill;", "userList", "Lmodels/User;", "addBill", "", "bill", "addUser", "user", "createBill", "billId", "", "billName", "", "listOfPeople", "amount", "", "payee", "createUser", "uId", "firstName", "email", "deleteBill", "deleteUser", "userId", "getBill", "getBillsList", "getUser", "getUserList", "settlePayment", "from", "to", "splitExpense", "updateBill", "updateEmail", "SplitBill"})
public final class UserServices {
    private final java.util.List<models.User> userList = null;
    private final java.util.List<main.kotlin.models.models.Bill> billsList = null;
    
    public final void addUser(@org.jetbrains.annotations.NotNull()
    models.User user) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<models.User> getUserList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final models.User getUser(int userId) {
        return null;
    }
    
    public final void createUser(int uId, @org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    public final void createBill(int billId, @org.jetbrains.annotations.NotNull()
    java.lang.String billName, @org.jetbrains.annotations.NotNull()
    java.util.List<models.User> listOfPeople, double amount, @org.jetbrains.annotations.NotNull()
    models.User payee) {
    }
    
    public final void addBill(@org.jetbrains.annotations.NotNull()
    main.kotlin.models.models.Bill bill) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<main.kotlin.models.models.Bill> getBillsList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final main.kotlin.models.models.Bill getBill(int billId) {
        return null;
    }
    
    public final void updateEmail(int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    public final void updateBill(int billId, double amount) {
    }
    
    public final void deleteBill(int billId) {
    }
    
    public final void deleteUser(int userId) {
    }
    
    public final void splitExpense(@org.jetbrains.annotations.NotNull()
    main.kotlin.models.models.Bill bill) {
    }
    
    public final void settlePayment(@org.jetbrains.annotations.NotNull()
    models.User from, @org.jetbrains.annotations.NotNull()
    models.User to, double amount) {
    }
    
    public UserServices() {
        super();
    }
}