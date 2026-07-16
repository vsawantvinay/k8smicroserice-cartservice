package com.sawant;
@restcontroller
public class cartservice {
    @GetMapping ("/cartservice")
    public String cartservic() {
        return "Welcome to my cart service";
    }
}
