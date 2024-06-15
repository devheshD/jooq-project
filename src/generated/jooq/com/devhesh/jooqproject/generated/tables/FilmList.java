/*
 * This file is generated by jOOQ.
 */
package com.devhesh.jooqproject.generated.tables;


import com.devhesh.jooqproject.generated.Sakila;
import com.devhesh.jooqproject.generated.enums.FilmListRating;
import com.devhesh.jooqproject.generated.tables.records.FilmListRecord;

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
import org.jooq.impl.AutoConverter;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.UShort;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmList extends TableImpl<FilmListRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sakila.film_list</code>
     */
    public static final FilmList FILM_LIST = new FilmList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilmListRecord> getRecordType() {
        return FilmListRecord.class;
    }

    /**
     * The column <code>sakila.film_list.FID</code>.
     */
    public final TableField<FilmListRecord, Long> FID = createField(DSL.name("FID"), SQLDataType.INTEGERUNSIGNED.defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "", new AutoConverter<UInteger, Long>(UInteger.class, Long.class));

    /**
     * The column <code>sakila.film_list.title</code>.
     */
    public final TableField<FilmListRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>sakila.film_list.description</code>.
     */
    public final TableField<FilmListRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sakila.film_list.category</code>.
     */
    public final TableField<FilmListRecord, String> CATEGORY = createField(DSL.name("category"), SQLDataType.VARCHAR(25).nullable(false), this, "");

    /**
     * The column <code>sakila.film_list.price</code>.
     */
    public final TableField<FilmListRecord, BigDecimal> PRICE = createField(DSL.name("price"), SQLDataType.DECIMAL(4, 2).defaultValue(DSL.inline("4.99", SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sakila.film_list.length</code>.
     */
    public final TableField<FilmListRecord, Integer> LENGTH = createField(DSL.name("length"), SQLDataType.SMALLINTUNSIGNED, this, "", new AutoConverter<UShort, Integer>(UShort.class, Integer.class));

    /**
     * The column <code>sakila.film_list.rating</code>.
     */
    public final TableField<FilmListRecord, FilmListRating> RATING = createField(DSL.name("rating"), SQLDataType.VARCHAR(5).defaultValue(DSL.inline("G", SQLDataType.VARCHAR)).asEnumDataType(FilmListRating.class), this, "");

    /**
     * The column <code>sakila.film_list.actors</code>.
     */
    public final TableField<FilmListRecord, String> ACTORS = createField(DSL.name("actors"), SQLDataType.CLOB, this, "");

    private FilmList(Name alias, Table<FilmListRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private FilmList(Name alias, Table<FilmListRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `film_list` as select `sakila`.`film`.`film_id` AS `FID`,`sakila`.`film`.`title` AS `title`,`sakila`.`film`.`description` AS `description`,`sakila`.`category`.`name` AS `category`,`sakila`.`film`.`rental_rate` AS `price`,`sakila`.`film`.`length` AS `length`,`sakila`.`film`.`rating` AS `rating`,group_concat(concat(`sakila`.`actor`.`first_name`,' ',`sakila`.`actor`.`last_name`) separator ', ') AS `actors` from ((((`sakila`.`category` left join `sakila`.`film_category` on((`sakila`.`category`.`category_id` = `sakila`.`film_category`.`category_id`))) left join `sakila`.`film` on((`sakila`.`film_category`.`film_id` = `sakila`.`film`.`film_id`))) join `sakila`.`film_actor` on((`sakila`.`film`.`film_id` = `sakila`.`film_actor`.`film_id`))) join `sakila`.`actor` on((`sakila`.`film_actor`.`actor_id` = `sakila`.`actor`.`actor_id`))) group by `sakila`.`film`.`film_id`,`sakila`.`film`.`title`,`sakila`.`film`.`description`,`sakila`.`film`.`rental_rate`,`sakila`.`film`.`length`,`sakila`.`film`.`rating`,`sakila`.`category`.`name`"), where);
    }

    /**
     * Create an aliased <code>sakila.film_list</code> table reference
     */
    public FilmList(String alias) {
        this(DSL.name(alias), FILM_LIST);
    }

    /**
     * Create an aliased <code>sakila.film_list</code> table reference
     */
    public FilmList(Name alias) {
        this(alias, FILM_LIST);
    }

    /**
     * Create a <code>sakila.film_list</code> table reference
     */
    public FilmList() {
        this(DSL.name("film_list"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sakila.SAKILA;
    }

    @Override
    public FilmList as(String alias) {
        return new FilmList(DSL.name(alias), this);
    }

    @Override
    public FilmList as(Name alias) {
        return new FilmList(alias, this);
    }

    @Override
    public FilmList as(Table<?> alias) {
        return new FilmList(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmList rename(String name) {
        return new FilmList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmList rename(Name name) {
        return new FilmList(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmList rename(Table<?> name) {
        return new FilmList(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public FilmList where(Condition condition) {
        return new FilmList(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public FilmList where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public FilmList where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public FilmList where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public FilmList where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public FilmList where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public FilmList where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public FilmList where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public FilmList whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public FilmList whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
