package main.kotlin.models.controller

import main.kotlin.models.models.Bill
import main.kotlin.models.service.UserFunctions
import models.User
import javax.ws.rs.*
import javax.ws.rs.core.MediaType


@Path("/User")
@Produces(MediaType.APPLICATION_JSON)
class TestController {
    val userFunctions = UserFunctions()
    private var userList = mutableListOf<User>()
    val user1= userFunctions.createUser(1, "alice","aliceroshan@gmail.com")
    val user2= userFunctions.createUser(2, "bob","bobroshan@gmail.com")


//    @GET
//    @Path("/{uId}")
//    fun getUser(@PathParam("uId") uId: Int):User? {
//        return userList[uId]
//    }

    @GET
    @Path("/getUserList")
    fun getUserList(): MutableList<User> {
        return userFunctions.getUserList()
    }
    var user=User(3, "janice", "janiceroshan@gmail.comk")
    @POST
    fun createUser(user:User):String{
        userFunctions.addUser(user)
        return "User successfully created"
    }
    @GET
    @Path("/getBillsList")
    fun getBillsList():
//    @PUT
//    @Path("/{userId}")
//    fun updateUser(@PathParam("userId") userId:Int , user:User){
//        userList -= userId
//        userList +=user.userId to user
//    }

//    @POST
//    @Path("add/{id}/{name}/{email}")
//    fun createUser(@PathParam("id" ) id:Int, @PathParam("name") name:String, @PathParam("email") email:String):User{
//        return User(id, name, email)
//    }


}

