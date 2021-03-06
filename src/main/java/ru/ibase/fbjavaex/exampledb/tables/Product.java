/*
 * This file is generated by jOOQ.
*/
package ru.ibase.fbjavaex.exampledb.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ru.ibase.fbjavaex.exampledb.DefaultSchema;
import ru.ibase.fbjavaex.exampledb.Keys;
import ru.ibase.fbjavaex.exampledb.tables.records.ProductRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Product extends TableImpl<ProductRecord> {

    private static final long serialVersionUID = -2004175650;

    /**
     * The reference instance of <code>PRODUCT</code>
     */
    public static final Product PRODUCT = new Product();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProductRecord> getRecordType() {
        return ProductRecord.class;
    }

    /**
     * The column <code>PRODUCT.PRODUCT_ID</code>.
     */
    public final TableField<ProductRecord, Integer> PRODUCT_ID = createField("PRODUCT_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>PRODUCT.NAME</code>.
     */
    public final TableField<ProductRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>PRODUCT.PRICE</code>.
     */
    public final TableField<ProductRecord, BigDecimal> PRICE = createField("PRICE", org.jooq.impl.SQLDataType.DECIMAL(15, 2).nullable(false), this, "");

    /**
     * The column <code>PRODUCT.DESCRIPTION</code>.
     */
    public final TableField<ProductRecord, String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>PRODUCT</code> table reference
     */
    public Product() {
        this(DSL.name("PRODUCT"), null);
    }

    /**
     * Create an aliased <code>PRODUCT</code> table reference
     */
    public Product(String alias) {
        this(DSL.name(alias), PRODUCT);
    }

    /**
     * Create an aliased <code>PRODUCT</code> table reference
     */
    public Product(Name alias) {
        this(alias, PRODUCT);
    }

    private Product(Name alias, Table<ProductRecord> aliased) {
        this(alias, aliased, null);
    }

    private Product(Name alias, Table<ProductRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProductRecord> getPrimaryKey() {
        return Keys.PK_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProductRecord>> getKeys() {
        return Arrays.<UniqueKey<ProductRecord>>asList(Keys.PK_PRODUCT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Product as(String alias) {
        return new Product(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Product as(Name alias) {
        return new Product(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Product rename(String name) {
        return new Product(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Product rename(Name name) {
        return new Product(name, null);
    }
}
