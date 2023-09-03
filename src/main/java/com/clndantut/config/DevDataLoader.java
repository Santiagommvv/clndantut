package com.clndantut.config;

import com.clndantut.model.Content;
import com.clndantut.repository.ContentRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;
//import org.springframework.stereotype.Controller;

//@Controller /*como es functional interface puede ser targeteada con una lambda,
// por eso lo hace a nivel raíz en vez que en una clase especializada*/

@Component
public class DevDataLoader implements CommandLineRunner {

    private final ContentRepository repository;
    private final ObjectMapper objectMapper;

    public DevDataLoader(ContentRepository repository, ObjectMapper objectMapper) {
        this.repository = repository;
        this.objectMapper = objectMapper;
    }

    @Override
    public void run(String... args) throws Exception {

        try(InputStream inputStream = TypeReference.class.getResourceAsStream("/data/content.json")){
            repository.saveAll(objectMapper.readValue(inputStream, new TypeReference<List<Content>>(){}));
        }

    }
}