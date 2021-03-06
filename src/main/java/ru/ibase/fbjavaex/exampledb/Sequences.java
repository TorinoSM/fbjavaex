/*
 * This file is generated by jOOQ.
*/
package ru.ibase.fbjavaex.exampledb;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in 
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>GEN_CUSTOMER_ID</code>
     */
    public static final Sequence<Long> GEN_CUSTOMER_ID = new SequenceImpl<Long>("GEN_CUSTOMER_ID", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>GEN_INVOICE_ID</code>
     */
    public static final Sequence<Long> GEN_INVOICE_ID = new SequenceImpl<Long>("GEN_INVOICE_ID", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>GEN_INVOICE_LINE_ID</code>
     */
    public static final Sequence<Long> GEN_INVOICE_LINE_ID = new SequenceImpl<Long>("GEN_INVOICE_LINE_ID", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>GEN_PRODUCT_ID</code>
     */
    public static final Sequence<Long> GEN_PRODUCT_ID = new SequenceImpl<Long>("GEN_PRODUCT_ID", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>SEQ_WEBROLE</code>
     */
    public static final Sequence<Long> SEQ_WEBROLE = new SequenceImpl<Long>("SEQ_WEBROLE", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>SEQ_WEBUSER</code>
     */
    public static final Sequence<Long> SEQ_WEBUSER = new SequenceImpl<Long>("SEQ_WEBUSER", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>SEQ_WEBUSERINROLE</code>
     */
    public static final Sequence<Long> SEQ_WEBUSERINROLE = new SequenceImpl<Long>("SEQ_WEBUSERINROLE", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>SQL$DEFAULT</code>
     */
    public static final Sequence<Long> SQL$DEFAULT = new SequenceImpl<Long>("SQL$DEFAULT", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>seq_users_id</code>
     */
    public static final Sequence<Long> SEQ_USERS_ID = new SequenceImpl<Long>("seq_users_id", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.BIGINT);
}
