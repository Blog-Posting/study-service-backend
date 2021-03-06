package com.study.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.study.service")
public class StudyServiceApplication {

    public static void main(final String[] args) {
        SpringApplication.run(StudyServiceApplication.class, args);
    }
}