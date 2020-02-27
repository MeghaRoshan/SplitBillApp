package dao;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0012"}, d2 = {"Ldao/UserDao;", "", "database", "Lio/ebean/Database;", "(Lio/ebean/Database;)V", "getDatabase", "()Lio/ebean/Database;", "setDatabase", "removeUser", "", "userId", "", "updateUserEmail", "email", "", "userDaoAdd", "Lmodels/User;", "user", "SplitBill"})
public class UserDao {
    @org.jetbrains.annotations.NotNull()
    private io.ebean.Database database;
    
    @org.jetbrains.annotations.NotNull()
    public models.User userDaoAdd(@org.jetbrains.annotations.NotNull()
    models.User user) {
        return null;
    }
    
    public void updateUserEmail(int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    public void removeUser(int userId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.ebean.Database getDatabase() {
        return null;
    }
    
    public final void setDatabase(@org.jetbrains.annotations.NotNull()
    io.ebean.Database p0) {
    }
    
    public UserDao(@org.jetbrains.annotations.NotNull()
    io.ebean.Database database) {
        super();
    }
}