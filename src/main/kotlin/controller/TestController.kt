package main.kotlin.models.controller

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType


@Path("/v1/test")
@Produces(MediaType.APPLICATION_JSON)

class TestController {
    @GET
    fun testApi():String{
        return "It works"
    }

}