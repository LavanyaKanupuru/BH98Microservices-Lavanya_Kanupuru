package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GradeController {
	
	@RequestMapping("/Grade/{name}/{id}/{cmarks}/{pmarks}/{mmarks}")
	String myStudents(@PathVariable String name, @PathVariable int id, @PathVariable int cmarks, @PathVariable int pmarks, @PathVariable int mmarks) {
		StudentGrade s = new StudentGrade(id,name,pmarks,cmarks,mmarks);
		String grade = s.getGrade();
		return "Hi"+" "+name + " id " + id + " and your grade is " + grade; 
	}
	
	

}