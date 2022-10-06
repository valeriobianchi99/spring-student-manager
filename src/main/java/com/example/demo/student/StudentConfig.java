package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args -> {
            Student mariam = new Student("maria", LocalDate.of(2000, Month.JANUARY, 5), "email" );
            Student alex = new Student("alex", LocalDate.of(2000, Month.JANUARY, 5), "eifiifsd" );
            repository.saveAll(Arrays.asList(mariam, alex));
        };
    }
}
