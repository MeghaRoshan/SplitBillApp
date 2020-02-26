package main.kotlin.models.service

import dao.BillDao
import main.kotlin.models.models.Bill
import models.User

class BillServices(var billDao: BillDao) {
    private val userList = mutableListOf<User>()
    private val billsList = mutableListOf<Bill>()
    fun createBill(
        billId: Int,
        billName: String,
        listOfPeople: MutableList<User> = mutableListOf(),
        amount : Double,
        payee: User
    ) {
        addBill(Bill(billId, billName, listOfPeople, amount, payee))
    }
    fun addBill(bill: Bill):Bill {
        //billsList.add(bill)

        splitExpense(bill)
        return billDao.addBill(bill)
    }

    fun getBillsList() = billsList

    fun getBill(billId: Int):Bill? = billsList.first {
        it.billId == billId
    }
    fun updateBill(billId: Int,amount: Double ){
        getBill(billId)?.let{bill -> bill.amount=amount }
    }

    fun deleteBill(billId: Int){
        billsList.remove(getBill(billId))
    }

    fun splitExpense(bill: Bill) {
        val amt = bill.amount / bill.listOfPeople.size + 1
        val userIdList = mutableListOf<Int>()
        bill.listOfPeople.forEach {
            userIdList.add(it.userId)
        }
        userList
            .filter {
                it.userId in userIdList
            }
            .map {
                val previousDebt = it.owes.getOrDefault(bill.payee.userId, 0.0)
                val newDebt = previousDebt + amt
                it.owes[bill.payee.userId] = newDebt
            }
    }

}