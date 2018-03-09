/*
 * This file is generated by jOOQ.
*/
package ru.ibase.fbjavaex.exampledb.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import ru.ibase.fbjavaex.exampledb.DefaultSchema;
import ru.ibase.fbjavaex.exampledb.Keys;
import ru.ibase.fbjavaex.exampledb.tables.records.InvoiceLineRecord;


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
public class InvoiceLine extends TableImpl<InvoiceLineRecord> {

    private static final long serialVersionUID = 453779390;

    /**
     * The reference instance of <code>INVOICE_LINE</code>
     */
    public static final InvoiceLine INVOICE_LINE = new InvoiceLine();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InvoiceLineRecord> getRecordType() {
        return InvoiceLineRecord.class;
    }

    /**
     * The column <code>INVOICE_LINE.INVOICE_LINE_ID</code>.
     */
    public final TableField<InvoiceLineRecord, Integer> INVOICE_LINE_ID = createField("INVOICE_LINE_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>INVOICE_LINE.INVOICE_ID</code>.
     */
    public final TableField<InvoiceLineRecord, Integer> INVOICE_ID = createField("INVOICE_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>INVOICE_LINE.PRODUCT_ID</code>.
     */
    public final TableField<InvoiceLineRecord, Integer> PRODUCT_ID = createField("PRODUCT_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>INVOICE_LINE.QUANTITY</code>.
     */
    public final TableField<InvoiceLineRecord, Long> QUANTITY = createField("QUANTITY", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>INVOICE_LINE.SALE_PRICE</code>.
     */
    public final TableField<InvoiceLineRecord, BigDecimal> SALE_PRICE = createField("SALE_PRICE", org.jooq.impl.SQLDataType.DECIMAL.precision(15, 2).nullable(false), this, "");

    /**
     * Create a <code>INVOICE_LINE</code> table reference
     */
    public InvoiceLine() {
        this("INVOICE_LINE", null);
    }

    /**
     * Create an aliased <code>INVOICE_LINE</code> table reference
     */
    public InvoiceLine(String alias) {
        this(alias, INVOICE_LINE);
    }

    private InvoiceLine(String alias, Table<InvoiceLineRecord> aliased) {
        this(alias, aliased, null);
    }

    private InvoiceLine(String alias, Table<InvoiceLineRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<InvoiceLineRecord> getPrimaryKey() {
        return Keys.PK_INVOICE_LINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InvoiceLineRecord>> getKeys() {
        return Arrays.<UniqueKey<InvoiceLineRecord>>asList(Keys.PK_INVOICE_LINE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<InvoiceLineRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<InvoiceLineRecord, ?>>asList(Keys.FK_INVOICE_LINE_INVOICE, Keys.FK_INVOICE_LINE_PRODUCT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceLine as(String alias) {
        return new InvoiceLine(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InvoiceLine rename(String name) {
        return new InvoiceLine(name, null);
    }
}
