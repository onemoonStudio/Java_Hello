package com.javalec.spring_mvc_board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public class BContentCommand implements Bcommand{
	// view board content

	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		String bId = request.getParameter("bId");
		
		
		
	}

}
