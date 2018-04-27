<%@page import="java.util.Enumeration"%>
<!-- Enumeration 을 사용하기 위해서 ! -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
	String id;
	Object session_1;
	Object session_2;
%>

<%
	id = session.getId();
	session_1 = session.getAttribute("hello");
	String sessionOneVal = (String)session_1;
	out.println(sessionOneVal+"<br/>");
	
	session_2 = session.getAttribute("google");
	Integer sessionTwoVal = (Integer)session_2;
	out.println(sessionTwoVal + "<br/>");
	
	out.println("@@@@@@@@@@@@@@@@@@<br/>");
	
	String sName,sValue;
	Enumeration enumeration = session.getAttributeNames();
	/* use import package */
	while(enumeration.hasMoreElements()){
		sName = enumeration.nextElement().toString();
		sValue = session.getAttribute(sName).toString();
		out.println("Attribute name is " + sName +"<br/>");
		out.println("Value is " + sValue +"<br/>");
	}
	
	out.println("@@@@@@@@@@@@@@@@@@<br/>");
	
	String sessionId = session.getId();
	out.println( "session id is -> "+sessionId.toString() +"<br/>");
	out.println( "session expire -> "+session.getMaxInactiveInterval() +"<br/>");
	/* 기본 30분으로 되어있다. 만약에 세션 기본값을 변경하고 싶을 경우에는 apache folder 에서 conf 파일을 수정하면 된다.*/
	out.println("@@@@@@@@@@@@@@@@@@<br/>");
	
	session.removeAttribute("input session name");
	/* remove target session */
	session.invalidate();
	/* remove all session */
	
	if(request.isRequestedSessionIdValid()){
		out.println("session is valid ! ");
	}else{
		out.println("session is Invalid ! ");
	}
%>

</body>
</html>