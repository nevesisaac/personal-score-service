package com.logic.personal_score_service.rest.provide;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioScore {
    
    @GetMapping("/score")
    public String getScore(){
        return "hello world";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
