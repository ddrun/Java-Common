package com.djran.example.authentication.service.user.impl;

import com.djran.example.authentication.service.user.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by d.djran@gmail.com on 2017/11/25
 */
public class UserServiceImpl implements UserService,UserDetailsService {
    /**
     * 获取用户信息
     * @param username
     * @return
     */
    @Override
    public UserDetails loadUserByUsername(String username) {

        return null;
    }
}
