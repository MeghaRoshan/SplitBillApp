package dao

import dao.UserDao
import io.ebean.Database
import main.kotlin.models.models.Bill

class BillDao(var database: Database) {

    fun addBill(bill: Bill):Bill{
        database.save(bill)
        return bill
    }
}