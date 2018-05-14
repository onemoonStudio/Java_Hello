package com.javalec.spring_ex_proj.stdVal;

import javax.servlet.http.HttpServletRequest;
//import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
//import org.springframework.validation.Validator;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping(value="/create" , method = RequestMethod.GET)
	public String createStd(HttpServletRequest sReq , Model model) {
		model.addAttribute("name" ,sReq.getParameter("name"));
		model.addAttribute("age" ,Integer.parseInt(sReq.getParameter("age")));
	
		return "student/create";
	}
	
	@RequestMapping(value="/create" , method = RequestMethod.POST)
	public String createStd(Student student , BindingResult result) {
		 StudentValidator stdVal = new StudentValidator();
		 stdVal.validate(student, result);
		 if(result.hasErrors()) {
			 System.out.println("error");
		 }else {
			 System.out.println("no error");
		 }
		return "student/create";
	}
	
//	public String createStd(@Valid Student student , BindingResult result) {
//		 StudentValidator stdVal = new StudentValidator();
//		 stdVal.validate(student, result);
//		 if(result.hasErrors()) {
//			 System.out.println("error");
//		 }else {
//			 System.out.println("no error");
//		 }
//		return "student/create";
//	}
//	
//	@InitBinder
//	protected void initBinder(WebDataBinder binder) {
//		binder.setValidator(new StudentValidator());
//	}
	// pom.xml dependency 를 수정해야 한다.
	
	
	

}
