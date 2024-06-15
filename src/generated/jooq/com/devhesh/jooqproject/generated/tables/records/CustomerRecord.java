/*
 * This file is generated by jOOQ.
 */
package com.devhesh.jooqproject.generated.tables.records;


import com.devhesh.jooqproject.generated.tables.Customer;

import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerRecord extends UpdatableRecordImpl<CustomerRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.customer.customer_id</code>.
     */
    public CustomerRecord setCustomerId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer.customer_id</code>.
     */
    public Long getCustomerId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>sakila.customer.store_id</code>.
     */
    public CustomerRecord setStoreId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer.store_id</code>.
     */
    public Long getStoreId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>sakila.customer.first_name</code>.
     */
    public CustomerRecord setFirstName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sakila.customer.last_name</code>.
     */
    public CustomerRecord setLastName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer.last_name</code>.
     */
    public String getLastName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sakila.customer.email</code>.
     */
    public CustomerRecord setEmail(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer.email</code>.
     */
    public String getEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sakila.customer.address_id</code>.
     */
    public CustomerRecord setAddressId(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer.address_id</code>.
     */
    public Long getAddressId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>sakila.customer.active</code>.
     */
    public CustomerRecord setActive(Byte value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer.active</code>.
     */
    public Byte getActive() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>sakila.customer.create_date</code>.
     */
    public CustomerRecord setCreateDate(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer.create_date</code>.
     */
    public LocalDateTime getCreateDate() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>sakila.customer.last_update</code>.
     */
    public CustomerRecord setLastUpdate(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(8);
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
     * Create a detached CustomerRecord
     */
    public CustomerRecord() {
        super(Customer.CUSTOMER);
    }

    /**
     * Create a detached, initialised CustomerRecord
     */
    public CustomerRecord(Long customerId, Long storeId, String firstName, String lastName, String email, Long addressId, Byte active, LocalDateTime createDate, LocalDateTime lastUpdate) {
        super(Customer.CUSTOMER);

        setCustomerId(customerId);
        setStoreId(storeId);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setAddressId(addressId);
        setActive(active);
        setCreateDate(createDate);
        setLastUpdate(lastUpdate);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised CustomerRecord
     */
    public CustomerRecord(com.devhesh.jooqproject.generated.tables.pojos.Customer value) {
        super(Customer.CUSTOMER);

        if (value != null) {
            setCustomerId(value.getCustomerId());
            setStoreId(value.getStoreId());
            setFirstName(value.getFirstName());
            setLastName(value.getLastName());
            setEmail(value.getEmail());
            setAddressId(value.getAddressId());
            setActive(value.getActive());
            setCreateDate(value.getCreateDate());
            setLastUpdate(value.getLastUpdate());
            resetChangedOnNotNull();
        }
    }
}
