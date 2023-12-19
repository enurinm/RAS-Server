package com.ras.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class RasServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RasServerApplication.class, args);
    }

}
