package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@SpringBootApplication
@EntityScan("com.demo.classes.Producto.class")
@EnableJpaRepositories("com.demo.classes.ProductoRepository.class")
//Aquí debo declarar dónde se encuentra el servicio
@ComponentScan({"com.demo.classes.ProductoService.class", "com.demo.classes.ProductoServiceController.class"})

public class DemoApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

// @EntityScan("com.demo.classes.*")  
// @SpringBootApplication(scanBasePackages = "com.demo.classes.*")
// @EnableJpaRepositories(basePackages = "com.demo.classes.*")
// @ComponentScan(basePackages = "com.demo.classes.*")