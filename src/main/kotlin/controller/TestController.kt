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
    var user1= createUser(User(1, "alice","aliceroshan@gmail.com"))
    var user2= createUser(User(2, "bob","bobroshan@gmail.com"))


    @GET
    @Path("/getUserList")
    fun getUserList(): MutableList<User> {
        return userFunctions.getUserList()
    }

    @POST
    @Path("/createUser")
    fun createUser(user:User):String{
        userFunctions.addUser(user)
        return "User successfully created"
    }

    @PUT
    @Path("/user")
    fun updateEmail(@QueryParam("userId") userId:Int,
                    @QueryParam("email") email:String,
                    user:User): MutableList<User> {
        userFunctions.updateEmail(userId, email)
        return userFunctions.getUserList()
    }

    @GET
    @Path("/getBillsList")
    fun getBillsList(): MutableList<Bill> {
        return userFunctions.getBillsList()
    }

    val list= getUserList()
    val user3= User(4, "maria","mariaroshan@gmail.com")
    var bill= Bill(1, "lunch", list,amount= 400.0, payee= user3)
    @POST
    @Path("/createBill")
    fun addBill(){
        userFunctions.addBill(bill)
    }

    @PUT
    @Path("/{billId}/{amount}")
    fun updateBill(@PathParam("billId") billId:Int,
                    @PathParam("amount") amount:Double,
                    bill: Bill){
        userFunctions.updateBill(billId, amount)
    }

   @DELETE
   @Path("/deleteBill/{billId}")
   fun deleteBill(@PathParam("billId") billId: Int, bill:Bill){
       userFunctions.deleteBill(billId)
   }
    var user=User(3, "janice", "janiceroshan@gmail.com")
    @GET
    @Path("/settlePayment/{amount}")
    fun settlePayment(@PathParam("amount") amount: Double){
        userFunctions.settlePayment(user, user3, amount)
    }
}

