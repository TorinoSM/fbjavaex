/*
 * This file is generated by jOOQ.
*/
package ru.ibase.fbjavaex.exampledb.routines;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;

import ru.ibase.fbjavaex.exampledb.DefaultSchema;


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
public class SpDeleteInvoiceLine extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -1697729860;

    /**
     * The parameter <code>SP_DELETE_INVOICE_LINE.INVOICE_LINE_ID</code>.
     */
    public static final Parameter<Integer> INVOICE_LINE_ID = createParameter("INVOICE_LINE_ID", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public SpDeleteInvoiceLine() {
        super("SP_DELETE_INVOICE_LINE", DefaultSchema.DEFAULT_SCHEMA);

        addInParameter(INVOICE_LINE_ID);
    }

    /**
     * Set the <code>INVOICE_LINE_ID</code> parameter IN value to the routine
     */
    public void setInvoiceLineId(Integer value) {
        setValue(INVOICE_LINE_ID, value);
    }
}
