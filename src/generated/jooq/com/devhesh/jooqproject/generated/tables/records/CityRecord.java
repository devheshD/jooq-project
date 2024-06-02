/*
 * This file is generated by jOOQ.
 */
package com.devhesh.jooqproject.generated.tables.records;


import com.devhesh.jooqproject.generated.tables.City;

import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CityRecord extends UpdatableRecordImpl<CityRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.city.city_id</code>.
     */
    public CityRecord setCityId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.city.city_id</code>.
     */
    public UInteger getCityId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>sakila.city.city</code>.
     */
    public CityRecord setCity(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.city.city</code>.
     */
    public String getCity() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sakila.city.country_id</code>.
     */
    public CityRecord setCountryId(UInteger value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sakila.city.country_id</code>.
     */
    public UInteger getCountryId() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>sakila.city.last_update</code>.
     */
    public CityRecord setLastUpdate(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>sakila.city.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CityRecord
     */
    public CityRecord() {
        super(City.CITY);
    }

    /**
     * Create a detached, initialised CityRecord
     */
    public CityRecord(UInteger cityId, String city, UInteger countryId, LocalDateTime lastUpdate) {
        super(City.CITY);

        setCityId(cityId);
        setCity(city);
        setCountryId(countryId);
        setLastUpdate(lastUpdate);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised CityRecord
     */
    public CityRecord(com.devhesh.jooqproject.generated.tables.pojos.City value) {
        super(City.CITY);

        if (value != null) {
            setCityId(value.getCityId());
            setCity(value.getCity());
            setCountryId(value.getCountryId());
            setLastUpdate(value.getLastUpdate());
            resetChangedOnNotNull();
        }
    }
}
