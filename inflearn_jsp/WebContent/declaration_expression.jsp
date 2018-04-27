<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- Declaration Part --%>
<%!

	int i = 15;
	String HW = "Hello World";
%>
<%-- Scriptlet Part --%>
<%
	out.println(i + "<br/>");

	out.println(HW+ "<br/>");
%>

<%-- Expression Part --%>
<%= i %>
<br/>
<%= HW %>


</body>
</html>