package com.luv2code.springbootdemo.mycoolapp.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose " / " that return hello world

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }
}
