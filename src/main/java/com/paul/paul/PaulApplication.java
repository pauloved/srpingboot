package com.paul.paul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)

public class PaulApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaulApplication.class, args);
        System.out.println("hello paul");
    }

}

