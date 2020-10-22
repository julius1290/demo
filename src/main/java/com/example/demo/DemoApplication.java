package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {


    public     String password = "superSecret";
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public static int  add(int a, int b){
        return a+b;
    }

    public static int addInt(int a, int b) {
        return a+b;
    }
}
