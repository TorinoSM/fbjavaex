/*
 * This file is generated by jOOQ.
*/
package ru.ibase.fbjavaex.exampledb;


import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import ru.ibase.fbjavaex.exampledb.tables.Customer;
import ru.ibase.fbjavaex.exampledb.tables.Invoice;
import ru.ibase.fbjavaex.exampledb.tables.InvoiceLine;
import ru.ibase.fbjavaex.exampledb.tables.Product;
import ru.ibase.fbjavaex.exampledb.tables.Users;
import ru.ibase.fbjavaex.exampledb.tables.Webrole;
import ru.ibase.fbjavaex.exampledb.tables.Webuser;
import ru.ibase.fbjavaex.exampledb.tables.Webuserinrole;
import ru.ibase.fbjavaex.exampledb.tables.records.CustomerRecord;
import ru.ibase.fbjavaex.exampledb.tables.records.InvoiceLineRecord;
import ru.ibase.fbjavaex.exampledb.tables.records.InvoiceRecord;
import ru.ibase.fbjavaex.exampledb.tables.records.ProductRecord;
import ru.ibase.fbjavaex.exampledb.tables.records.UsersRecord;
import ru.ibase.fbjavaex.exampledb.tables.records.WebroleRecord;
import ru.ibase.fbjavaex.exampledb.tables.records.WebuserRecord;
import ru.ibase.fbjavaex.exampledb.tables.records.WebuserinroleRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code></code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CustomerRecord> PK_CUSTOMER = UniqueKeys0.PK_CUSTOMER;
    public static final UniqueKey<InvoiceRecord> PK_INVOICE = UniqueKeys0.PK_INVOICE;
    public static final UniqueKey<InvoiceLineRecord> PK_INVOICE_LINE = UniqueKeys0.PK_INVOICE_LINE;
    public static final UniqueKey<ProductRecord> PK_PRODUCT = UniqueKeys0.PK_PRODUCT;
    public static final UniqueKey<WebroleRecord> PK_WEBROLE = UniqueKeys0.PK_WEBROLE;
    public static final UniqueKey<WebroleRecord> UNQ_WEBROLE = UniqueKeys0.UNQ_WEBROLE;
    public static final UniqueKey<WebuserRecord> PK_WEBUSER = UniqueKeys0.PK_WEBUSER;
    public static final UniqueKey<WebuserRecord> UNQ_WEBUSER = UniqueKeys0.UNQ_WEBUSER;
    public static final UniqueKey<WebuserinroleRecord> PK_WEBUSERINROLE = UniqueKeys0.PK_WEBUSERINROLE;
    public static final UniqueKey<UsersRecord> INTEG_86 = UniqueKeys0.INTEG_86;
    public static final UniqueKey<UsersRecord> USERS_EMAIL_UNIQUE = UniqueKeys0.USERS_EMAIL_UNIQUE;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<InvoiceRecord, CustomerRecord> FK_INVOCE_CUSTOMER = ForeignKeys0.FK_INVOCE_CUSTOMER;
    public static final ForeignKey<InvoiceLineRecord, InvoiceRecord> FK_INVOICE_LINE_INVOICE = ForeignKeys0.FK_INVOICE_LINE_INVOICE;
    public static final ForeignKey<InvoiceLineRecord, ProductRecord> FK_INVOICE_LINE_PRODUCT = ForeignKeys0.FK_INVOICE_LINE_PRODUCT;
    public static final ForeignKey<WebuserinroleRecord, WebuserRecord> FK_WEBUSERINROLE_USER = ForeignKeys0.FK_WEBUSERINROLE_USER;
    public static final ForeignKey<WebuserinroleRecord, WebroleRecord> FK_WEBUSERINROLE_ROLE = ForeignKeys0.FK_WEBUSERINROLE_ROLE;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<CustomerRecord> PK_CUSTOMER = Internal.createUniqueKey(Customer.CUSTOMER, "PK_CUSTOMER", Customer.CUSTOMER.CUSTOMER_ID);
        public static final UniqueKey<InvoiceRecord> PK_INVOICE = Internal.createUniqueKey(Invoice.INVOICE, "PK_INVOICE", Invoice.INVOICE.INVOICE_ID);
        public static final UniqueKey<InvoiceLineRecord> PK_INVOICE_LINE = Internal.createUniqueKey(InvoiceLine.INVOICE_LINE, "PK_INVOICE_LINE", InvoiceLine.INVOICE_LINE.INVOICE_LINE_ID);
        public static final UniqueKey<ProductRecord> PK_PRODUCT = Internal.createUniqueKey(Product.PRODUCT, "PK_PRODUCT", Product.PRODUCT.PRODUCT_ID);
        public static final UniqueKey<WebroleRecord> PK_WEBROLE = Internal.createUniqueKey(Webrole.WEBROLE, "PK_WEBROLE", Webrole.WEBROLE.WEBROLE_ID);
        public static final UniqueKey<WebroleRecord> UNQ_WEBROLE = Internal.createUniqueKey(Webrole.WEBROLE, "UNQ_WEBROLE", Webrole.WEBROLE.NAME);
        public static final UniqueKey<WebuserRecord> PK_WEBUSER = Internal.createUniqueKey(Webuser.WEBUSER, "PK_WEBUSER", Webuser.WEBUSER.WEBUSER_ID);
        public static final UniqueKey<WebuserRecord> UNQ_WEBUSER = Internal.createUniqueKey(Webuser.WEBUSER, "UNQ_WEBUSER", Webuser.WEBUSER.EMAIL);
        public static final UniqueKey<WebuserinroleRecord> PK_WEBUSERINROLE = Internal.createUniqueKey(Webuserinrole.WEBUSERINROLE, "PK_WEBUSERINROLE", Webuserinrole.WEBUSERINROLE.ID);
        public static final UniqueKey<UsersRecord> INTEG_86 = Internal.createUniqueKey(Users.USERS, "INTEG_86", Users.USERS.ID);
        public static final UniqueKey<UsersRecord> USERS_EMAIL_UNIQUE = Internal.createUniqueKey(Users.USERS, "users_email_unique", Users.USERS.EMAIL);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<InvoiceRecord, CustomerRecord> FK_INVOCE_CUSTOMER = Internal.createForeignKey(ru.ibase.fbjavaex.exampledb.Keys.PK_CUSTOMER, Invoice.INVOICE, "FK_INVOCE_CUSTOMER", Invoice.INVOICE.CUSTOMER_ID);
        public static final ForeignKey<InvoiceLineRecord, InvoiceRecord> FK_INVOICE_LINE_INVOICE = Internal.createForeignKey(ru.ibase.fbjavaex.exampledb.Keys.PK_INVOICE, InvoiceLine.INVOICE_LINE, "FK_INVOICE_LINE_INVOICE", InvoiceLine.INVOICE_LINE.INVOICE_ID);
        public static final ForeignKey<InvoiceLineRecord, ProductRecord> FK_INVOICE_LINE_PRODUCT = Internal.createForeignKey(ru.ibase.fbjavaex.exampledb.Keys.PK_PRODUCT, InvoiceLine.INVOICE_LINE, "FK_INVOICE_LINE_PRODUCT", InvoiceLine.INVOICE_LINE.PRODUCT_ID);
        public static final ForeignKey<WebuserinroleRecord, WebuserRecord> FK_WEBUSERINROLE_USER = Internal.createForeignKey(ru.ibase.fbjavaex.exampledb.Keys.PK_WEBUSER, Webuserinrole.WEBUSERINROLE, "FK_WEBUSERINROLE_USER", Webuserinrole.WEBUSERINROLE.WEBUSER_ID);
        public static final ForeignKey<WebuserinroleRecord, WebroleRecord> FK_WEBUSERINROLE_ROLE = Internal.createForeignKey(ru.ibase.fbjavaex.exampledb.Keys.PK_WEBROLE, Webuserinrole.WEBUSERINROLE, "FK_WEBUSERINROLE_ROLE", Webuserinrole.WEBUSERINROLE.WEBROLE_ID);
    }
}
