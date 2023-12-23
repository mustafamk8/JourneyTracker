<%@include file="components/logout.jsp" %>
<%@page import="com.resume.bean.Internship"%>
<%@page import="com.resume.model.StudentModel"%>
<%@page import="com.resume.bean.StudentPersonel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Internship Information</title>
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
	Internship i = (Internship)request.getAttribute("inter");
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
	<form method="post" action="UpdateInternship">
		<h1 class="text-center">Training Information</h1>
		<%@include file="components/message.jsp"%>
		<div class="form-group my-3">
			<input type="hidden" class="form-control" id="ScholarNo"
				placeholder="Enter Scholar No.">
		</div>
		<div class="boxes">
			<div class="box">
				<div class="row">
				<div class="form-group col-md-6 my-3">
						<input type="hidden" name="id" value="<%=i.gettId() %>" class="form-control"
							id="TrainingName" placeholder="Enter Training Name">
					</div>
					<div class="form-group col-md-6 my-3">
						<input type="hidden" name="scholar" value="<%=s.getScholarNo() %>" class="form-control"
							id="TrainingName" placeholder="Enter Training Name">
					</div>
					<div class="form-group col-md-6 my-3">
						<label for="TrainingName">Training Name</label> <input type="text"
							name="training" value="<%=i.getTrName() %>" class="form-control" id="TrainingName"
							placeholder="Enter Training Name">
					</div>
					<div class="form-group col-md-6 my-3">
						<label for="TrOrgName">Training Organisation Name</label> <input
							type="text" name="org" value="<%=i.getOrgName() %>" class="form-control"
							id="TrOrgName" placeholder="Enter Training Organisation Name">
					</div>
					<div class="form-group col-md-6 my-3">
						<label for="TrOrgName">Training Description in short</label> <input
							type="text" name="desc" value="<%=i.getTrDesc() %>" class="form-control"
							id="TrOrgName" placeholder="Enter Training Organisation Name">
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md-6 my-3">
						<label for="StartDate">Start Date</label> <input type="month"
							name="start" value="<%=i.getTrStartDate() %>" class="form-control" id="StartDate">
					</div>
					<div class="form-group col-md-6 my-3">
						<label for="CompletionDate">Date of Completion</label> <input
							type="month" name="end" value="<%=i.getTrEndDate() %>" class="form-control"
							id="CompletionDate">
					</div>
				</div>
				<div class="form-group my-3">
					<label for="Upload">Upload Training Certificate</label> <input
						type="url" name="certi" value="<%=i.getTrCerti() %>" class="form-control" id="Upload">
				</div>
				<br /> <br />
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
