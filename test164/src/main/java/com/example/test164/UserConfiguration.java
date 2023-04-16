package com.example.test164;

import com.example.test164.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {
    @Bean
    public User getUser(){

        return new User("Shubham", 23);
    }
}
