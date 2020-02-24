package main.kotlin.models.models

data class Bill (
    val billName: String,
    val listOfPeople: MutableList<String> = mutableListOf<String>(),
    val amount : Double,
    val payee: String

)
val listOfPeople= mutableListOf("alice", "bob", "janice")
val numOfPeople: Int= listOfPeople.size

