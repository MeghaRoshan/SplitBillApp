package main.kotlin.models.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0017J\u001a\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0007J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0012\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\tH\u0007J\u001a\u0010\u0014\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lmain/kotlin/models/controller/BillController;", "", "billServices", "Lmain/kotlin/models/service/BillServices;", "(Lmain/kotlin/models/service/BillServices;)V", "getBillServices", "()Lmain/kotlin/models/service/BillServices;", "addBill", "", "Lmain/kotlin/models/models/Bill;", "bill", "deleteBill", "", "billId", "", "getBillsList", "undoDelBill", "updateBill", "amount", "", "updateBillUser", "user", "Lmodels/User;", "SplitBill"})
@javax.ws.rs.Produces(value = {"application/json"})
@javax.ws.rs.Path(value = "/Bill")
public final class BillController {
    @org.jetbrains.annotations.NotNull()
    private final main.kotlin.models.service.BillServices billServices = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Path(value = "/getBillsList")
    @javax.ws.rs.GET()
    public final java.util.List<main.kotlin.models.models.Bill> getBillsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Path(value = "/createBill")
    @javax.ws.rs.POST()
    public java.util.List<main.kotlin.models.models.Bill> addBill(@org.jetbrains.annotations.NotNull()
    main.kotlin.models.models.Bill bill) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Path(value = "/bills")
    @javax.ws.rs.PUT()
    public final java.util.List<main.kotlin.models.models.Bill> updateBill(@javax.ws.rs.QueryParam(value = "billId")
    int billId, @javax.ws.rs.QueryParam(value = "amount")
    double amount, @org.jetbrains.annotations.NotNull()
    main.kotlin.models.models.Bill bill) {
        return null;
    }
    
    @javax.ws.rs.Path(value = "/addUserToBill")
    @javax.ws.rs.PUT()
    public final void updateBillUser(@javax.ws.rs.QueryParam(value = "billId")
    int billId, @org.jetbrains.annotations.NotNull()
    models.User user) {
    }
    
    @javax.ws.rs.Path(value = "/deleteBill")
    @javax.ws.rs.DELETE()
    public final void deleteBill(@javax.ws.rs.QueryParam(value = "billId")
    int billId, @org.jetbrains.annotations.NotNull()
    main.kotlin.models.models.Bill bill) {
    }
    
    @javax.ws.rs.Path(value = "/undoDeleteBill")
    @javax.ws.rs.POST()
    public final void undoDelBill(@javax.ws.rs.QueryParam(value = "billId")
    int billId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final main.kotlin.models.service.BillServices getBillServices() {
        return null;
    }
    
    public BillController(@org.jetbrains.annotations.NotNull()
    main.kotlin.models.service.BillServices billServices) {
        super();
    }
}