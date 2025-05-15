package com.ecommerce_product.ecommerce_product;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}