package com.example.product.controller;


import com.example.product.config.JwtUtil;
import com.example.product.dto.AuthenticationRequest;
import com.example.product.dto.UserRegistrationDto;
import com.example.product.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtTokenUtil;

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody UserRegistrationDto registrationRequest) {
        UserRegistrationDto u = new UserRegistrationDto();
        u.setPassword(registrationRequest.getPassword());
        u.setEmail(registrationRequest.getEmail());
        userService.save(u);
        return "OK";
    }



    @PostMapping("/auth")
    @ResponseBody
    public String createAuthToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );
        }catch (BadCredentialsException e){
            throw new Exception("Incorrect username or password!!!",e);
        }
        return jwtTokenUtil.generateToken(authenticationRequest.getUsername());
    }

    @GetMapping("/")
    public String HelloUser(){
        return "Hello, User!";
    }
}