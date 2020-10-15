package fr.episen.ing3.progmobile_api;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.episen.ing3.progmobile_api.dto.Student;

@SpringBootApplication
public class ProgmobileApiApplication {
	
	public static HashMap<Integer,Student> studentsRepo;
	public static Integer index;

	public static void main(String[] args) {
		studentsRepo = new HashMap<Integer,Student>();
		index=0;
		SpringApplication.run(ProgmobileApiApplication.class, args);
	}

}
