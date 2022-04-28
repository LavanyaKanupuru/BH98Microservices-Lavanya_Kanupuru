package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class GradeController {
	
	
private final StudentRepository studentRepository;
	
	GradeController(StudentRepository studentRepository){
		this.studentRepository=studentRepository;
	}

	@GetMapping("/students")
	List<StudentGrade> getAll(){
		return studentRepository.findAll();
	}
	
	/*String myStudents( String name,  int id,  int cmarks,  int pmarks, int mmarks) {
		StudentGrade s = new StudentGrade(id,name,pmarks,cmarks,mmarks);
		String grade = s.getGrade();
		return "Hi"+" "+name + " id " + id + " and your grade is " + grade;
	}
	
		List<StudentGrade> getAll(){
	
			return studentRepository.findAll(); 
	}*/
	
	
	
	

}
