<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="com.SchoolPractice.TO.StudentTO, java.util.List"%>
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
List<StudentTO> students = (List<StudentTO>) request.getAttribute("results");
%>
<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Username</th>
				<th scope="col">StudentId</th>
				<th scope="col">Role</th>
				<th scope="col">Update</th>
			</tr>
		</thead>
		<tbody>
			<%
  for(int i = 0; i < students.size(); i++) {
  %>
			<tr>
				<th scope="row"><%= i+1 %></th>
				<td><%= students.get(i).getUsername() %></td>
				<td><%= students.get(i).getUserId() %></td>
				<td><%= students.get(i).getRole() %></td>
				<td><a href="update.jsp">update</a></td>
				
				
			</tr>
			<%} %>

		</tbody>
	</table>

</body>
</html>