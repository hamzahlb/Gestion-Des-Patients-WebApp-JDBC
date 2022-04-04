package com.example.patientsmvc;

import com.example.patientsmvc.entities.Patient;
import com.example.patientsmvc.repositories.PatientRepository;
import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class SpringBootSpringMvcThymeleafSpringDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSpringMvcThymeleafSpringDataApplication.class, args);
    }
        @Bean
        CommandLineRunner CommandLineRunner(PatientRepository patientRepository){
        return args -> {
                patientRepository.save(new Patient(null,"Hamza",new Date(),false,12));
                patientRepository.save(new Patient(null,"Amine",new Date(),true,12));
                patientRepository.save(new Patient(null,"Ayoub",new Date(),false,12));
                patientRepository.save(new Patient(null,"Ayman",new Date(),true,12));


        patientRepository.findAll().forEach(p->{
            System.out.println(p.getNom());
                });
        };
    }
}
