\<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="com.SchoolPractice.TO.UserTO, java.util.List"%>
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
List<UserTO> users= (List<UserTO>) request.getAttribute("results");
%>
<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Username</th>
				<th scope="col">Status</th>
				<th scope="col">Role</th>
			 <th scope="col">Delete</th>
				<th scope="col">Update</th>
				<th scope="col">Block</th>
				<th scope="col">Unblock</th>
				
			</tr>
		</thead>
		<tbody>
			<%
  for(int i = 0; i < users.size(); i++) {
  %>
			<tr>
				<th scope="row"><%= i+1 %></th>
				<td><%= users.get(i).getUsername() %></td>
				<td><%= users.get(i).getStatus() %></td>
				<td><%= users.get(i).getRole() %></td>
				<td><a href="master?action=delete&username=<%= users.get(i).getUsername()%>">delete</a></td>
				<td><a href="update.jsp">update</a></td>
				<td><a href="master?action=block&username=<%= users.get(i).getUsername()%>">Block</a></td>
				<td><a href="master?action=unblock&username=<%= users.get(i).getUsername()%>">UnBlock</a></td>
				
				
			</tr>
			<%} %>

		</tbody>
	</table>

</body>
</html>