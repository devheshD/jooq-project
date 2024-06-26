/*
 * This file is generated by jOOQ.
 */
package com.devhesh.jooqproject.generated.tables.daos;


import com.devhesh.jooqproject.generated.enums.FilmRating;
import com.devhesh.jooqproject.generated.tables.Film;
import com.devhesh.jooqproject.generated.tables.records.FilmRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.AutoConverter;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmDao extends DAOImpl<FilmRecord, com.devhesh.jooqproject.generated.tables.pojos.Film, Long> {

    /**
     * Create a new FilmDao without any configuration
     */
    public FilmDao() {
        super(Film.FILM, com.devhesh.jooqproject.generated.tables.pojos.Film.class);
    }

    /**
     * Create a new FilmDao with an attached configuration
     */
    public FilmDao(Configuration configuration) {
        super(Film.FILM, com.devhesh.jooqproject.generated.tables.pojos.Film.class, configuration);
    }

    @Override
    public Long getId(com.devhesh.jooqproject.generated.tables.pojos.Film object) {
        return object.getFilmId();
    }

    /**
     * Fetch records that have <code>film_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchRangeOfFilmId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Film.FILM.FILM_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>film_id IN (values)</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchByFilmId(Long... values) {
        return fetch(Film.FILM.FILM_ID, values);
    }

    /**
     * Fetch a unique record that has <code>film_id = value</code>
     */
    public com.devhesh.jooqproject.generated.tables.pojos.Film fetchOneByFilmId(Long value) {
        return fetchOne(Film.FILM.FILM_ID, value);
    }

    /**
     * Fetch a unique record that has <code>film_id = value</code>
     */
    public Optional<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchOptionalByFilmId(Long value) {
        return fetchOptional(Film.FILM.FILM_ID, value);
    }

    /**
     * Fetch records that have <code>title BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchRangeOfTitle(String lowerInclusive, String upperInclusive) {
        return fetchRange(Film.FILM.TITLE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchByTitle(String... values) {
        return fetch(Film.FILM.TITLE, values);
    }

    /**
     * Fetch records that have <code>description BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchRangeOfDescription(String lowerInclusive, String upperInclusive) {
        return fetchRange(Film.FILM.DESCRIPTION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchByDescription(String... values) {
        return fetch(Film.FILM.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>release_year BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchRangeOfReleaseYear(Year lowerInclusive, Year upperInclusive) {
        return fetchRange(Film.FILM.RELEASE_YEAR, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>release_year IN (values)</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchByReleaseYear(Year... values) {
        return fetch(Film.FILM.RELEASE_YEAR, values);
    }

    /**
     * Fetch records that have <code>language_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchRangeOfLanguageId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Film.FILM.LANGUAGE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>language_id IN (values)</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchByLanguageId(Long... values) {
        return fetch(Film.FILM.LANGUAGE_ID, values);
    }

    /**
     * Fetch records that have <code>original_language_id BETWEEN lowerInclusive
     * AND upperInclusive</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchRangeOfOriginalLanguageId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Film.FILM.ORIGINAL_LANGUAGE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>original_language_id IN (values)</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchByOriginalLanguageId(Long... values) {
        return fetch(Film.FILM.ORIGINAL_LANGUAGE_ID, values);
    }

    /**
     * Fetch records that have <code>rental_duration BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchRangeOfRentalDuration(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Film.FILM.RENTAL_DURATION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>rental_duration IN (values)</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchByRentalDuration(Integer... values) {
        return fetch(Film.FILM.RENTAL_DURATION, values);
    }

    /**
     * Fetch records that have <code>rental_rate BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchRangeOfRentalRate(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(Film.FILM.RENTAL_RATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>rental_rate IN (values)</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchByRentalRate(BigDecimal... values) {
        return fetch(Film.FILM.RENTAL_RATE, values);
    }

    /**
     * Fetch records that have <code>length BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchRangeOfLength(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Film.FILM.LENGTH, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>length IN (values)</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchByLength(Integer... values) {
        return fetch(Film.FILM.LENGTH, values);
    }

    /**
     * Fetch records that have <code>replacement_cost BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchRangeOfReplacementCost(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(Film.FILM.REPLACEMENT_COST, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>replacement_cost IN (values)</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchByReplacementCost(BigDecimal... values) {
        return fetch(Film.FILM.REPLACEMENT_COST, values);
    }

    /**
     * Fetch records that have <code>rating BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchRangeOfRating(FilmRating lowerInclusive, FilmRating upperInclusive) {
        return fetchRange(Film.FILM.RATING, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>rating IN (values)</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchByRating(FilmRating... values) {
        return fetch(Film.FILM.RATING, values);
    }

    /**
     * Fetch records that have <code>special_features BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchRangeOfSpecialFeatures(String lowerInclusive, String upperInclusive) {
        return fetchRange(Film.FILM.SPECIAL_FEATURES, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>special_features IN (values)</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchBySpecialFeatures(String... values) {
        return fetch(Film.FILM.SPECIAL_FEATURES, values);
    }

    /**
     * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchRangeOfLastUpdate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Film.FILM.LAST_UPDATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Film> fetchByLastUpdate(LocalDateTime... values) {
        return fetch(Film.FILM.LAST_UPDATE, values);
    }
}
