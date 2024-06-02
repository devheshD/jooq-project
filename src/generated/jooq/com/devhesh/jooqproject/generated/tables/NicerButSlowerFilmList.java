/*
 * This file is generated by jOOQ.
 */
package com.devhesh.jooqproject.generated.tables;


import com.devhesh.jooqproject.generated.Sakila;
import com.devhesh.jooqproject.generated.enums.NicerButSlowerFilmListRating;
import com.devhesh.jooqproject.generated.tables.records.NicerButSlowerFilmListRecord;

import java.math.BigDecimal;
import java.util.Collection;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.UShort;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NicerButSlowerFilmList extends TableImpl<NicerButSlowerFilmListRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sakila.nicer_but_slower_film_list</code>
     */
    public static final NicerButSlowerFilmList NICER_BUT_SLOWER_FILM_LIST = new NicerButSlowerFilmList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NicerButSlowerFilmListRecord> getRecordType() {
        return NicerButSlowerFilmListRecord.class;
    }

    /**
     * The column <code>sakila.nicer_but_slower_film_list.FID</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, UInteger> FID = createField(DSL.name("FID"), SQLDataType.INTEGERUNSIGNED.defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>sakila.nicer_but_slower_film_list.title</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>sakila.nicer_but_slower_film_list.description</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sakila.nicer_but_slower_film_list.category</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, String> CATEGORY = createField(DSL.name("category"), SQLDataType.VARCHAR(25).nullable(false), this, "");

    /**
     * The column <code>sakila.nicer_but_slower_film_list.price</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, BigDecimal> PRICE = createField(DSL.name("price"), SQLDataType.DECIMAL(4, 2).defaultValue(DSL.inline("4.99", SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sakila.nicer_but_slower_film_list.length</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, UShort> LENGTH = createField(DSL.name("length"), SQLDataType.SMALLINTUNSIGNED, this, "");

    /**
     * The column <code>sakila.nicer_but_slower_film_list.rating</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, NicerButSlowerFilmListRating> RATING = createField(DSL.name("rating"), SQLDataType.VARCHAR(5).defaultValue(DSL.inline("G", SQLDataType.VARCHAR)).asEnumDataType(NicerButSlowerFilmListRating.class), this, "");

    /**
     * The column <code>sakila.nicer_but_slower_film_list.actors</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, String> ACTORS = createField(DSL.name("actors"), SQLDataType.CLOB, this, "");

    private NicerButSlowerFilmList(Name alias, Table<NicerButSlowerFilmListRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private NicerButSlowerFilmList(Name alias, Table<NicerButSlowerFilmListRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `nicer_but_slower_film_list` as select `sakila`.`film`.`film_id` AS `FID`,`sakila`.`film`.`title` AS `title`,`sakila`.`film`.`description` AS `description`,`sakila`.`category`.`name` AS `category`,`sakila`.`film`.`rental_rate` AS `price`,`sakila`.`film`.`length` AS `length`,`sakila`.`film`.`rating` AS `rating`,group_concat(concat(concat(upper(substr(`sakila`.`actor`.`first_name`,1,1)),lower(substr(`sakila`.`actor`.`first_name`,2,length(`sakila`.`actor`.`first_name`))),' ',concat(upper(substr(`sakila`.`actor`.`last_name`,1,1)),lower(substr(`sakila`.`actor`.`last_name`,2,length(`sakila`.`actor`.`last_name`)))))) separator ', ') AS `actors` from ((((`sakila`.`category` left join `sakila`.`film_category` on((`sakila`.`category`.`category_id` = `sakila`.`film_category`.`category_id`))) left join `sakila`.`film` on((`sakila`.`film_category`.`film_id` = `sakila`.`film`.`film_id`))) join `sakila`.`film_actor` on((`sakila`.`film`.`film_id` = `sakila`.`film_actor`.`film_id`))) join `sakila`.`actor` on((`sakila`.`film_actor`.`actor_id` = `sakila`.`actor`.`actor_id`))) group by `sakila`.`film`.`film_id`,`sakila`.`film`.`title`,`sakila`.`film`.`description`,`sakila`.`film`.`rental_rate`,`sakila`.`film`.`length`,`sakila`.`film`.`rating`,`sakila`.`category`.`name`"), where);
    }

    /**
     * Create an aliased <code>sakila.nicer_but_slower_film_list</code> table
     * reference
     */
    public NicerButSlowerFilmList(String alias) {
        this(DSL.name(alias), NICER_BUT_SLOWER_FILM_LIST);
    }

    /**
     * Create an aliased <code>sakila.nicer_but_slower_film_list</code> table
     * reference
     */
    public NicerButSlowerFilmList(Name alias) {
        this(alias, NICER_BUT_SLOWER_FILM_LIST);
    }

    /**
     * Create a <code>sakila.nicer_but_slower_film_list</code> table reference
     */
    public NicerButSlowerFilmList() {
        this(DSL.name("nicer_but_slower_film_list"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sakila.SAKILA;
    }

    @Override
    public NicerButSlowerFilmList as(String alias) {
        return new NicerButSlowerFilmList(DSL.name(alias), this);
    }

    @Override
    public NicerButSlowerFilmList as(Name alias) {
        return new NicerButSlowerFilmList(alias, this);
    }

    @Override
    public NicerButSlowerFilmList as(Table<?> alias) {
        return new NicerButSlowerFilmList(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public NicerButSlowerFilmList rename(String name) {
        return new NicerButSlowerFilmList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public NicerButSlowerFilmList rename(Name name) {
        return new NicerButSlowerFilmList(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public NicerButSlowerFilmList rename(Table<?> name) {
        return new NicerButSlowerFilmList(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public NicerButSlowerFilmList where(Condition condition) {
        return new NicerButSlowerFilmList(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public NicerButSlowerFilmList where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public NicerButSlowerFilmList where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public NicerButSlowerFilmList where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public NicerButSlowerFilmList where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public NicerButSlowerFilmList where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public NicerButSlowerFilmList where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public NicerButSlowerFilmList where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public NicerButSlowerFilmList whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public NicerButSlowerFilmList whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
