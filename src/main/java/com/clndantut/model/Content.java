package com.clndantut.model;

import java.time.LocalDateTime;
//import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

/*
    * org.springframework.data.relational.core.mapping.Column y Table
    * para marcar @Table a Content("nombresihacefalta")
    * y @Column(<<con el mapeo acá>>)
    *
    */
public record Content(
    @Id
    Integer id,
    @NotBlank
    String title,
    String description,
    Status status,
    Type contentType,
    LocalDateTime dateCreated,
    LocalDateTime dateUpdated,
    String url
) {
}
