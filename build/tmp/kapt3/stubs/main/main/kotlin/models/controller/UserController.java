package main.kotlin.models.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tH\u0007J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lmain/kotlin/models/controller/UserController;", "", "userServices", "Lmain/kotlin/models/service/UserServices;", "(Lmain/kotlin/models/service/UserServices;)V", "getUserServices", "()Lmain/kotlin/models/service/UserServices;", "createUser", "", "Lmodels/User;", "user", "getUserList", "settlePayment", "", "amount", "", "updateEmail", "userId", "", "email", "", "SplitBill"})
@javax.ws.rs.Produces(value = {"application/json"})
@javax.ws.rs.Path(value = "/User")
public final class UserController {
    @org.jetbrains.annotations.NotNull()
    private final main.kotlin.models.service.UserServices userServices = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Path(value = "/getUserList")
    @javax.ws.rs.GET()
    public final java.util.List<models.User> getUserList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Path(value = "/createUser")
    @javax.ws.rs.POST()
    public final java.util.List<models.User> createUser(@org.jetbrains.annotations.NotNull()
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
    
    @javax.ws.rs.Path(value = "/settlePayment/{amount}")
    @javax.ws.rs.GET()
    public final void settlePayment(@javax.ws.rs.PathParam(value = "amount")
    double amount) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final main.kotlin.models.service.UserServices getUserServices() {
        return null;
    }
    
    public UserController(@org.jetbrains.annotations.NotNull()
    main.kotlin.models.service.UserServices userServices) {
        super();
    }
}