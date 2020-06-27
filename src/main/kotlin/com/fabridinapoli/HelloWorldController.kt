package com.fabridinapoli

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/hello")
class HelloWorldController {

    @Get("/")
    @Produces(MediaType.APPLICATION_JSON)
    fun index(): String {
        return """
            {"message": "Hello World"}
        """.trimIndent()
    }
}