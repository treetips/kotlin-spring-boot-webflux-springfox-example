/*
 * This file is generated by jOOQ.
 */
package com.example;


import com.example.tables.Address;
import com.example.tables.Prefecture;
import com.example.tables.Role;
import com.example.tables.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Work extends SchemaImpl {

    private static final long serialVersionUID = -2070380595;

    /**
     * The reference instance of <code>work</code>
     */
    public static final Work WORK = new Work();

    /**
     * 住所
     */
    public final Address ADDRESS = com.example.tables.Address.ADDRESS;

    /**
     * 都道府県
     */
    public final Prefecture PREFECTURE = com.example.tables.Prefecture.PREFECTURE;

    /**
     * 役割
     */
    public final Role ROLE = com.example.tables.Role.ROLE;

    /**
     * ユーザ
     */
    public final User USER = com.example.tables.User.USER;

    /**
     * No further instances allowed
     */
    private Work() {
        super("work", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Address.ADDRESS,
            Prefecture.PREFECTURE,
            Role.ROLE,
            User.USER);
    }
}