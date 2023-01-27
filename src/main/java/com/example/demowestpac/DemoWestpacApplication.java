package com.example.demowestpac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoWestpacApplication {
    public static void main(String[] args) {
        String token = "SECRET_TOKEN_12315345345345345345";
        SpringApplication.run(DemoWestpacApplication.class, args);
    }

}
