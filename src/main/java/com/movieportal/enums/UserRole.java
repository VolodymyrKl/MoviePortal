package com.movieportal.enums;

import org.springframework.security.core.GrantedAuthority;


public enum UserRole implements GrantedAuthority {
    ADMIN,
    User;

    @Override
    public String getAuthority() {
        return name();
    }

}
