package main.kotlin.models.controller

import main.kotlin.models.models.Bill
import main.kotlin.models.service.UserFunctions
import models.User
import javax.ws.rs.*
import javax.ws.rs.core.MediaType


@Path("/User")
@Produces(MediaType.APPLICATION_JSON)
class TestController {
    val userFunctions = UserFunctions() //TODO: Field dependency injection :)
    private val userList = mutableListOf<User>()
    
    @GET
    @Path("/{uId}")
    fun getUser(@PathParam("uId") uId: Int):User? {
        return userList[uId]

    }
//    @GET
//    @Path("/get/user")
//    fun getUser():User{
//        return uf.getUser()
//    }
//    @POST
//    @Path("add/{id}/{name}/{email}")
//    fun createUser(@PathParam("id" ) id:Int, @PathParam("name") name:String, @PathParam("email") email:String):User{
//        return User(id, name, email)
//    }


}

