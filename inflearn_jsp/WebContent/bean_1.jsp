<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="student" class="com.javalec.beanEx.Student" scope="page" ></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<jsp:setProperty name="student" property="name" value="java"/>
	<jsp:setProperty name="student" property="age" value="13"/>
	<jsp:setProperty name="student" property="score" value="100"/>
	
	나이: <jsp:getProperty name="student" property="name"/>
	이름: <jsp:getProperty name="student" property="age"/>
	점수: <jsp:getProperty name="student" property="score"/>
	 
</body>
</html>