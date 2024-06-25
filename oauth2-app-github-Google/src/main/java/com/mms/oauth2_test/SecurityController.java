package com.mms.oauth2_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/")
    public String saludoPublic(){
        return "Hola public";
    }

    @GetMapping("/private")
    public String saludoPrivado(){
        return "Hola private";
    }
}
