package com.fabridinapoli

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("com.fabridinapoli")
                .mainClass(Application.javaClass)
                .start()
    }
}