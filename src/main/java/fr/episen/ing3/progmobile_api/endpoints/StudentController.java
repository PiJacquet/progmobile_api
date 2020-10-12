package fr.episen.ing3.progmobile_api.endpoints;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.episen.ing3.progmobile_api.dto.Student;
import fr.episen.ing3.progmobile_api.service.StudentService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class StudentController {

	StudentService studentService;
	
	@PostMapping("/student")
	/* Créer un étudiant */
	public void createStudent(@RequestBody Student student) {
		log.info("create " + student.toString());
		Student newStudent = studentService.createStudent(student);
	}
	
	@PutMapping("/student")
	/* Met à jour un étudiant */
	public void updateStudent(@PathParam("student") Student student) {
		log.info("update " + student.toString());
		Student updateStudent = studentService.updateStudent(student);
	}
	
	@DeleteMapping("/student/{id}")
	/* Supprime un étudiant */
	public void deleteStudent(@PathParam("id") Integer id) {
		log.info("delete " + id);
		Boolean isDeleted = studentService.deleteStudent(id);
	}
	
	@GetMapping("/student/{id}")
	@ResponseBody 
	/* Retourne un étudiant ciblé */
	public ResponseEntity<Student> getStudent(@PathVariable("id") Integer id){
		log.info("get " + id);
		Student getStudent = studentService.getStudent(id);
		return ResponseEntity.ok(getStudent);
	}
	
	@GetMapping("/students")
	@ResponseBody 
	/* Retourne tous les étudiants */
	public ResponseEntity<List<Student>> getStudents(){
		log.info("getAll");
		List<Student> getStudents = studentService.getStudents();
		return ResponseEntity.ok(getStudents);
	}

}
