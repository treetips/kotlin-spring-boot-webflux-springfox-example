/*
 * This file is generated by jOOQ.
 */
package com.example.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
public class Role implements Serializable {

    private static final long serialVersionUID = -451403674;

    private final UShort        roleCd;
    private final String        roleName;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    public Role(Role value) {
        this.roleCd = value.roleCd;
        this.roleName = value.roleName;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
    }

    public Role(
        UShort        roleCd,
        String        roleName,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
    ) {
        this.roleCd = roleCd;
        this.roleName = roleName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @NotNull
    public UShort getRoleCd() {
        return this.roleCd;
    }

    @NotNull
    @Size(max = 191)
    public String getRoleName() {
        return this.roleName;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Role (");

        sb.append(roleCd);
        sb.append(", ").append(roleName);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);

        sb.append(")");
        return sb.toString();
    }
}