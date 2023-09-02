package com.clndantut.repository;

import com.clndantut.model.Content;
import com.clndantut.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

//la ventaja de usar ListCrudRepository es que sus métodos trabajan con listas
// en lugar de trabajar con Iterable<> como CrudRepository
// no se marca esta interfaz con @Repository,
// Spring se encarga de convertir esta interface en una implementación directamente
public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    List<Content> findAllByTitleContains(String keyword);

    @Query("""
            SELECT * FROM Content
            WHERE status = :status
            """)
    List<Content> listByStatus(@Param("status") Status status);

}
