package models

import main.kotlin.models.SplitBill
import main.kotlin.models.models.Bill
import main.kotlin.models.models.numOfPeople

class User (UId: Int, firstName: String, email: String, private var paid: Double, owes: Double) {

   private var owes: Double = 0.0
    var firstName: String
    var UId: Int
    var email: String = ""
        set(value){ field= value}
    val list= mutableListOf("alice", "bob", "janice")
    var bill= Bill("lunch", list, 3000.0, "alice" )

    init {
        this.firstName=firstName
        this.UId=UId
        this.email=email
//        if (bill.listOfPeople.contains(firstName)) this.owes = bill.amount / bill.listOfPeople.size
        this.owes=owes

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
//        val user=getUser(id)
//        user.email=email
        this.email=email
    }
    val User= User(1, "alice", "megharoshan21@gmail.com" , 3000.0, 0.0)

    fun splitExpense(){
        val amt= bill.amount/ numOfPeople +1
        for( i in list) {
            setOwes(amt)
        }}


    }





/* assign values as val user = User(1, Megha, megharoshan21@gmail.com, 2000, 0)
 change values through set method
 */