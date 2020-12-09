package org.liftoff.recipebook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {

    @GetMapping("/register")
    public String displayRegistrationForm(){
        return "register";
    }

    @GetMapping("/login")
    public String displayLoginForm(){
        return "login";
    }
}
