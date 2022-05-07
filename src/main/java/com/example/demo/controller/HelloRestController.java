package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class HelloRestController {

    // curl localhost:6060/hello -w "\n"
    @RequestMapping(value = { "/home"})
    public String sayHello() {
        return "Hello from Bridgelabz" ;
    }
}
