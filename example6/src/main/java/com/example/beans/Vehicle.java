package com.example.beans;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void intialize(){
        this.name = "Honda";
    }

    @PreDestroy
    public void destroy(){
        System.out.println(
                "Destroying Vehicle Bean"
        );
    }

    public void printHello(){
    System.out.println(
            "Printing Hello from Component Vehicle Bean"
    );
    }

}
