package com.zpower.restservice.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Collection;

public class SecurityUserDetails extends SysUser implements UserDetails {
    private Collection<? extends GrantedAuthority> authorities;

    public SecurityUserDetails(String userName, Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
        this.setUserName(userName);
        String encode = new BCryptPasswordEncoder().encode("123456");
        this.setPassword(encode);
        this.setAuthorities(authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
