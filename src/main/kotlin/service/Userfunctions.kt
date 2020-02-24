package main.kotlin.models.service
import models.User
import main.kotlin.models.models.Bill
import main.kotlin.models.models.numOfPeople


class Userfunctions {
    val usr= User(1, "alice", "megharoshan21@gmail.com" , 3000.0, 0.0)
    val list= mutableListOf("alice", "bob", "janice")
    val bil= Bill("lunch", list, 3000.0, "alice" )
    fun getBill():Bill{
        return bil
    }

    fun getUser():User{
        return usr
    }

    fun createUser(id: Int, name:String, email:String):User{
        val  createUser=User(UId: Int, firstName:String )
        createUser.UId=id
        createUser.firstName=name
        createUser.email=email
    }

    fun splitExpense(){
        val amt=bil.amount/ numOfPeople +1
        for( i in list) {
            usr.setOwes(amt)
        }}

}