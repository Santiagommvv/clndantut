package com.clndantut;

import com.clndantut.config.ContentCalendarProperties;
import com.clndantut.model.Content;
import com.clndantut.model.Status;
import com.clndantut.model.Type;
import com.clndantut.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.Month;

@SpringBootApplication
@EnableConfigurationProperties(ContentCalendarProperties.class)
public class ClndantutApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClndantutApplication.class, args);
	}


    /*
    @Bean
    CommandLineRunner cmdLRunner(ContentRepository repository){
        return args -> {

            Content content1 = new Content(null,
                    "CommandLineRunner ourse",
                    "Un curso para empezar a usar la clase CommandLineRunner de Spring",
                    Status.IN_PROGRESS,
                    Type.VIDEO,
                    LocalDateTime.of(2017, Month.SEPTEMBER,30,1,9),
                    LocalDateTime.now(),
                    "https://www.youtube.com/watch?v=gBN8x4yN5Ks");

            Content content2 = new Content(null,
                    "Database Migrations with Flyway",
                    "Un artículo de Eugene Paraschiv, campeón Java",
                    Status.IN_PROGRESS,
                    Type.ARTICLE,
                    LocalDateTime.of(2022, Month.OCTOBER,15,22,11),
                    LocalDateTime.now(),
                    "https://www.baeldung.com/database-migrations-with-flyway");

            Content content3 = new Content(null,
                    "Spring Boot 3 Crash Course",
                    "Curso de Sprng Boot de Dan Vega, cuyo aprendizaje vuelco en este material",
                    Status.PUBLISHED,
                    Type.COURSE,
                    LocalDateTime.of(2023, Month.JANUARY,23,10,00),
                    LocalDateTime.now(),
                    "https://www.youtube.com/watch?v=UgX5lgv4uVM");

            Content content4 = new Content(null,
                    "Killing creativity",
                    "charla TED de Ken Robinson sobre el sistema educativo",
                    Status.COMPLETED,
                    Type.CONFERENCE_TALK,
                    LocalDateTime.of(2010, Month.JULY,20,20,20),
                    LocalDateTime.now(),
                    "https://www.youtube.com/watch?v=XSu38uFEVuI");

            Content content5 = new Content(null,
                    "Beethoven op.53 ",
                    "La famosa sonata Waldstein, interpretada por Mikhail Pletnev. Un elissir",
                    Status.COMPLETED,
                    Type.VIDEO,
                    LocalDateTime.of(2014, Month.FEBRUARY,13,2,34),
                    LocalDateTime.now(),
                    "https://www.youtube.com/watch?v=lbblMw6k1cU");

            repository.save(content1);
            repository.save(content2);
            repository.save(content3);
            repository.save(content4);
            repository.save(content5);
        };
    }
    */

}
