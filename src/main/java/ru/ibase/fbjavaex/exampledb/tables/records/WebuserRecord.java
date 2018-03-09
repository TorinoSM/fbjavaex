/*
 * This file is generated by jOOQ.
*/
package ru.ibase.fbjavaex.exampledb.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import ru.ibase.fbjavaex.exampledb.tables.Webuser;


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
public class WebuserRecord extends UpdatableRecordImpl<WebuserRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = -1291601106;

    /**
     * Setter for <code>WEBUSER.WEBUSER_ID</code>.
     */
    public void setWebuserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>WEBUSER.WEBUSER_ID</code>.
     */
    public Integer getWebuserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>WEBUSER.EMAIL</code>.
     */
    public void setEmail(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>WEBUSER.EMAIL</code>.
     */
    public String getEmail() {
        return (String) get(1);
    }

    /**
     * Setter for <code>WEBUSER.PASSWD</code>.
     */
    public void setPasswd(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>WEBUSER.PASSWD</code>.
     */
    public String getPasswd() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Webuser.WEBUSER.WEBUSER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Webuser.WEBUSER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Webuser.WEBUSER.PASSWD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getWebuserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPasswd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebuserRecord value1(Integer value) {
        setWebuserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebuserRecord value2(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebuserRecord value3(String value) {
        setPasswd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebuserRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WebuserRecord
     */
    public WebuserRecord() {
        super(Webuser.WEBUSER);
    }

    /**
     * Create a detached, initialised WebuserRecord
     */
    public WebuserRecord(Integer webuserId, String email, String passwd) {
        super(Webuser.WEBUSER);

        set(0, webuserId);
        set(1, email);
        set(2, passwd);
    }
}
