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
//    var paid: HashMap<Int, Double> = hashMapOf(),
//    @MapKeyColumn
//    var owes: HashMap<Int, Double> = hashMapOf(),
    @ManyToOne
    @JoinColumn(name="billId")
    var bill: Bill? = null



) : Model(){

//    lateinit var paid: HashMap<Int, Double>
        @Column
        var paid: HashMap<Int, Double> = hashMapOf()
        @Column
        var owes: HashMap<Int, Double> = hashMapOf()

}
