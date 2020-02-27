package models

import com.fasterxml.jackson.annotation.JsonSubTypes
import io.ebean.Model
import io.ebean.annotation.Length
import io.ebean.typequery.TypeQueryBean
import main.kotlin.models.models.Bill
import javax.persistence.*

@Entity
@Table(name = "users_table")
data class User(
    @Id
    var userId: Int,
    @Length(100) var firstName: String,
    @Column(unique = true) var email: String,
//    @MapKeyColumn


    var paid: HashMap<Int, Double> = hashMapOf(),
    @Column
    var Paid: Double = paid.getValue(userId),
//    @MapKeyColumn
    var owes: HashMap<Int, Double> = hashMapOf(),
    @Column
    var Owes: Double = owes.getValue(userId),
    @ManyToOne
    @JoinColumn(name="billId")
    var bill: Bill? = null



) : Model(){
    //paid and owes are updates in the HashMap but are not visible in the database table.
//        @Column
//        lateinit var paid: String
////        HashMap<Int, Double> = hashMapOf()
//        @Column
//        lateinit var owes: String
//        HashMap<Int, Double> = hashMapOf()
//    fun convert(){for(key in paid.keys){
//        println("Element at key $key : ${paid.get(userId)}")
//    }



}
