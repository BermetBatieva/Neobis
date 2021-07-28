package com.example.product.service;

import com.example.product.dto.UserRegistrationDto;
import com.example.product.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
