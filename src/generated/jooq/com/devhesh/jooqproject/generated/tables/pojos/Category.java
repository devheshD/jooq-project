/*
 * This file is generated by jOOQ.
 */
package com.devhesh.jooqproject.generated.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    private UInteger categoryId;
    private String name;
    private LocalDateTime lastUpdate;

    public Category() {}

    public Category(Category value) {
        this.categoryId = value.categoryId;
        this.name = value.name;
        this.lastUpdate = value.lastUpdate;
    }

    public Category(
        UInteger categoryId,
        String name,
        LocalDateTime lastUpdate
    ) {
        this.categoryId = categoryId;
        this.name = name;
        this.lastUpdate = lastUpdate;
    }

    /**
     * Getter for <code>sakila.category.category_id</code>.
     */
    public UInteger getCategoryId() {
        return this.categoryId;
    }

    /**
     * Setter for <code>sakila.category.category_id</code>.
     */
    public Category setCategoryId(UInteger categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * Getter for <code>sakila.category.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>sakila.category.name</code>.
     */
    public Category setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>sakila.category.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    /**
     * Setter for <code>sakila.category.last_update</code>.
     */
    public Category setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
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
        final Category other = (Category) obj;
        if (this.categoryId == null) {
            if (other.categoryId != null)
                return false;
        }
        else if (!this.categoryId.equals(other.categoryId))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.lastUpdate == null) {
            if (other.lastUpdate != null)
                return false;
        }
        else if (!this.lastUpdate.equals(other.lastUpdate))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.categoryId == null) ? 0 : this.categoryId.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.lastUpdate == null) ? 0 : this.lastUpdate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Category (");

        sb.append(categoryId);
        sb.append(", ").append(name);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
    }
}