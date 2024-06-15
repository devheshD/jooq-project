package com.devhesh.jooqproject.jooq

import com.devhesh.jooqproject.configuration.JooqCustomConfiguration
import com.devhesh.jooqproject.repository.film.FilmRepository
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

@SpringBootTest
@Import(FilmRepository::class, JooqCustomConfiguration::class)
class JooqSelectTest {

    @Autowired
    private lateinit var filmRepository: FilmRepository

    @Test
    fun `영화 정보 조회`() {
        val film = filmRepository.findById(1L)
        Assertions.assertThat(film).isNotNull
    }
}
