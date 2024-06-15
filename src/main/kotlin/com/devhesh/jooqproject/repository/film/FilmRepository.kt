package com.devhesh.jooqproject.repository.film

import com.devhesh.jooqproject.generated.tables.Film
import com.devhesh.jooqproject.repository.film.model.FilmData
import org.jooq.DSLContext
import org.springframework.stereotype.Repository

@Repository
internal class FilmRepository(
    private val dslContext: DSLContext
) {
    fun findById(id: Long): Film? {
        return dslContext.select(filmFields)
            .from(filmTable)
            .where(filmTable.FILM_ID.eq(id))
            .fetchOneInto(Film::class.java)
    }

    companion object {
        private val filmTable: Film = Film.FILM

        private val filmFields = listOf(
            filmTable.FILM_ID,
            filmTable.TITLE,
            filmTable.DESCRIPTION,
            filmTable.RELEASE_YEAR,
            filmTable.LANGUAGE_ID,
            filmTable.ORIGINAL_LANGUAGE_ID,
            filmTable.RENTAL_DURATION,
            filmTable.RENTAL_RATE,
            filmTable.LENGTH,
            filmTable.REPLACEMENT_COST,
            filmTable.RATING,
            filmTable.SPECIAL_FEATURES,
            filmTable.LAST_UPDATE
        )
    }
}
