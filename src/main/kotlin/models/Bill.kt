package main.kotlin.models.models
import io.ebean.Model
import models.User
import javax.persistence.*

@Entity
@Table(name="bills_table")
data class Bill (
    @Id
    val billId: Int,
    @Column
    val billName: String,
//    @OneToMany(cascade = arrayOf(CascadeType.ALL))
    val listOfPeople: MutableList<User> = mutableListOf(),
    @Column
    var amount : Double,
    @OneToOne
    val payee: User
): Model()


