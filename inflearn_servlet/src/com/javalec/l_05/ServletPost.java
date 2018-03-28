package com.javalec.l_05;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPost
 */
@WebServlet("/ServletPost")
public class ServletPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPost() {
        super();
        // TODO Auto-generated constructor stub
    }    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("get으로 접근 되었습니다.");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("Post Method로 접근 되었습니다.");
		
		request.setCharacterEncoding("EUC-KR");
		
		String name = request.getParameter("realname");
		String pw = request.getParameter("pwd");
		
		String[] hobbys = request.getParameterValues("hobby");
		String proto = request.getParameter("protocol");
		
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></haed><body>");
		writer.println("<h1>Post to Servlet</h1>");
		writer.println("your name is " + name + "<br/>");
		writer.println("your password is " + pw+ "<br/>");
//		writer.println("your hobby " + hobbys);
		writer.println("your hobby " + Arrays.toString(hobbys) + "<br/>");
		writer.println("you choose a protocol "+proto);
		writer.println("</body></html>");
		
		writer.close();
	}

}
