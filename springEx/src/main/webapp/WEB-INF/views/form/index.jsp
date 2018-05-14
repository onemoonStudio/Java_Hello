<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="formtest" method=GET >
<!-- 
remind that out site localhost is not localhost:3000
it's localhost:3000/spring_ex_proj
so don't using '/formtest' for use it gracefully 
 -->
	text your id <input type="text" name="id"> <br/>
	<input type="submit" value="전송" >
</form>

</body>
</html>