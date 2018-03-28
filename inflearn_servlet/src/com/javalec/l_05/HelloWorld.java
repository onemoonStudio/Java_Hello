package com.javalec.l_05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

    @PostConstruct
    private void initPost() {
		// TODO Auto-generated method stub
    	System.out.println("init post Method");

	}
    
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	System.out.println("init method");
    	super.init();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("get access");
		
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></haed>");
		writer.println("<body>");
		writer.println("<h1>Hello Servlet</h1>");
		writer.println("</body>");
		writer.println("</html>");
		
		writer.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy method");
		super.destroy();
	}
	
	@PreDestroy
	private void destroyPre() {
		// TODO Auto-generated method stub
		System.out.println("Pre Destroy");
	}


}
