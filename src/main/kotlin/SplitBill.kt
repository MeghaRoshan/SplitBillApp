package main.kotlin.models

import main.kotlin.models.models.Bill
import main.kotlin.models.models.numOfPeople
import models.User

class SplitBill {
    companion object{
        @JvmStatic
        fun main(args:Array<String>){
            val User= User(1, "alice", "megharoshan21@gmail.com" , 3000.0, 0.0)
            val list= mutableListOf("alice", "bob", "janice")
            var bill= Bill("lunch", list, 3000.0, "alice" )

          fun getBill():Bill{

              return bill }
            getBill()

            fun splitExpense(){
                val amt=bill.amount/ numOfPeople +1
                for( i in list) {
                    User.setOwes(amt)
                }}
            splitExpense()

        }
    }

}