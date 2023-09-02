package com.clndantut.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration  //ok, con esta anotación voy a buscar bean configurations
public class MyConfig {

    @Bean   //para demostrar bean cuando no quiero anotar a nivel de clase(Component, Repository, etc)
    public RestTemplate restTemplate(){
        return new RestTemplateBuilder().build();
    }

}
