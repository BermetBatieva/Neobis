package com.example.product.controller;

import com.example.product.dto.AuthenticationRequest;
import com.example.product.security.JwtUtil;
import com.example.product.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserService userDetailsService;
    @Autowired
    private JwtUtil jwtTokenUtil;

//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }

//    @GetMapping("/")
//    public String home() {
//        return "index";
//    }

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
}