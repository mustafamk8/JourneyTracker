<%@include file="components/logout.jsp" %>
<%@page import="com.resume.bean.Project"%>
<%@page import="com.resume.model.StudentModel"%>
<%@page import="com.resume.bean.StudentPersonel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Project Details</title>
<!-- Add Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
<style>
body {
	background-color: #e2e0e3;
}

form {
	margin-top: 20px;
	margin-bottom: 20px;
	margin-left: 250px;
	margin-right: 250px;
	padding: 40px;
	background: white;
	border-radius: 0.5rem;
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

label {
	font-weight: 500;
}

@media ( max-width : 750px) {
	form {
		margin: 0px;
	}
}
</style>

</head>
<body>
	<%
	StudentPersonel s = (StudentPersonel) session.getAttribute("current-user");
	StudentModel model = new StudentModel();
	Project p = (Project)request.getAttribute("project");
	%>
	<nav class="navbar navbar-expand-lg navbar-light bg-light"
		style="display: flex; justify-content: space-between;">
		<div class="navbar-brand">
			<button type="button"
				style="border: none; cursor: pointer; text-decoration: none;"
				onclick="goBack()">
				<i class="fas fa-arrow-left mx-2"></i>Go Back
			</button>
			<a href="student_dashboard.jsp" type="button"
				style="border: none; cursor: pointer; text-decoration: none; color: black; background: #F0F0F0; padding: 1px 6px">
				<i class="fas fa-home mx-2"></i>Home
			</a>
		</div>
		<div class="profile">
			<div class="profile-name"><%=s.getStName() %></div>
			<div class="profile-dropdown">
				<button type="button" class="dropdown-toggle">
					<i class="uil uil-user"></i>
				</button>
				<ul class="dropdown-menu">
					<li><a href="updatePassword.jsp">Update Password</a></li>
					<li><a href="StudentLogout">Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<form method="post" action="UpdateProject">
		<h1 class="text-center">Project Details</h1>
		<%@include file="components/message.jsp"%>
		
		<div class="form-group my-3">
			<input type="hidden" name="pid" value="<%=p.getProjectId()%>"
				class="form-control" id="scholar" placeholder="Enter scholar no.">
		</div>
		<div class="form-group my-3">
			<input type="hidden" name="scholar" value="<%=p.getsId()%>"
				class="form-control" id="scholar" placeholder="Enter scholar no.">
		</div>
		<div class="boxes">
			<div class="box">
				<div class="form-row">
					<div class="col">
						<div class="form-group my-3">
							<label for="ProjectName">Project Name</label> <input name="name"
								value="<%=p.getProjectName()%>" type="text" class="form-control"
								id="ProjectName" placeholder="Mention Project Name">
						</div>
					</div>
					<div class="col">
						<div class="form-group my-3">
							<label for="ProjectDisc">Project Description in Short</label>
							<input name="desc" value="<%=p.getProjectDesc()%>" rows="3"
								type="text" class="form-control" id="ProjectDisc"
								placeholder="Enter Project Description">
						</div>
					</div>
				</div>
				<div class="form-row">
					<div class="form-group my-3">
						<label for="ProjectRole">Your Role in Project</label> <input
							name="role" value="<%=p.getProjectRole()%>" type="text"
							class="form-control" id="ProjectRole"
							placeholder="Mention Your Role in Project">
					</div>
					<div class="form-group my-3">
						<label for="ProjectDuration">Project Duration (in Months)</label>
						<input name="duration" value="<%=p.getProjectDuration()%>" type="number"
							class="form-control" id="ProjectDuration"
							placeholder="Mention Duration of the Project (in Months)">
					</div>
				</div>
				<div class="form-group my-3">
					<label for="ProjectLink">Project URL (if Available)</label> <input
						name="url" value="<%=p.getProjectLink()%>" type="url"
						class="form-control" id="ProjectLink"
						placeholder="Enter Project URL">
				</div>
			</div>
		</div>
		<div class="div" style="text-align: center;">
			<button type="submit" class="btn btn-primary mb-3">Submit</button>
		</div>
	</form>

	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap/dist/js/bootstrap.min.js"></script>
	<script>
		function goBack() {
			window.history.back();
		}
	</script>
</body>
</html>
