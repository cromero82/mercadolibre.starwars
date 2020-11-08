package com.computrabajo.starwars.navegacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@EnableJpaRepositories
@SpringBootApplication
@CrossOrigin(origins = "*")
public class NavegacionApplication {

    public static void main(String[] args) {
        SpringApplication.run(NavegacionApplication.class, args);
    }

}
