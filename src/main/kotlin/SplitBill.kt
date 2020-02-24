package main.kotlin.models

import io.dropwizard.Application
import io.dropwizard.setup.Environment
import main.kotlin.models.config.AppConfig
import main.kotlin.models.controller.TestController

import main.kotlin.models.models.Bill
import main.kotlin.models.models.numOfPeople
import models.User
import org.slf4j.LoggerFactory


class SplitBill: Application<AppConfig>() {
    companion object{
        @JvmStatic
        fun main(args:Array<String>){
            SplitBill().run("server")
        }
        private val log= LoggerFactory.getLogger(SplitBill::class.java)
    }


        override fun run(configuration: AppConfig?,environment: Environment?){
            log.info("app started")

            val testController= TestController()
            environment!!.jersey().register(testController)

//            val User= User(1, "alice", "megharoshan21@gmail.com" , 3000.0, 0.0)
//            val list= mutableListOf("alice", "bob", "janice")
//            val bill= Bill("lunch", list, 3000.0, "alice" )
//
//          fun getBill():Bill{
//
//              return bill }
//            getBill()

//            fun splitExpense(){
//                val amt=bill.amount/ numOfPeople +1
//                for( i in list) {
//                    User.setOwes(amt)
//                }}
//            splitExpense()

        }
    }

