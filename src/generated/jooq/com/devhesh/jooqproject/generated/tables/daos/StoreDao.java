/*
 * This file is generated by jOOQ.
 */
package com.devhesh.jooqproject.generated.tables.daos;


import com.devhesh.jooqproject.generated.tables.Store;
import com.devhesh.jooqproject.generated.tables.records.StoreRecord;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.AutoConverter;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StoreDao extends DAOImpl<StoreRecord, com.devhesh.jooqproject.generated.tables.pojos.Store, Long> {

    /**
     * Create a new StoreDao without any configuration
     */
    public StoreDao() {
        super(Store.STORE, com.devhesh.jooqproject.generated.tables.pojos.Store.class);
    }

    /**
     * Create a new StoreDao with an attached configuration
     */
    public StoreDao(Configuration configuration) {
        super(Store.STORE, com.devhesh.jooqproject.generated.tables.pojos.Store.class, configuration);
    }

    @Override
    public Long getId(com.devhesh.jooqproject.generated.tables.pojos.Store object) {
        return object.getStoreId();
    }

    /**
     * Fetch records that have <code>store_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Store> fetchRangeOfStoreId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Store.STORE.STORE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>store_id IN (values)</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Store> fetchByStoreId(Long... values) {
        return fetch(Store.STORE.STORE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>store_id = value</code>
     */
    public com.devhesh.jooqproject.generated.tables.pojos.Store fetchOneByStoreId(Long value) {
        return fetchOne(Store.STORE.STORE_ID, value);
    }

    /**
     * Fetch a unique record that has <code>store_id = value</code>
     */
    public Optional<com.devhesh.jooqproject.generated.tables.pojos.Store> fetchOptionalByStoreId(Long value) {
        return fetchOptional(Store.STORE.STORE_ID, value);
    }

    /**
     * Fetch records that have <code>manager_staff_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Store> fetchRangeOfManagerStaffId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Store.STORE.MANAGER_STAFF_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>manager_staff_id IN (values)</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Store> fetchByManagerStaffId(Long... values) {
        return fetch(Store.STORE.MANAGER_STAFF_ID, values);
    }

    /**
     * Fetch a unique record that has <code>manager_staff_id = value</code>
     */
    public com.devhesh.jooqproject.generated.tables.pojos.Store fetchOneByManagerStaffId(Long value) {
        return fetchOne(Store.STORE.MANAGER_STAFF_ID, value);
    }

    /**
     * Fetch a unique record that has <code>manager_staff_id = value</code>
     */
    public Optional<com.devhesh.jooqproject.generated.tables.pojos.Store> fetchOptionalByManagerStaffId(Long value) {
        return fetchOptional(Store.STORE.MANAGER_STAFF_ID, value);
    }

    /**
     * Fetch records that have <code>address_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Store> fetchRangeOfAddressId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Store.STORE.ADDRESS_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>address_id IN (values)</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Store> fetchByAddressId(Long... values) {
        return fetch(Store.STORE.ADDRESS_ID, values);
    }

    /**
     * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Store> fetchRangeOfLastUpdate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Store.STORE.LAST_UPDATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    public List<com.devhesh.jooqproject.generated.tables.pojos.Store> fetchByLastUpdate(LocalDateTime... values) {
        return fetch(Store.STORE.LAST_UPDATE, values);
    }
}
