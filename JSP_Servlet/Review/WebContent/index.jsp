<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>복습</title>
</head>
<body>
	<h1>페이지 목록</h1>
	<form name="reviewform" action="/studyweb/review.do" method="post">
		<label for="fname">First name:</label><br>
		<input type="text" id="fname" name="fname"><br>
		<label for="lname">Last name:</label><br>
		<input type="text" id="lname" name="lname">
		<input type="submit" value="제출"/>
	</form>
</body>
</html>