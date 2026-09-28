package com.shivani.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet(){
        return "Welcome to telusko ";
    }
    @RequestMapping("/about")
    public String about(){
        return "we don't teach ,we Educate ";
    }
}
