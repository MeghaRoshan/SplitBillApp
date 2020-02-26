package main.kotlin.models.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ6\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fJ\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u0012J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ\u0016\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lmain/kotlin/models/service/BillServices;", "", "billDao", "Lmain/kotlin/models/Dao/BillDao;", "(Lmain/kotlin/models/Dao/BillDao;)V", "getBillDao", "()Lmain/kotlin/models/Dao/BillDao;", "setBillDao", "billsList", "", "Lmain/kotlin/models/models/Bill;", "userList", "Lmodels/User;", "addBill", "", "bill", "createBill", "billId", "", "billName", "", "listOfPeople", "amount", "", "payee", "deleteBill", "getBill", "getBillsList", "splitExpense", "updateBill", "SplitBill"})
public final class BillServices {
    private final java.util.List<models.User> userList = null;
    private final java.util.List<main.kotlin.models.models.Bill> billsList = null;
    @org.jetbrains.annotations.NotNull()
    private main.kotlin.models.Dao.BillDao billDao;
    
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
    
    public final void updateBill(int billId, double amount) {
    }
    
    public final void deleteBill(int billId) {
    }
    
    public final void splitExpense(@org.jetbrains.annotations.NotNull()
    main.kotlin.models.models.Bill bill) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final main.kotlin.models.Dao.BillDao getBillDao() {
        return null;
    }
    
    public final void setBillDao(@org.jetbrains.annotations.NotNull()
    main.kotlin.models.Dao.BillDao p0) {
    }
    
    public BillServices(@org.jetbrains.annotations.NotNull()
    main.kotlin.models.Dao.BillDao billDao) {
        super();
    }
}