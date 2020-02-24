package models

class User (
    var userId: Int,
    var firstName: String,
    var email: String,
    var paid: HashMap<Int, Double> = hashMapOf(),
    var owes: HashMap<Int, Double> = hashMapOf()
)