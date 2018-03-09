/*
 * This file is generated by jOOQ.
*/
package ru.ibase.fbjavaex.exampledb.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import ru.ibase.fbjavaex.exampledb.DefaultSchema;
import ru.ibase.fbjavaex.exampledb.Keys;
import ru.ibase.fbjavaex.exampledb.tables.records.CustomerRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Customer extends TableImpl<CustomerRecord> {

    private static final long serialVersionUID = 1261080475;

    /**
     * The reference instance of <code>CUSTOMER</code>
     */
    public static final Customer CUSTOMER = new Customer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerRecord> getRecordType() {
        return CustomerRecord.class;
    }

    /**
     * The column <code>CUSTOMER.CUSTOMER_ID</code>.
     */
    public final TableField<CustomerRecord, Integer> CUSTOMER_ID = createField("CUSTOMER_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>CUSTOMER.NAME</code>.
     */
    public final TableField<CustomerRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(60).nullable(false), this, "");

    /**
     * The column <code>CUSTOMER.ADDRESS</code>.
     */
    public final TableField<CustomerRecord, String> ADDRESS = createField("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR.length(250), this, "");

    /**
     * The column <code>CUSTOMER.ZIPCODE</code>.
     */
    public final TableField<CustomerRecord, String> ZIPCODE = createField("ZIPCODE", org.jooq.impl.SQLDataType.CHAR.length(10), this, "");

    /**
     * The column <code>CUSTOMER.PHONE</code>.
     */
    public final TableField<CustomerRecord, String> PHONE = createField("PHONE", org.jooq.impl.SQLDataType.VARCHAR.length(14), this, "");

    /**
     * Create a <code>CUSTOMER</code> table reference
     */
    public Customer() {
        this("CUSTOMER", null);
    }

    /**
     * Create an aliased <code>CUSTOMER</code> table reference
     */
    public Customer(String alias) {
        this(alias, CUSTOMER);
    }

    private Customer(String alias, Table<CustomerRecord> aliased) {
        this(alias, aliased, null);
    }

    private Customer(String alias, Table<CustomerRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<CustomerRecord> getPrimaryKey() {
        return Keys.PK_CUSTOMER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CustomerRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomerRecord>>asList(Keys.PK_CUSTOMER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Customer as(String alias) {
        return new Customer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Customer rename(String name) {
        return new Customer(name, null);
    }
}
