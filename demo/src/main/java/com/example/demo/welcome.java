package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class welcome {

    @RequestMapping("/")
    public String index() {
        return "index1.html";
    }

}