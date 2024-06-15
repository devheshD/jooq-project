package com.devhesh.jooqproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@ConfigurationPropertiesScan(basePackages = ["com.devhesh.jooqproject"])
@SpringBootApplication
class JooqProjectApplication

fun main(args: Array<String>) {
    runApplication<JooqProjectApplication>(*args)
}
