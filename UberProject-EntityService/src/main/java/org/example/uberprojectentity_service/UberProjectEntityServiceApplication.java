package org.example.uberprojectentity_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EntityScan
public class UberProjectEntityServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UberProjectEntityServiceApplication.class, args);
    }

}
