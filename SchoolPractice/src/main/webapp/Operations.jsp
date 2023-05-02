<%@ page language="java" 
    pageEncoding="UTF-8"%>
 <%@ page import="com.SchoolPractice.TO.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%   HttpSession session1 = request.getSession(false); 
	UserTO user = (UserTO) session1.getAttribute("user");

%>
<%@ include file = "master_page.jsp" %>
</body>
</html>