package com.example.dockerspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSpringBootApplication {

    @GetMapping("/message")
    public String getMessage() {
        return "welcome to docker";
    }
    public static void main(String[] args) {
        SpringApplication.run(DockerSpringBootApplication.class, args);
    }

}
