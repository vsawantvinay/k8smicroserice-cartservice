package com.sawant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cartservice {
    
    @GetMapping ("/cartservice")
    public String cartservic() {
        return "Welcome to my cart service";
    }
}
