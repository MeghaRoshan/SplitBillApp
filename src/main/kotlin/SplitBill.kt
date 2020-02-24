package main.kotlin.models

import com.fasterxml.jackson.module.kotlin.KotlinModule
import io.dropwizard.Application
import io.dropwizard.setup.Environment
import main.kotlin.models.config.AppConfig
import main.kotlin.models.controller.TestController
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

        val testController = TestController()
        environment?.jersey()?.register(testController)
        environment?.objectMapper?.registerModule(KotlinModule())
    }
}

