package main.kotlin.models.models

import models.User

class GroupSettlement {
   //val map= mapOf("alice" to 3000, "bob" to 1000, "janice" to 2000)
   val userMap = mutableMapOf<User, Double>()
}