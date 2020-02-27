package dao

import dao.UserDao
import io.ebean.Database
import main.kotlin.models.models.Bill
import main.kotlin.models.models.query.QBill
import models.User
import models.query.QUser

class BillDao(var database: Database) {

    fun addBill(bill: Bill):Bill{
        database.save(bill)
        return bill
    }
    fun updateBillAmount(billId: Int, amount: Double) {
        val rows = QBill()
            .billId.eq(billId)
            .asUpdate()
            .set("amount", amount)
            .update()
    }

    fun removeBill(billId: Int) {
        val row = QBill()
            .billId.eq(billId)
        database.delete(row)

    }

    fun updateBillUser(billId:Int, user: User){

         var list =QBill().billId.equalTo(billId).findOne()
        if (list != null) {
            list.listOfPeople.add(user)
        }
            database.update(list)
    }
    fun undoDeleteBill(bill: Bill){
        database.save(bill)
    }




}