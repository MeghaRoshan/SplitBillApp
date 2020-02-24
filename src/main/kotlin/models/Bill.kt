package main.kotlin.models.models

import models.User

data class Bill (
    val billId: Int,
    val billName: String,
    val listOfPeople: MutableList<User> = mutableListOf(),
    val amount : Double,
    val payee: User
)

