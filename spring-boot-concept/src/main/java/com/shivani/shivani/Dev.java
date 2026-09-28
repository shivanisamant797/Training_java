package com.shivani.shivani;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//constructor injection -> default
//field injection and setter injecition you have to use auto wired

@Component
public class Dev {
     @Autowired
     private Laptop laptop;


//   constuctor injection
//    public Dev(Laptop laptop){
//        this.laptop=laptop;
//
//    }


    public void build(){
        laptop.compile();
        System.out.println("Working on Awesome Project ");
    }
}
