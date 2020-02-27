package main.kotlin.models.models

import io.ebean.Model
import javax.persistence.GeneratedValue
import javax.persistence.Id

data class Owes(
    @Id
    @GeneratedValue
    val oweId:Int



): Model()