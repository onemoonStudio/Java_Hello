package com.javalec.spring_ex_proj;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class SampleReq {

	@RequestMapping("/view")
	public String view() {
		return "testView";
	}
	// test/view 로 들어가야 한다.
	
	@RequestMapping("/get")
	public String testGet(HttpServletRequest req,Model model) {
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		model.addAttribute("id",id);
		model.addAttribute("password",pw);
		return "testGet";
	}
	// http://localhost:3000/spring_ex_proj/test/get?id=hello&pw=world
	
	@RequestMapping("/get2")
	public String testGet2(@RequestParam("id") String id,@RequestParam("pw") String pw,Model model) {
		model.addAttribute("id",id);
		model.addAttribute("password",pw);
		return "testGet";
	}
	// 위와 동일하지만 차이가 있다. 아래에서는 id와 pw가 둘다 들어와야 에러가 발생하지 않는다.
	
	@RequestMapping("/commandClass")
	public String command(Member member) {
		return "commandData";
	}
//	이러한 방식도 가능하다 하지만 위의 방식이 훨씬 깔끔하다. 
//	public String command2(@RequestParam("id") String id,@RequestParam("pw") String pw,Model model) {
//		Member member = new Member();
//		member.setId(id);
//		member.setPw(pw);
//		
//		model.addAttribute(member);
//		return "commandData";
//	}

}
