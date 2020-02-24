package main.kotlin.models.models

import main.kotlin.models.SplitBill

data class Bill (
    val billName: String,
    val listOfPeople: MutableList<String> = mutableListOf<String>(),
    val amount : Double,
    val payee: String

)
val listOfPeople= mutableListOf("alice", "bob", "janice")
val numOfPeople: Int= listOfPeople.size


//val bill :Bill= Bill("lunch", listOfPeople, 3000.0, "alice" )
//
//    fun getBill():Bill{
//        return bill }
