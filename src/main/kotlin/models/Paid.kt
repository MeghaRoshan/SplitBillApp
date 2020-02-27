package main.kotlin.models.models

import io.ebean.Model
import javax.persistence.GeneratedValue
import javax.persistence.Id

data class Paid(
    @Id
    @GeneratedValue
    val paidId: Int

) : Model()