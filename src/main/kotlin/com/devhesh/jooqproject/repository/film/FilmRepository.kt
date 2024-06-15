package com.devhesh.jooqproject.repository.film

import com.devhesh.jooqproject.common.enum.Rating
import com.devhesh.jooqproject.common.enum.SpecialFeatures
import com.devhesh.jooqproject.generated.tables.Film
import com.devhesh.jooqproject.repository.film.model.FilmData
import org.jooq.DSLContext
import org.springframework.stereotype.Repository
import org.jooq.Record
import java.time.LocalDateTime

@Repository
internal class FilmRepository(
    private val dslContext: DSLContext
) {
    fun findById(id: Long): FilmData? {
        return dslContext.select(filmFields)
            .from(filmTable)
            .where(filmTable.FILM_ID.eq(id))
            .fetchOne { it.toFilm() }
    }

    private fun Record.toFilm(): FilmData {
        return FilmData(
            filmId = get(filmTable.FILM_ID),
            title = get(filmTable.TITLE),
            description = get(filmTable.DESCRIPTION),
            releaseYear = LocalDateTime.now(),
            languageId = get(filmTable.LANGUAGE_ID),
            originalLanguageId = get(filmTable.ORIGINAL_LANGUAGE_ID),
            rentalDuration = get(filmTable.RENTAL_DURATION),
            rentalRate = get(filmTable.RENTAL_RATE),
            length = get(filmTable.LENGTH),
            replacementCost = get(filmTable.REPLACEMENT_COST),
            rating = Rating.NC_17,
            specialFeatures = SpecialFeatures.DELETED_SCENES,
            lastUpdate = LocalDateTime.now()
        )
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
