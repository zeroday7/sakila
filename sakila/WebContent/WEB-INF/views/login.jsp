<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$('#loginBtn').click(function(){
			$('#loginForm').submit();
		});
	});
</script>
</head>
<body>
	<div>
		오늘 접속자 수 : ${map["returnStats"].count} / 전체 접속자 수 : ${map["totalCount"]}
	</div>
	<form id="loginForm" method="post" action="${pageContext.request.contextPath}/">
		<div>
			<input id="email" name="email" type="text" placeholder="email" value="Mike.Hillyer@sakilastaff.com">
		</div>
		<div>
			<input id="password" name="password" type="password" placeholder="PW" value="1234">
		</div>
		<div>
			<button id="loginBtn" type="button">Log-in</button>
		</div>
	</form>
</body>
</html>