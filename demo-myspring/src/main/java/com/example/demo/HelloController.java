package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



	@RestController
	public class HelloController {
		@RequestMapping("/")
		@ResponseBody
		String hello() {
			return "Hello from my spring boot application!";
			}
		@RequestMapping("/tools")
		String tools() {
			return "Hello from my spring boot tools application!";
		}
		@RequestMapping("/calculator/{value1}/{value2}")

		String calculator(@PathVariable Double value1,@PathVariable Double value2) {
		double a = value1+value2;
		double b = value1-value2;
		double c = value1*value2;
		double d = value1/value2;
		return "addition =" +a +"subraction ="+b +" multiplication ="+c+"division ="+d;
}
		@RequestMapping("/Grade/{marks}")

		String grade(@PathVariable Double marks) {
			
				
				if(marks>=100 && marks>=90)
				{
					return("Your grade is A");
				}
				else if(marks>=80)
				{
					return ("your grade is B");
				}
				else if(marks>=70)
				{
					return("your grade is c");
					
				}
				else
				{
					return("your grade is D");
				}
			}
		
		
		
}