<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Update your profile here</h2>
<form action="master?action=update" method="post">
    <label>Your Old Username</label>
	<input type="text" name="Oldname"><br><br>
	<label>Your Updated Username</label>
	<input type="text" name="Upname"><br><br>
	<label>Your Updated UserId</label>
	<input type="text" name="UpId"><br><br>

	<br><button>Update</button>
	
</form>
</body>
</html>