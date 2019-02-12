/*
 * This file is generated by jOOQ.
 */
package com.example.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * 都道府県
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Prefecture implements Serializable {

    private static final long serialVersionUID = 1130472162;

    private final String prefectureCd;
    private final String prefectureName;

    public Prefecture(Prefecture value) {
        this.prefectureCd = value.prefectureCd;
        this.prefectureName = value.prefectureName;
    }

    public Prefecture(
        String prefectureCd,
        String prefectureName
    ) {
        this.prefectureCd = prefectureCd;
        this.prefectureName = prefectureName;
    }

    @NotNull
    @Size(max = 2)
    public String getPrefectureCd() {
        return this.prefectureCd;
    }

    @Size(max = 191)
    public String getPrefectureName() {
        return this.prefectureName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Prefecture (");

        sb.append(prefectureCd);
        sb.append(", ").append(prefectureName);

        sb.append(")");
        return sb.toString();
    }
}
