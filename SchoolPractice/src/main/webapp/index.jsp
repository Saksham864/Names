<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<!DOCTYPE html>
<html>
<body>

      <% String s= (String)request.getAttribute("errorMessage");
          if(s!=null) {%>
         <h1><%=s %> </h1>
          <% } %>
          
          <%request.removeAttribute("errorMessage"); %>
<h2>Welcome to School Management System</h2>
<h3>If you are a registerd user then Login </h3>

<form action="user?action=login" method="post">
<input type="text" name="username">
<label>Enter your username</label><br><br>

<input type="text" name="password">
<label>Enter your password</label><br><br>


<input type="submit" name="Sumbit" value="Submit">
</form>

<a href="registration.jsp"> new user ?? register for Student</a><br>
<a href="teacherRegistration.jsp"> new user ?? register for Teacher</a>
</body>
</html>
