package com.example.passportapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class PassportAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassportAppApplication.class, args);
    }

}
