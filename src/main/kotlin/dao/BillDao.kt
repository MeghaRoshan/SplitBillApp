package dao

import dao.UserDao
import io.ebean.Database
import main.kotlin.models.models.Bill
import main.kotlin.models.models.query.QBill
import models.User
import models.query.QUser

open class BillDao(var database: Database) {

    open fun addBill(bill: Bill):Bill{
        database.save(bill)
        return bill
    }
    open fun updateBillAmount(billId: Int, amount: Double) {
        val rows = QBill()
            .billId.eq(billId)
            .asUpdate()
            .set("amount", amount)
            .update()
    }

    open fun removeBill(billId: Int) {
        val row = QBill()
            .billId.eq(billId)
        database.delete(row)

    }

    open fun updateBillUser(billId:Int, user: User){

         var list =QBill().billId.equalTo(billId).findOne()
        if (list != null) {
            list.listOfPeople.add(user)
        }
            database.update(list)
    }
    open fun undoDeleteBill(bill: Bill){
        database.save(bill)
    }




}