package com.clndantut.repository;

import com.clndantut.model.Content;
import com.clndantut.model.Status;
import com.clndantut.model.Type;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

//dedicada a hacer las cosas en memoria, reemplazada por CReposit, que extiende interface ListCrud etc
@Repository
public class ContentCollectionRepository {

    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository(){}

    public List<Content> findAll(){

        return contentList;
    }

    public Optional<Content> findById(Integer id){
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    public void save(Content content) {
        contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);
    }

    @PostConstruct
    private void init(){
        Content content = new Content(1,
                "My First Blog Post",
                "My first blog post",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.of(2023,8,29,14,25,20),
                null,
                "");

        contentList.add(content);
    }


    public boolean existsById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).count() == 1;
    }

    public void delete(Integer id) {
        contentList.removeIf(c -> c.id().equals(id)) ;
    }
}
