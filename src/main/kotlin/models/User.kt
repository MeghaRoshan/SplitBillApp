package models

import io.ebean.Model
import io.ebean.annotation.Length
import main.kotlin.models.models.Bill
import javax.persistence.*

@Entity
@Table(name="users_table")
data class User (
                 @Id var userId: Int,
                 @Length(100) var firstName: String,
                 @Column(unique=true) var email: String,
                 var paid: HashMap<Int, Double> = hashMapOf(),
                 var owes: HashMap<Int, Double> = hashMapOf()

):Model()
