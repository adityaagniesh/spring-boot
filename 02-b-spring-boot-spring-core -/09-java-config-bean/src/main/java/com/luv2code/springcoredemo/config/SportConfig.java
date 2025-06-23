package com.luv2code.springcoredemo.config;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean ("aquatic")               //providing random bean id here we give random and we access them in democontroller by id not coach name
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
