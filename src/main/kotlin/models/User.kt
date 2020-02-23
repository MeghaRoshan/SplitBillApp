package models

class User (firstName: String, lastName:String, paid: Double, owes: Double){

    private var owes: Double
    private var paid: Double
    private var firstName: String
    private var lastName: String
   init{
       this.firstName=firstName
       this.lastName=lastName
       this.paid=paid
       this.owes=owes
   }

    fun getPaid(): Double{ return this.paid; }
    fun getOwes():Double{return this.owes; }
    fun setOwes(owes: Double):Double{ this.owes = owes;}

}