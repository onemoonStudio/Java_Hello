package com.javalec.spring_ex_proj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class SampleReq {

	@RequestMapping("/view")
	public String view() {
		return "testView";
	}
	// test/view 로 들어가야 한다.

}
