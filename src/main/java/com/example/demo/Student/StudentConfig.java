package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;
import static java.time.Month.MAY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student lee = new Student(
                    1L,
                    "lee",
                    21,
                    LocalDate.of(2000, APRIL, 3),
                    "lee@gmail.com"
            );

            Student alex = new Student(
                    "alex",
                    22,
                    LocalDate.of(1992, MAY, 13),
                    "alex@gmail.com"
            );

            studentRepository.saveAll(
                    List.of(lee, alex)
            );
        };
    }
}
