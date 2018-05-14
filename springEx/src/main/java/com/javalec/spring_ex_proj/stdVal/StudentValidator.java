package com.javalec.spring_ex_proj.stdVal;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return Student.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		// TODO Auto-generated method stub
		
		System.out.println("Validate Student ");
		Student student = (Student)obj;
		
		String name = student.getName();
		if(name == null || name.trim().isEmpty()) {
			System.out.println("something wrong at name");
			errors.rejectValue("name", "trouble");
		}
		
		int age = student.getAge();
		if(age == 0) {
			System.out.println("something wrong at age");
			errors.rejectValue("age", "trouble");
		}
			
		
		
	}

	

}
