/*
 * This file is generated by jOOQ.
 */
package com.devhesh.jooqproject.generated.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SalesByStore implements Serializable {

    private static final long serialVersionUID = 1L;

    private String store;
    private String manager;
    private BigDecimal totalSales;

    public SalesByStore() {}

    public SalesByStore(SalesByStore value) {
        this.store = value.store;
        this.manager = value.manager;
        this.totalSales = value.totalSales;
    }

    public SalesByStore(
        String store,
        String manager,
        BigDecimal totalSales
    ) {
        this.store = store;
        this.manager = manager;
        this.totalSales = totalSales;
    }

    /**
     * Getter for <code>sakila.sales_by_store.store</code>.
     */
    public String getStore() {
        return this.store;
    }

    /**
     * Setter for <code>sakila.sales_by_store.store</code>.
     */
    public SalesByStore setStore(String store) {
        this.store = store;
        return this;
    }

    /**
     * Getter for <code>sakila.sales_by_store.manager</code>.
     */
    public String getManager() {
        return this.manager;
    }

    /**
     * Setter for <code>sakila.sales_by_store.manager</code>.
     */
    public SalesByStore setManager(String manager) {
        this.manager = manager;
        return this;
    }

    /**
     * Getter for <code>sakila.sales_by_store.total_sales</code>.
     */
    public BigDecimal getTotalSales() {
        return this.totalSales;
    }

    /**
     * Setter for <code>sakila.sales_by_store.total_sales</code>.
     */
    public SalesByStore setTotalSales(BigDecimal totalSales) {
        this.totalSales = totalSales;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final SalesByStore other = (SalesByStore) obj;
        if (this.store == null) {
            if (other.store != null)
                return false;
        }
        else if (!this.store.equals(other.store))
            return false;
        if (this.manager == null) {
            if (other.manager != null)
                return false;
        }
        else if (!this.manager.equals(other.manager))
            return false;
        if (this.totalSales == null) {
            if (other.totalSales != null)
                return false;
        }
        else if (!this.totalSales.equals(other.totalSales))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.store == null) ? 0 : this.store.hashCode());
        result = prime * result + ((this.manager == null) ? 0 : this.manager.hashCode());
        result = prime * result + ((this.totalSales == null) ? 0 : this.totalSales.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SalesByStore (");

        sb.append(store);
        sb.append(", ").append(manager);
        sb.append(", ").append(totalSales);

        sb.append(")");
        return sb.toString();
    }
}
