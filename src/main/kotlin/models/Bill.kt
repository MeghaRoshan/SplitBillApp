package main.kotlin.models.models
data class ListOfPeople( )
data class Bill (
    val billName: String,
    val listOfPeople: MutableList<String> = mutableListOf<String>(),
    val amount : Double,
    val payee: String,
//   val numOfPeople: Int= listOfPeople.size
)

