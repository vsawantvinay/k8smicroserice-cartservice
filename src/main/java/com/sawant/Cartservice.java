package com.sawant.microservice_cartservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cartservice {

    @GetMapping("/cartservice")
    public String cartservice() {
        return "Welcome to my cart service";
    }
}
