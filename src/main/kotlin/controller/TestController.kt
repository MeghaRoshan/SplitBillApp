package main.kotlin.models.controller

import main.kotlin.models.models.Bill
import main.kotlin.models.service.UserServices
import models.User
import javax.ws.rs.*
import javax.ws.rs.core.MediaType


@Path("/User")
@Produces(MediaType.APPLICATION_JSON)
class TestController {
    val userServices = UserServices()
    var user1= createUser(User(1, "alice","aliceroshan@gmail.com"))
    var user2= createUser(User(2, "bob","bobroshan@gmail.com"))

    @GET
    @Path("/getUserList")
    fun getUserList(): MutableList<User> {
        return userServices.getUserList()
    }



    @POST
    @Path("/createUser")
    fun createUser(user:User): MutableList<User>{
        userServices.addUser(user)

        return userServices.getUserList()
    }



    @PUT
    @Path("/user")
    fun updateEmail(@QueryParam("userId") userId:Int,
                    @QueryParam("email") email:String,
                    user:User): MutableList<User> {
        userServices.updateEmail(userId, email)
        return userServices.getUserList()
    }

//
//    val list= getUserList()
//    val user3= User(4, "maria","mariaroshan@gmail.com")
//    var bill= Bill(1, "lunch", list,amount= 400.0, payee= user3)
    @GET
    @Path("/getBillsList")
    fun getBillsList(): MutableList<Bill> {
        return userServices.getBillsList()
    }

//    val list= getUserList()

//    var bill= Bill(1, "lunch", list,amount= 400.0, payee= user3)


    @POST
    @Path("/createBill")
    fun addBill(bill: Bill): MutableList<Bill> {
        userServices.addBill(bill)
        return userServices.getBillsList()
    }


    @PUT
    @Path("/bills")
    fun updateBill(@QueryParam("billId") billId:Int,
                    @QueryParam("amount") amount:Double,
                    bill: Bill): MutableList<Bill> {
        userServices.updateBill(billId, amount)
        return userServices.getBillsList()
    }


   @DELETE
   @Path("/deleteBill")
   fun deleteBill(@QueryParam("billId") billId: Int, bill:Bill){
       userServices.deleteBill(billId)

   }


    var user=User(3, "janice", "janiceroshan@gmail.com")
    val user3= User(4, "maria","mariaroshan@gmail.com")
    @GET
    @Path("/settlePayment/{amount}")
    fun settlePayment(@PathParam("amount") amount: Double){
        userServices.settlePayment(user, user3, amount)
    }
}

