/*
 * This file is generated by jOOQ.
 */
package com.example.tables.records;


import com.example.tables.Role;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UShort;


/**
 * 役割
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleRecord extends UpdatableRecordImpl<RoleRecord> implements Record4<UShort, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = -856157549;

    /**
     * Setter for <code>work.role.role_cd</code>. 役割コード
     */
    public RoleRecord setRoleCd(UShort value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>work.role.role_cd</code>. 役割コード
     */
    @NotNull
    public UShort getRoleCd() {
        return (UShort) get(0);
    }

    /**
     * Setter for <code>work.role.role_name</code>. 役割名
     */
    public RoleRecord setRoleName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>work.role.role_name</code>. 役割名
     */
    @NotNull
    @Size(max = 191)
    public String getRoleName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>work.role.created_at</code>. 作成日時
     */
    public RoleRecord setCreatedAt(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>work.role.created_at</code>. 作成日時
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>work.role.updated_at</code>. 更新日時
     */
    public RoleRecord setUpdatedAt(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>work.role.updated_at</code>. 更新日時
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UShort> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UShort, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UShort, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UShort> field1() {
        return Role.ROLE.ROLE_CD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Role.ROLE.ROLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field3() {
        return Role.ROLE.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field4() {
        return Role.ROLE.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UShort component1() {
        return getRoleCd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getRoleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component3() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component4() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UShort value1() {
        return getRoleCd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRoleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value3() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value4() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRecord value1(UShort value) {
        setRoleCd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRecord value2(String value) {
        setRoleName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRecord value3(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRecord value4(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRecord values(UShort value1, String value2, LocalDateTime value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoleRecord
     */
    public RoleRecord() {
        super(Role.ROLE);
    }

    /**
     * Create a detached, initialised RoleRecord
     */
    public RoleRecord(UShort roleCd, String roleName, LocalDateTime createdAt, LocalDateTime updatedAt) {
        super(Role.ROLE);

        set(0, roleCd);
        set(1, roleName);
        set(2, createdAt);
        set(3, updatedAt);
    }
}