<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String firstName = (String)request.getAttribute("firstName");
	String lastName = (String)request.getAttribute("lastName");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>복습 | 결과 창</title>
</head>
<body>
	<h1>결과 창에 오신것을 축하드립니다.</h1>
	<p>이름 : <%= firstName %></p>
	<p>성 : <%= lastName %></p>
</body>
</html>