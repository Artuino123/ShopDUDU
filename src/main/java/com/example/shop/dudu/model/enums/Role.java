package com.example.shop.dudu.model.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ROL_USER, ROL_ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}
