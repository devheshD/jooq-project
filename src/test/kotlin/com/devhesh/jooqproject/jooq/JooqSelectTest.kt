package com.devhesh.jooqproject.jooq

import com.devhesh.jooqproject.repository.film.FilmRepository
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jooq.JooqTest
import org.springframework.context.annotation.ComponentScan

@JooqTest
@ComponentScan(basePackages = ["com.devhesh.jooqproject"])
internal class JooqSelectTest {

    @Autowired
    private lateinit var filmRepository: FilmRepository

    @Test
    fun `영화 정보 조회`() {
        val film = filmRepository.findById(1L)
        Assertions.assertThat(film).isNotNull
    }
}
