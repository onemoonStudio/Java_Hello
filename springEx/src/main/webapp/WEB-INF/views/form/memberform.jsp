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
		String context = request.getContextPath();
	%>
	
	<form action="<%= context%>/memberinfo" method="POST">
		name : <input name="name" type="text"> <br>
		id : <input name="id" type="text"> <br>
		pw : <input name="pw" type="text"> <br>
		<input value="submit" type="submit">
	</form>

</body>
</html>