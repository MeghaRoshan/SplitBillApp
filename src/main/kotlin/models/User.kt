package models

import main.kotlin.models.models.Bill

class User (UId: Int, firstName: String, email: String, private var paid: Double, owes: Double) {

    private var owes: Double = 0.0
    private var firstName: String = firstName
    private var UId: Int = UId
    private var email: String = email

    set(value){ field= value}


    init {

        if (Bill.listOfPeople.contains(firstName)) this.owes = Bill.amount / Bill.listOfPeople.size

    }

    fun getPaid(): Double {
        return this.paid; }

    fun getOwes(): Double {
        return owes; }

    fun setOwes(owes: Double) {
        this.owes = owes
    }

    fun getUser(id: Int) {
        if (id == UId) {
            println("The User is $firstName with email $email with following account: paid: $paid , owes: $owes")

        }
    }
    fun setEmail(id:Int, email:String) {
        val user=getUser(id)
        user.email=email
        return user
    }
}



/* assign values as val user = User(1, Megha, megharoshan21@gmail.com, 2000, 0)
 change values through set method
 */