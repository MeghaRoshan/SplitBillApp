package dao

import io.ebean.Database
import main.kotlin.models.service.UserServices
import models.User
import models.query.QUser

class UserDao (var database: Database){
    fun userDaoAdd(user: User):User {
        database.save(user)
        return user
    }

//    fun userDaoUpdate(user:User):User{
//        val
//    }


}