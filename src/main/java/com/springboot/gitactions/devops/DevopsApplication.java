package com.springboot.gitactions.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsApplication {
    @GetMapping("/messge")
    public String getMessage(){
        return "This project helps you to add the code to Github pipelines";
    }

    public static void main(String[] args) {
        SpringApplication.run(DevopsApplication.class, args);
    }

}
