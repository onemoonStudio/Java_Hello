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
		Cookie cookie = new Cookie("setCookie" , "Cookieissetted");
		Cookie cookie2 = new Cookie("setCookie2" , "Cookieissetted2");
		cookie.setMaxAge(60*60);
		response.addCookie(cookie);
		response.addCookie(cookie2);
	%>
	
	<a href="getCookie.jsp">Cookie 값 확인하기! </a>
</body>
</html>