package main.kotlin.models.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020#H\u0007J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000bH\u0007J\u001a\u0010%\u001a\u00020#2\b\b\u0001\u0010&\u001a\u00020\'2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007J\u0012\u0010*\u001a\u00020#2\b\b\u0001\u0010+\u001a\u00020,H\u0007J$\u0010-\u001a\u00020#2\b\b\u0001\u0010&\u001a\u00020\'2\b\b\u0001\u0010+\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J*\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010/\u001a\u00020\'2\b\b\u0001\u00100\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000bH\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0010R\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u00061"}, d2 = {"Lmain/kotlin/models/controller/TestController;", "", "()V", "bill", "Lmain/kotlin/models/models/Bill;", "getBill", "()Lmain/kotlin/models/models/Bill;", "setBill", "(Lmain/kotlin/models/models/Bill;)V", "list", "", "Lmodels/User;", "getList", "()Ljava/util/List;", "user", "getUser", "()Lmodels/User;", "setUser", "(Lmodels/User;)V", "user1", "", "getUser1", "()Ljava/lang/String;", "setUser1", "(Ljava/lang/String;)V", "user2", "getUser2", "setUser2", "user3", "getUser3", "userFunctions", "Lmain/kotlin/models/service/UserFunctions;", "getUserFunctions", "()Lmain/kotlin/models/service/UserFunctions;", "addBill", "", "createUser", "deleteBill", "billId", "", "getBillsList", "getUserList", "settlePayment", "amount", "", "updateBill", "updateEmail", "userId", "email", "SplitBill"})
@javax.ws.rs.Produces(value = {"application/json"})
@javax.ws.rs.Path(value = "/User")
public final class TestController {
    @org.jetbrains.annotations.NotNull()
    private final main.kotlin.models.service.UserFunctions userFunctions = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String user1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String user2;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<models.User> list = null;
    @org.jetbrains.annotations.NotNull()
    private final models.User user3 = null;
    @org.jetbrains.annotations.NotNull()
    private main.kotlin.models.models.Bill bill;
    @org.jetbrains.annotations.NotNull()
    private models.User user;
    
    @org.jetbrains.annotations.NotNull()
    public final main.kotlin.models.service.UserFunctions getUserFunctions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUser1() {
        return null;
    }
    
    public final void setUser1(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUser2() {
        return null;
    }
    
    public final void setUser2(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Path(value = "/getUserList")
    @javax.ws.rs.GET()
    public final java.util.List<models.User> getUserList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Path(value = "/createUser")
    @javax.ws.rs.POST()
    public final java.lang.String createUser(@org.jetbrains.annotations.NotNull()
    models.User user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Path(value = "/user")
    @javax.ws.rs.PUT()
    public final java.util.List<models.User> updateEmail(@javax.ws.rs.QueryParam(value = "userId")
    int userId, @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.QueryParam(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    models.User user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Path(value = "/getBillsList")
    @javax.ws.rs.GET()
    public final java.util.List<main.kotlin.models.models.Bill> getBillsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<models.User> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final models.User getUser3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final main.kotlin.models.models.Bill getBill() {
        return null;
    }
    
    public final void setBill(@org.jetbrains.annotations.NotNull()
    main.kotlin.models.models.Bill p0) {
    }
    
    @javax.ws.rs.Path(value = "/createBill")
    @javax.ws.rs.POST()
    public final void addBill() {
    }
    
    @javax.ws.rs.Path(value = "/{billId}/{amount}")
    @javax.ws.rs.PUT()
    public final void updateBill(@javax.ws.rs.PathParam(value = "billId")
    int billId, @javax.ws.rs.PathParam(value = "amount")
    double amount, @org.jetbrains.annotations.NotNull()
    main.kotlin.models.models.Bill bill) {
    }
    
    @javax.ws.rs.Path(value = "/deleteBill/{billId}")
    @javax.ws.rs.DELETE()
    public final void deleteBill(@javax.ws.rs.PathParam(value = "billId")
    int billId, @org.jetbrains.annotations.NotNull()
    main.kotlin.models.models.Bill bill) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final models.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    models.User p0) {
    }
    
    @javax.ws.rs.Path(value = "/settlePayment/{amount}")
    @javax.ws.rs.GET()
    public final void settlePayment(@javax.ws.rs.PathParam(value = "amount")
    double amount) {
    }
    
    public TestController() {
        super();
    }
}