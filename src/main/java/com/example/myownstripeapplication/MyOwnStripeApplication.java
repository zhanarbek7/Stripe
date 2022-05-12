package com.example.myownstripeapplication;

import com.stripe.Stripe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MyOwnStripeApplication {

    @PostConstruct
    public void setup(){
        Stripe.apiKey = "sk_test_51KxqZnJNW48ppxohaUj8dk2WUAb1A3GQfTcYjJ4AOX9p7UcbjYZeMjv0HxXEDf3N5TCNStq9PkknIpHNArOghQAI00LMPqphuS";    }

    public static void main(String[] args) {
        SpringApplication.run(MyOwnStripeApplication.class, args);
    }

}
