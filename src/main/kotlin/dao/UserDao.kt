package dao

import io.ebean.Database
import main.kotlin.models.service.UserServices
import models.User
import models.query.QUser

open class UserDao(var database: Database) {

    open fun userDaoAdd(user: User): User {
        database.save(user)
        return user
    }

    open fun updateUserEmail(userId: Int, email: String) {
        val rows = QUser()
            .userId.eq(userId)
            .asUpdate()
            .set("email", email)
            .update()
    }

    open fun removeUser(userId: Int) {
        val row = QUser()
            .userId.eq(userId)
        database.delete(row)
    }
}