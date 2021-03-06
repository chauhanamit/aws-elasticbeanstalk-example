package com.javatechie.aws.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//https://www.youtube.com/watch?v=MBpcmoifpNY&ab_channel=JavaTechie
@SpringBootApplication
@RestController
public class AwsElasticbeanstalkExampleApplication {

    @GetMapping("/status")
    public String deploy() {
        return "Application deployed to AWS beanstalk....";
    }

    public static void main(String[] args) {
        SpringApplication.run(AwsElasticbeanstalkExampleApplication.class, args);
    }

}
