package com.devhesh.jooqproject.repository.film.model

import com.devhesh.jooqproject.common.enum.Rating
import com.devhesh.jooqproject.common.enum.SpecialFeatures
import java.math.BigDecimal
import java.time.LocalDateTime

data class FilmData(
    val filmId: Int,
    val title: String,
    val description: String,
    val releaseYear: LocalDateTime,
    val languageId: Int,
    val originalLanguageId: Int?,
    val rentalDuration: Int,
    val rentalRate: BigDecimal,
    val length: Int,
    val replacementCost: BigDecimal,
    val rating: Rating,
    val specialFeatures: SpecialFeatures,
    val lastUpdate: LocalDateTime,
)
