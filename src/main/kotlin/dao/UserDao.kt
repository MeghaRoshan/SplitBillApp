package dao

import io.ebean.Database
import models.User
import models.query.QUser

class UserDao (var database: Database){
    val user=
    database.save(user)

}