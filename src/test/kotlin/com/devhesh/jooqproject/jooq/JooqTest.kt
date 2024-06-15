package com.devhesh.jooqproject.jooq

import com.devhesh.jooqproject.generated.tables.Actor
import org.jooq.DSLContext
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jooq.JooqTest
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext

@SpringBootTest
internal class JooqTest {

    @Autowired
    private lateinit var dslContext: DSLContext

    @Autowired
    private lateinit var applicationContext: ApplicationContext

    @Test
    fun `간단 SELECT 문법`() {
        dslContext.selectFrom(Actor.ACTOR)
            .limit(10)
            .fetch()
    }

    @Test
    fun `Bean 확인`() {
        val names = applicationContext.beanDefinitionNames
        println("Names: ${names.map { it }}")
    }
}
