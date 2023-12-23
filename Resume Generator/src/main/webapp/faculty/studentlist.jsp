<%@page import="com.resume.bean.Skill"%>
<%@page import="com.resume.bean.Faculty"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.resume.bean.StudentPersonel"%>
<%@page import="java.util.List"%>
<%@page import="com.resume.model.AdminModel"%>
<%@include file="../faculty/components/facultyLogout.jsp"%>
<%@page import="com.resume.bean.Admin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<title>All Students</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
<style>
h2 {
	font-size: 40px;
	font-family: 'Libre Baskerville', serif;
	font-weight: bold;
	color: rgb(61, 5, 61);
}

table {
	box-shadow: 5px 8px #c499fd70;
	overflow: scroll;
}

th {
	font-size: 20px;
	font-family: 'Libre Baskerville', serif;
	font-weight: bold;
	background-color: #b6a8c4;
}

tr:nth-child(even) {
	background-color: #ebe3f3;
}

tr:nth-child(odd) {
	background-color: white;
}

.edit {
	background-color: #ad8fc9;
	color: black;
	text-decoration: none;
}

.edit:hover {
	background-color: #8d61b1;
	color: black;
	text-decoration: none;
}

.delete {
	background-color: rgb(245, 147, 147);
	color: black;
	text-decoration: none;
}

.delete:hover {
	background-color: rgb(238, 110, 110);
	color: black;
	text-decoration: none;
}

.profile {
	display: flex;
	align-items: center;
	margin-right: 10px;
}

.profile-name {
	margin-right: 10px;
}

.profile-dropdown .dropdown-menu {
	display: none;
	position: absolute;
	left: 85%;
	background-color: #dbc2fc;
	/* Change this to your desired background color */
	list-style: none;
	border-radius: 0.5rem;
	padding: 0;
	margin: 0;
	border: 1px solid #fff; /* Change this to your desired border color */
	z-index: 3; /* Ensure the dropdown menu is above the navbar */
}

.dropdown-toggle {
	background: none;
	border: none;
	color: black; /* Change this to your desired text color */
	cursor: pointer;
}

.dropdown-toggle:focus+.dropdown-menu, .dropdown-menu:hover {
	display: block;
	right: 30px;
}

.dropdown-menu li {
	padding: 10px;
	text-align: center;
}

.dropdown-menu li a {
	color: black; /* Change this to your desired text color */
	text-decoration: none;
}

.title form input {
	border: none;
	padding: 5px;
}

form :focus {
	outline: none;
}
</style>
</head>
<body>
	<%
	Faculty f = (Faculty) session.getAttribute("current-user");
	%>
	<nav class="navbar navbar-expand-lg navbar-light bg-light"
		style="display: flex; justify-content: space-between;">
		<button type="button" class="navbar-brand"
			style="border: none; cursor: pointer; text-decoration: none;"
			onclick="goBack()">
			<i class="fas fa-arrow-left mx-2"></i>Go Back
		</button>
		<div class="profile">
			<div class="profile-name"><%=f.getName()%></div>
			<div class="profile-dropdown">
				<button type="button" class="dropdown-toggle">
					<i class="uil uil-user"></i>
				</button>
				<ul class="dropdown-menu">
					<li><a href="#">Update Password</a></li>
					<li><a href="../FacultyLogout">Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container-fluid">
		<div class="overview">
			<div class="title">
				<h2 class="m-4">
					<i class="uil uil-graduation-cap"></i>All Students By Skill
				</h2>
				<div>
					<form class="m-4" action="../SearchStudentBySkill" method="post"
						class="search-bar-container">
						<input type="search" id="search-bar" name="skill"
							placeholder="search here..."> <label for="search-bar"
							class="fas fa-search"></label> <input type="submit"
							value="search"
							style="background-color: #bfacd0; border-radius: 0.2rem;">
					</form>
					
				</div>
				<%@include file="../faculty/components/message.jsp"%>
			</div>
		</div>
		<table class="table table-responsive-sm text-center">
			<thead class="custom">
				<tr>

					<th scope="col">S. No</th>
					<th scope="col">Scholar No</th>
					<th scope="col">Skill Name</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody class="rows">

				<%
				List<Skill> list1 = (ArrayList<Skill>)session.getAttribute("list");
				int i =0;
				for (Skill s : list1) {
					i++;
				%>

				<tr>
					<td><%=i %></td>
					<td><%=s.getsId() %></td>
					<td><%=s.getSkillName() %></td>
					<td><a href="../ViewFullDetail?sid=<%=s.getsId() %>" class="btn btn-sm edit"><i
							class="fas fa-edit"></i>View Full Detail</a> 
				</tr>
				<%
				}
				%>
			</tbody> 
		</table>
	</div>
	<script>
		function goBack() {
			window.history.back();
		}
	</script>
</body>
</html>
