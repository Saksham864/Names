<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.SchoolPractice.TO.UserTO, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>

    
      <%UserTO user=(UserTO)request.getAttribute("userdetails");
      HttpSession session1 = request.getSession();
      session1.setAttribute("user",user);
      
      %>
      <% System.out.println(user.getRole());%>
<% 
if(user.getRole()==0)
	{ %>
<%@ include file = "userHeader.jsp" %>
 
 <% }else if(user.getRole()==1)
    {%>
    	<%@ include file = "teacherHeader.jsp" %>
    <%} else if(user.getRole()==2)
{%>
	<%@ include file = "adminHeader.jsp" %>
<%} 
    %>
    
Welcome <%= request.getAttribute("username") %>!
</body>
</html>