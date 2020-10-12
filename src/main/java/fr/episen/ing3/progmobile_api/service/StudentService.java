package fr.episen.ing3.progmobile_api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.episen.ing3.progmobile_api.ProgmobileApiApplication;
import fr.episen.ing3.progmobile_api.dto.Student;

@Service
public class StudentService {

	public Student createStudent(Student student) {
		student.registerToContext(ProgmobileApiApplication.studentsRepo);
		return student;
	}
	
	public Student updateStudent(Student student) {
		ProgmobileApiApplication.studentsRepo.put(student.getId(), student);
		return student;
	}
	
	public Boolean deleteStudent(Integer id) {
		if(ProgmobileApiApplication.studentsRepo.remove(id)!=null)
			return true;
		else
			return false;
	}
	
	public Student getStudent(Integer id) {
		return ProgmobileApiApplication.studentsRepo.get(id);
	}
	
	public List<Student> getStudents() {
        List<Student> studentsList = new ArrayList<Student>();
        for(Integer key : ProgmobileApiApplication.studentsRepo.keySet()) {
            studentsList.add(ProgmobileApiApplication.studentsRepo.get(key));
        }
        return studentsList;
	}
	
	
}
