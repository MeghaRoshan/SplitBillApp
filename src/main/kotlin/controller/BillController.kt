package main.kotlin.models.controller
import main.kotlin.models.models.Bill
import main.kotlin.models.service.BillServices
import main.kotlin.models.service.UserServices
import models.User
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/Bill")
@Produces(MediaType.APPLICATION_JSON)
class BillController(val billServices: BillServices) {

    @GET
    @Path("/getBillsList")
    fun getBillsList(): MutableList<Bill> {
        return billServices.getBillsList()
    }
    @POST
    @Path("/createBill")
    fun addBill(bill: Bill): MutableList<Bill> {
        billServices.addBill(bill)
        return billServices.getBillsList()
    }
    @PUT
    @Path("/bills")
    fun updateBill(@QueryParam("billId") billId:Int,
                   @QueryParam("amount") amount:Double,
                   bill: Bill): MutableList<Bill> {
        billServices.updateBill(billId, amount)
        return billServices.getBillsList()
    }


    @DELETE
    @Path("/deleteBill")
    fun deleteBill(@QueryParam("billId") billId: Int, bill:Bill){
        billServices.deleteBill(billId)

    }


}