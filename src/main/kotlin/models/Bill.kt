package main.kotlin.models.models

import models.User

data class Bill (
    val billId: Int,
    val billName: String,
    val listOfPeople: MutableList<User> = mutableListOf(),
    var amount : Double,
    val payee: User
)

