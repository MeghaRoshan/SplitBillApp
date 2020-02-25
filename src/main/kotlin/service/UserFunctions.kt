package main.kotlin.models.service

import models.User
import main.kotlin.models.models.Bill



class UserFunctions {

    private val userList = mutableListOf<User>()

    private val billsList = mutableListOf<Bill>()

    // region user and bill



    fun addUser(user: User) {
        userList.add(user)
    }

    fun getUserList() = userList

    fun getUser(userId: Int): User? = userList.first {
        it.userId == userId
    }

    fun createUser(
        uId: Int,
        firstName: String,
        email: String
    ) {
        val user = getUser(uId)
        user?.owes
        addUser(User(uId, firstName, email))
    }

    fun getBillsList() = billsList

    fun createBill(
        billId: Int,
        billName: String,
        listOfPeople: MutableList<User> = mutableListOf(),
        amount : Double,
        payee: User
    ) {
        addBill(Bill(billId, billName, listOfPeople, amount, payee))
    }

    fun addBill(bill: Bill) {
        billsList.add(bill)
        splitExpense(bill)
    }

    fun getBill(billId: Int):Bill? = billsList.first {
        it.billId == billId
    }
    fun updateEmail(userId: Int, email:String){
        getUser(userId)?.let{user -> user.email=email}
    }

    fun updateBill(billId: Int,amount: Double ){
        getBill(billId)?.let{bill -> bill.amount=amount }
    }

    fun deleteBill(billId: Int){
        billsList.remove(getBill(billId))
    }

    fun deleteUser(userId:Int){
        userList.remove(getUser(userId))
    }

    // endregion

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

    fun settlePayment(from: User, to: User, amount: Double) {
        val previousPaidAmount = from.paid.getOrDefault(to.userId, 0.0)
        val newPaidAmount = previousPaidAmount + amount
        from.paid[to.userId] = newPaidAmount

        val previousOwedAmount = from.owes.getOrDefault(to.userId, 0.0)
        if (previousOwedAmount - amount < 0) {
            val negativeAmount = amount - previousOwedAmount
            val prevOwed = to.owes.getOrDefault(from.userId, 0.0)
            val newOwed = prevOwed + negativeAmount
            to.owes[from.userId] = newOwed

            //from.owes[to.uId] = 0.0
        } else {
            val newOwedAmount = previousOwedAmount - amount
            from.owes[to.userId] = newOwedAmount
        }
    }
}
