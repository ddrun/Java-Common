package com.djran.example.authentication.service.user;

import org.springframework.security.core.userdetails.UserDetails;

/**
 * Created by Administrator on 2017/11/25
 */
public interface UserService{
    UserDetails loadUserByUsername(String username);
}
