package main.kotlin.models

import com.fasterxml.jackson.module.kotlin.KotlinModule
import dao.UserDao
import io.dropwizard.Application
import io.dropwizard.setup.Environment
import io.ebean.DB
import main.kotlin.models.Dao.BillDao
import main.kotlin.models.config.AppConfig
import main.kotlin.models.controller.BillController
import main.kotlin.models.controller.UserController
import main.kotlin.models.service.BillServices
import main.kotlin.models.service.UserServices
import org.slf4j.LoggerFactory


class SplitBill : Application<AppConfig>() {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SplitBill().run("server")
        }

        private val log = LoggerFactory.getLogger(SplitBill::class.java)
    }


    override fun run(configuration: AppConfig?, environment: Environment?) {
        log.info("app started")

        val database = DB.getDefault()

        val userDao = UserDao(database)
        val billsDao = BillDao(database)

        val userServices = UserServices(userDao)
        val billServices = BillServices(billsDao)

        val billController = BillController(billServices)
        val userController = UserController(userServices)
        environment!!.jersey().register(userController)
        environment.jersey().register(billController)
        environment.objectMapper.registerModule(KotlinModule())


    }
}

