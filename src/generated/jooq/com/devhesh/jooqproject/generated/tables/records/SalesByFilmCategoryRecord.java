/*
 * This file is generated by jOOQ.
 */
package com.devhesh.jooqproject.generated.tables.records;


import com.devhesh.jooqproject.generated.tables.SalesByFilmCategory;

import java.math.BigDecimal;

import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SalesByFilmCategoryRecord extends TableRecordImpl<SalesByFilmCategoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.sales_by_film_category.category</code>.
     */
    public SalesByFilmCategoryRecord setCategory(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.sales_by_film_category.category</code>.
     */
    public String getCategory() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sakila.sales_by_film_category.total_sales</code>.
     */
    public SalesByFilmCategoryRecord setTotalSales(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.sales_by_film_category.total_sales</code>.
     */
    public BigDecimal getTotalSales() {
        return (BigDecimal) get(1);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SalesByFilmCategoryRecord
     */
    public SalesByFilmCategoryRecord() {
        super(SalesByFilmCategory.SALES_BY_FILM_CATEGORY);
    }

    /**
     * Create a detached, initialised SalesByFilmCategoryRecord
     */
    public SalesByFilmCategoryRecord(String category, BigDecimal totalSales) {
        super(SalesByFilmCategory.SALES_BY_FILM_CATEGORY);

        setCategory(category);
        setTotalSales(totalSales);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised SalesByFilmCategoryRecord
     */
    public SalesByFilmCategoryRecord(com.devhesh.jooqproject.generated.tables.pojos.SalesByFilmCategory value) {
        super(SalesByFilmCategory.SALES_BY_FILM_CATEGORY);

        if (value != null) {
            setCategory(value.getCategory());
            setTotalSales(value.getTotalSales());
            resetChangedOnNotNull();
        }
    }
}
