package com.javalec.spring_ex_proj;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value="/formtest" , method = RequestMethod.GET )
	public String formTest(HttpServletRequest sReq, Model model) {
		if(sReq.getParameter("id") != null) {
			model.addAttribute("id" , sReq.getParameter("id"));
			return "form/getid";
		}
		return "form/index";
	}
	
//	if you want use GET and POST at the same time
// 	using ModelAndView Class at the other
	@RequestMapping(value="/formtest" , method = RequestMethod.POST )
	public ModelAndView formTest(HttpServletRequest sReq) {
		String id = sReq.getParameter("id");
		ModelAndView mv = new ModelAndView();
		mv.addObject("id" , id);
		mv.setViewName("form/getid");
		return mv;
	}
	
	@RequestMapping(value="/membercreate" , method = RequestMethod.GET)
	public String memberCreate() {
		return "/form/memberform";
		
	}
	
	@RequestMapping(value="/memberinfo" , method = RequestMethod.POST )
	public String memberInfo(@ModelAttribute("minfo") Member member) {
		return "commandData2";
	}
	
	@RequestMapping(value="/redtest" , method =RequestMethod.GET)
	public String redTest(HttpServletRequest sReq , Model model) {
		String id = sReq.getParameter("id");
		if(id.equals("rd"))
			return "redirect:redtarget?id=rd+Success";
		else
			return "redirect:http://naver.com";

	}
	
	@RequestMapping(value="/redtarget" , method= RequestMethod.GET)
	public String redTarget(HttpServletRequest sReq,Model model) {
		String id = sReq.getParameter("id");
		model.addAttribute("info" , id);
		return "testView";
	}

}
