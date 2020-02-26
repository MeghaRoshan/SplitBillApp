package main.kotlin.models.service

import dao.UserDao
import models.User
import main.kotlin.models.models.Bill


class UserServices(var userDao: UserDao) {

    private val userList = mutableListOf<User>()

    private val billsList = mutableListOf<Bill>()

    // region user and bill


    fun addUser(user: User): User {
//        userList.add(user)
        return userDao.userDaoAdd(user)
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


    fun updateEmail(userId: Int, email: String) {
        //getUser(userId)?.let{user -> user.email=email }
        userDao.updateUserEmail(userId, email)
    }


    fun deleteUser(userId: Int) {
        userList.remove(getUser(userId))
    }

    // endregion


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
