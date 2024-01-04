package com.ras.test;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class RasTestServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RasTestServerApplication.class, args);
    }
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("test-api")
                .pathsToMatch("/api/test/**")
                .build();
    }

}
