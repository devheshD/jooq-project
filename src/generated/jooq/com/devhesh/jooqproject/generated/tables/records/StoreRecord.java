/*
 * This file is generated by jOOQ.
 */
package com.devhesh.jooqproject.generated.tables.records;


import com.devhesh.jooqproject.generated.tables.Store;

import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StoreRecord extends UpdatableRecordImpl<StoreRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.store.store_id</code>.
     */
    public StoreRecord setStoreId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.store.store_id</code>.
     */
    public Long getStoreId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>sakila.store.manager_staff_id</code>.
     */
    public StoreRecord setManagerStaffId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.store.manager_staff_id</code>.
     */
    public Long getManagerStaffId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>sakila.store.address_id</code>.
     */
    public StoreRecord setAddressId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sakila.store.address_id</code>.
     */
    public Long getAddressId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>sakila.store.last_update</code>.
     */
    public StoreRecord setLastUpdate(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>sakila.store.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StoreRecord
     */
    public StoreRecord() {
        super(Store.STORE);
    }

    /**
     * Create a detached, initialised StoreRecord
     */
    public StoreRecord(Long storeId, Long managerStaffId, Long addressId, LocalDateTime lastUpdate) {
        super(Store.STORE);

        setStoreId(storeId);
        setManagerStaffId(managerStaffId);
        setAddressId(addressId);
        setLastUpdate(lastUpdate);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised StoreRecord
     */
    public StoreRecord(com.devhesh.jooqproject.generated.tables.pojos.Store value) {
        super(Store.STORE);

        if (value != null) {
            setStoreId(value.getStoreId());
            setManagerStaffId(value.getManagerStaffId());
            setAddressId(value.getAddressId());
            setLastUpdate(value.getLastUpdate());
            resetChangedOnNotNull();
        }
    }
}
