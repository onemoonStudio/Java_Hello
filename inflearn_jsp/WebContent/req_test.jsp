<%@ page import="java.util.Enumeration" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
out.println(request.getProtocol() + "<br/>");
out.println(request.getContextPath() + "<br/>");
out.println(request.getRequestURL() + "<br/>");
out.println(request.getRequestURI() + "<br/>");
out.println(request.getServerName() +" : "+request.getServerPort()+ "<br/>");
%>
<br/>

<%
/* getParameterNames 는 그냥 사용하면 안된다. */
Enumeration<String> str = request.getParameterNames();
out.println("check parameters");
while(str.hasMoreElements()){
	String name = str.nextElement();
	out.print(name + "  ");
}
out.println("<br/>");

out.println(" Parameter Names : "+ str + "<br/>");
out.println("name : "+request.getParameter("name") + "<br/>");
out.println("pw : "+request.getParameter("pw") + "<br/>");
out.println("hobbys : "+request.getParameter("hobby") + "<br/>");

/* Thread.sleep(1000); 도 가능하다 원하는방향은 내용을 보여준 다음
1초후 이동하는 것이였으나 그렇게는 안됐다. 다시 확인할것   */
/* 
여기는 redirect 구현 
*/
response.sendRedirect("/inflearn_jsp/res_test.jsp");
%>

</body>
</html>