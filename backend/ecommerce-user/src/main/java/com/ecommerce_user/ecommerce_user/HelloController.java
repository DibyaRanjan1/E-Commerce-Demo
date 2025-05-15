package com.ecommerce_user.ecommerce_user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/user")
    public String index() {
        return "Hello from ECommerce user microservice!";
    }

}