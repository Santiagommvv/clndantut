package com.clndantut.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;

//@Controller /*como es functional interface puede ser targeteada con una lambda,
// por eso lo hace a nivel raíz en vez que en una clase especializada*/

@Profile("!dev")
@Component
public class ProdDataLoader implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("saludo desde ********** production");
        System.out.println("saludo desde ************ production");
        System.out.println("saludo desde ************** production");
        System.out.println("saludo desde **************** production");
        System.out.println("saludo desde ****************** production");
        System.out.println("saludo desde ***************** production");
        System.out.println("saludo desde *************** production");
        System.out.println("saludo desde ************ production");
        System.out.println("saludo desde ********** production");
        System.out.println("saludo desde ******** production");
    }
}
