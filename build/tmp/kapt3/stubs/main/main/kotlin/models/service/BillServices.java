package main.kotlin.models.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0016J6\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rJ\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0013J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010 \u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lmain/kotlin/models/service/BillServices;", "", "billDao", "Ldao/BillDao;", "(Ldao/BillDao;)V", "getBillDao", "()Ldao/BillDao;", "setBillDao", "billsList", "", "Lmain/kotlin/models/models/Bill;", "deletedBillsList", "userList", "Lmodels/User;", "addBill", "bill", "createBill", "", "billId", "", "billName", "", "listOfPeople", "amount", "", "payee", "deleteBill", "getBill", "getBillsList", "splitExpense", "undoDelBill", "updateBill", "updateBillUser", "user", "SplitBill"})
public final class BillServices {
    private final java.util.List<models.User> userList = null;
    private final java.util.List<main.kotlin.models.models.Bill> billsList = null;
    private final java.util.List<main.kotlin.models.models.Bill> deletedBillsList = null;
    @org.jetbrains.annotations.NotNull()
    private dao.BillDao billDao;
    
    public final void createBill(int billId, @org.jetbrains.annotations.NotNull()
    java.lang.String billName, @org.jetbrains.annotations.NotNull()
    java.util.List<models.User> listOfPeople, double amount, @org.jetbrains.annotations.NotNull()
    models.User payee) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public main.kotlin.models.models.Bill addBill(@org.jetbrains.annotations.NotNull()
    main.kotlin.models.models.Bill bill) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<main.kotlin.models.models.Bill> getBillsList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final main.kotlin.models.models.Bill getBill(int billId) {
        return null;
    }
    
    public final void updateBill(int billId, double amount) {
    }
    
    public final void updateBillUser(int billId, @org.jetbrains.annotations.NotNull()
    models.User user) {
    }
    
    public final void deleteBill(int billId) {
    }
    
    public final void undoDelBill(int billId) {
    }
    
    public final void splitExpense(@org.jetbrains.annotations.NotNull()
    main.kotlin.models.models.Bill bill) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dao.BillDao getBillDao() {
        return null;
    }
    
    public final void setBillDao(@org.jetbrains.annotations.NotNull()
    dao.BillDao p0) {
    }
    
    public BillServices(@org.jetbrains.annotations.NotNull()
    dao.BillDao billDao) {
        super();
    }
}