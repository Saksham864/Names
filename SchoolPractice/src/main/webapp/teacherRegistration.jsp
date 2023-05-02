<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<H1>JKG International School</H1>
<h2>Register as Teacher</h2>
<form action="user?action=registerTeacher" method="post">
	<label>Username</label>
	<input type="text" name="username"><br><br>
	<label>Password</label>
	<input type="password" name="password"><br><tbr>
	<label>Teacher Id</label>
	<input type="text" name="tId"><br><br>

	<br><button>Register</button>
	
</form>
</body>
</html>