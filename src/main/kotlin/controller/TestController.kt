package main.kotlin.models.controller

import com.codahale.metrics.annotation.Timed
import main.kotlin.models.models.Bill
import main.kotlin.models.service.Userfunctions
import models.User
import org.eclipse.jetty.http.HttpStatus
import javax.ws.rs.*
import javax.ws.rs.core.MediaType


@Path("/User")
@Produces(MediaType.APPLICATION_JSON)
class TestController {
    val uf= Userfunctions()
//    val list= mutableListOf("alice", "bob", "janice")
//    val bil= Bill("lunch", list, 3000.0, "alice" )
    @GET
    @Path("/get/bil")
    fun getBill(): Bill {
        return uf.getBill()

    }
    @GET
    @Path("/get/user")
    fun getUser():User{
        return uf.getUser()
    }
    @POST
    @Path("add/{id}/{name}/{email}")
    fun createUser(@PathParam("id" ) id:Int, @PathParam("name") name:String, @PathParam("email") email:String):User{
        return User(id, name, email)
    }

    }

