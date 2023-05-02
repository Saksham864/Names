<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.SchoolPractice.TO.UserTO, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp"
	crossorigin="anonymous">
</head>
<body>

<%   HttpSession session2 = request.getSession(false); 
	UserTO user1 = (UserTO) session2.getAttribute("user");
	int role1 = user1.getRole();
%>

   <%if(role1==1) 
  { %>
  
  <% List<UserTO> users = (List<UserTO>) request.getAttribute("users");
%>

<%@ include file="teacherHeader.jsp" %>


<div class="d-flex flex-column flex-shrink-0 p-3 text-white bg-dark" style="width: 280px,float:left;">
    <a href="/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none">
      <svg class="bi me-2" width="40" height="32"><use xlink:href="#bootstrap"/></svg>
      <span class="fs-4">Sidebar</span>
    </a>
    <hr>
    <ul class="nav nav-pills flex-column mb-auto">
      <li class="nav-item">
        <a href="#" class="nav-link active" aria-current="page">
          <svg class="bi me-2" width="16" height="16"><use xlink:href="#home"/></svg>
          Home
        </a>
      </li>
      <li>
        <a class="nav-link text-white" href="master?action=list">
          <svg class="bi me-2" width="16" height="16"><use xlink:href="#speedometer2"/></svg>
          List Students
        </a>
      </li>
      <li>
        <a class="nav-link text-white" href="master?action=findTeacher&username=<%= user1.getUsername()%>">
          <svg class="bi me-2" width="16" height="16"><use xlink:href="#speedometer2"/></svg>
          View and Update Teacher Profile
        </a>
      </li>
      
      <!--  li>
        <a href="#" class="nav-link text-white">
          <svg class="bi me-2" width="16" height="16"><use xlink:href="#table"/></svg>
          Add Students
        </a>
      </li>
      <li>
        <a href="#" class="nav-link text-white">
          <svg class="bi me-2" width="16" height="16"><use xlink:href="#grid"/></svg>
          Delete Students
        </a>
      </li>
      <li>
        <a href="#" class="nav-link text-white">
          <svg class="bi me-2" width="16" height="16"><use xlink:href="#people-circle"/></svg>
          Update Students
        </a>
      </li-->
    </ul>
    <hr>
    
  </div>
  <% }else if(role1==0)
  { %>
	  <%@ include file="userHeader.jsp" %>


<div class="d-flex flex-column flex-shrink-0 p-3 text-white bg-dark" style="width: 280px,float:left;">
    <a href="/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none">
      <svg class="bi me-2" width="40" height="32"><use xlink:href="#bootstrap"/></svg>
      <span class="fs-4">Sidebar</span>
    </a>
    <hr>
    <ul class="nav nav-pills flex-column mb-auto">
      <li class="nav-item">
        <a href="#" class="nav-link active" aria-current="page">
          <svg class="bi me-2" width="16" height="16"><use xlink:href="#home"/></svg>
          Home
        </a>
      </li>
      <li>
        <a class="nav-link text-white" href="master?action=findStudent&username=<%= user1.getUsername()%>">
          <svg class="bi me-2" width="16" height="16"><use xlink:href="#speedometer2"/></svg>
          View and Update Student Profile
        </a>
      </li>
      <!--  li>
        <a href="#" class="nav-link text-white">
          <svg class="bi me-2" width="16" height="16"><use xlink:href="#table"/></svg>
          Add Students
        </a>
      </li>
      <li>
        <a href="#" class="nav-link text-white">
          <svg class="bi me-2" width="16" height="16"><use xlink:href="#grid"/></svg>
          Delete Students
        </a>
      </li>
      <li>
        <a href="#" class="nav-link text-white">
          <svg class="bi me-2" width="16" height="16"><use xlink:href="#people-circle"/></svg>
          Update Students
        </a>
      </li-->
    </ul>
    <hr>
    
  </div>
  <% }else if(role1==2)
  {%>
  <%@ include file="adminHeader.jsp" %>


<div class="d-flex flex-column flex-shrink-0 p-3 text-white bg-dark" style="width: 280px,float:left;">
<a href="/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none">
  <svg class="bi me-2" width="40" height="32"><use xlink:href="#bootstrap"/></svg>
  <span class="fs-4">Sidebar</span>
</a>
<hr>
<ul class="nav nav-pills flex-column mb-auto">
  <li class="nav-item">
    <a href="#" class="nav-link active" aria-current="page">
      <svg class="bi me-2" width="16" height="16"><use xlink:href="#home"/></svg>
      Home
    </a>
  </li>
  <li>
    <a class="nav-link text-white" href="master?action=findUser&username=<%= user1.getUsername()%>">
      <svg class="bi me-2" width="16" height="16"><use xlink:href="#speedometer2"/></svg>
      List, Delete And Update Users
    </a>
  </li>
  
  
</ul>
<hr>

</div>
<% }%>

  
</body>
</html>
