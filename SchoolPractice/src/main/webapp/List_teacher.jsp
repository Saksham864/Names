<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="com.SchoolPractice.TO.TeacherTO, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<%
List<TeacherTO> teachers = (List<TeacherTO>) request.getAttribute("results");
%>
<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Username</th>
				<th scope="col">TeachertId</th>
				<th scope="col">Role</th>
				<th scope="col">Update</th>
			
			</tr>
		</thead>
		<tbody>
			<%
  for(int i = 0; i < teachers.size(); i++) {
  %>
			<tr>
				<th scope="row"><%= i+1 %></th>
				<td><%= teachers.get(i).getUsername() %></td>
				<td><%= teachers.get(i).getTeacherId() %></td>
				<td><%= teachers.get(i).getRole() %></td>
				<td><a href="updateTeacher.jsp">update</a></td>
			
				
				
			</tr>
			<%} %>

		</tbody>
	</table>

</body>
</html>