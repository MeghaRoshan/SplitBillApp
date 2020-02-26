package main.kotlin.models.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0007J\u0012\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u001dH\u0007J*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\b\b\u0001\u0010\u001f\u001a\u00020 2\b\b\u0001\u0010!\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lmain/kotlin/models/controller/UserController;", "", "userServices", "Lmain/kotlin/models/service/UserServices;", "(Lmain/kotlin/models/service/UserServices;)V", "user", "Lmodels/User;", "getUser", "()Lmodels/User;", "setUser", "(Lmodels/User;)V", "user1", "", "getUser1", "()Ljava/util/List;", "setUser1", "(Ljava/util/List;)V", "user2", "getUser2", "setUser2", "user3", "getUser3", "getUserServices", "()Lmain/kotlin/models/service/UserServices;", "createUser", "getUserList", "settlePayment", "", "amount", "", "updateEmail", "userId", "", "email", "", "SplitBill"})
@javax.ws.rs.Produces(value = {"application/json"})
@javax.ws.rs.Path(value = "/User")
public final class UserController {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<models.User> user1;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<models.User> user2;
    @org.jetbrains.annotations.NotNull()
    private models.User user;
    @org.jetbrains.annotations.NotNull()
    private final models.User user3 = null;
    @org.jetbrains.annotations.NotNull()
    private final main.kotlin.models.service.UserServices userServices = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<models.User> getUser1() {
        return null;
    }
    
    public final void setUser1(@org.jetbrains.annotations.NotNull()
    java.util.List<models.User> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<models.User> getUser2() {
        return null;
    }
    
    public final void setUser2(@org.jetbrains.annotations.NotNull()
    java.util.List<models.User> p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final models.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    models.User p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final models.User getUser3() {
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