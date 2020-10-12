package fr.episen.ing3.progmobile_api;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.episen.ing3.progmobile_api.dto.Student;

@SpringBootApplication
public class ProgmobileApiApplication {
	
	public static HashMap<Integer,Student> studentsRepo; 

	public static void main(String[] args) {
		studentsRepo = new HashMap<Integer,Student>();
		SpringApplication.run(ProgmobileApiApplication.class, args);
	}

}
