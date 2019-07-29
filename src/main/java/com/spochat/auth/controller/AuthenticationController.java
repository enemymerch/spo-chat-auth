package com.spochat.auth.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @GetMapping(value = "/user")
    public AuthenticationResponse authenticate(@RequestHeader Map<String, String> header, ) {

    }
}
