package com.javalec.spring_ex_proj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/view")
	public String view() { 
		
		return "view";
	}
	
	@RequestMapping("/content/contentView")
	public String contentView(Model model) {
		model.addAttribute("id" , "onemoon");
		return "content/contentView";
	}
	
	@RequestMapping("/ModelAndView")
	public ModelAndView mv() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id" , "onemoon2");
		mv.setViewName("/ModelAndView");
		return mv;
	}

}
