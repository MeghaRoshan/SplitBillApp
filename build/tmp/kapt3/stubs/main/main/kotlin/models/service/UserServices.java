package main.kotlin.models.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fJ\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0012J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0017\u001a\u00020\u0012J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u0006J\u001e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lmain/kotlin/models/service/UserServices;", "", "userDao", "Ldao/UserDao;", "(Ldao/UserDao;)V", "billsList", "", "Lmain/kotlin/models/models/Bill;", "getUserDao", "()Ldao/UserDao;", "setUserDao", "userList", "Lmodels/User;", "addUser", "user", "createUser", "", "uId", "", "firstName", "", "email", "deleteUser", "userId", "getUser", "getUserList", "settlePayment", "from", "to", "amount", "", "updateEmail", "SplitBill"})
public class UserServices {
    private final java.util.List<models.User> userList = null;
    private final java.util.List<main.kotlin.models.models.Bill> billsList = null;
    @org.jetbrains.annotations.NotNull()
    private dao.UserDao userDao;
    
    @org.jetbrains.annotations.NotNull()
    public final models.User addUser(@org.jetbrains.annotations.NotNull()
    models.User user) {
        return null;
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
    
    public final void updateEmail(int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    public final void deleteUser(int userId) {
    }
    
    public final void settlePayment(@org.jetbrains.annotations.NotNull()
    models.User from, @org.jetbrains.annotations.NotNull()
    models.User to, double amount) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dao.UserDao getUserDao() {
        return null;
    }
    
    public final void setUserDao(@org.jetbrains.annotations.NotNull()
    dao.UserDao p0) {
    }
    
    public UserServices(@org.jetbrains.annotations.NotNull()
    dao.UserDao userDao) {
        super();
    }
}