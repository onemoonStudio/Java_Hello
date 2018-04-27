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
		Cookie[] cookies = request.getCookies();
		for(int i=0;i<cookies.length ; i++){
			if(cookies[i].getName().equals("setCookie2")){
				cookies[i].setMaxAge(0);
				response.addCookie(cookies[i]);
			}
		}
	%>
	<a href="getCookie.jsp">쿠키값 확인하기 </a>
</body>
</html>