package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student shefali = new Student(
                    1L,
                    "Shefali",
                    "shefali@gmail.com",
                    LocalDate.of(2000,1,11)
            );

            Student sanskriti = new Student(
                    "Sanskriti",
                    "sanskriti@gmail.com",
                    LocalDate.of(2007,10,5)
            );

            repository.saveAll(
                    List.of(shefali, sanskriti)
            );
        };
    }
}
