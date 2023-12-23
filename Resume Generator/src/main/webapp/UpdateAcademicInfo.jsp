<%@include file="components/logout.jsp"%>
<%@page import="com.resume.model.StudentModel"%>
<%@page import="com.resume.bean.StudentPersonel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Academic Information</title>
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
	StudentPersonel s1 = (StudentPersonel) session.getAttribute("current-user");
	StudentModel model = new StudentModel();
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
			<div class="profile-name"><%=s1.getStName()%></div>
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
	<form method="post" action="UpdateAcademicDetails">
		<h1 class="text-center">Academic Details</h1>
		<%@include file="components/message.jsp"%>
		<div class="form-group my-2">
			<input type="hidden" name="st_scholarno"
				value="<%=s1.getScholarNo()%>" class="form-control" id="scholar"
				placeholder="Enter scholar no.">
		</div>
		<div class="form-group my-2">
			<label for="BoardName">10th School Board Name</label> <input
				type="text" name="st_10th_board"
				value="<%=s1.getTenthBoardName()%>" class="form-control"
				id="BoardName" placeholder="Enter your School Board name">
		</div>
		<div class="form-group my-2">
			<label for="BoardName">12th School Board Name</label> <input
				type="text" class="form-control" name="st_12th_board"
				value="<%=s1.getTwelfthBoardName()%>" id="BoardName"
				placeholder="Enter your School Board name">
		</div>
		<div class="form-group my-2">
			<div class="row">
				<div class="col">
					<label for="TenthSchool">10th Grade School Name</label> <input
						type="text" name="st_tenth_school"
						value="<%=s1.getTenthSchoolName()%>" class="form-control"
						id="TenthSchool" placeholder="Enter 10th Grade School Name">
				</div>
				<div class="col">
					<label for="TenthPercentage">10th Grade Percentage</label> <input
						type="text" name="st_tenth_marks" value="<%=s1.getTenthMarks()%>"
						class="form-control" id="TenthPercentage"
						placeholder="Mention 10th Grade Percentage (example: 87)">
				</div>
			</div>
		</div>
		<div class="form-group my-2">
			<div class="row">
				<div class="col">
					<label for="TwelfthSchool">12th Grade School Name</label> <input
						type="text" name="st_12th_schhol"
						value="<%=s1.getTwelfthSchoolName()%>" class="form-control"
						id="TwelfthSchool" placeholder="Enter 12th Grade School Name">
				</div>
				<div class="col">
					<label for="TwelfthPercentage">12th Grade Percentage</label> <input
						type="text" name="st_12th_marks" value="<%=s1.getTwelfthMarks()%>"
						class="form-control" id="TwelfthPercentage"
						placeholder="Mention 12th Grade Percentage (example: 87)">
				</div>
			</div>
		</div>
		<fieldset class="form-group my-2">
			<div class="row">
				<legend class="col-form-label col-sm-2 pt-0">Any Active
					Backlogs</legend>
				<div class="col-sm-10">
					<div class="form-check">
						<input class="form-check-input" type="radio" name="st_backlog"
							id="gridRadios1" value="Yes"> <label
							class="form-check-label" for="gridRadios1"> Yes </label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="st_backlog"
							id="gridRadios2" value="No"> <label
							class="form-check-label" for="gridRadios2"> No </label>
					</div>
				</div>
			</div>
		</fieldset>
		<div class="form-group my-2">
			<label for="CurrentCGPA">Current CGPA</label> <input type="text"
				name="st_current_cgpa" value="<%=s1.getCollegeCgpa()%>"
				class="form-control" id="CurrentCGPA"
				placeholder="Mention Current CGPA (example: 8.7)">
		</div>

		<div class="div" style="text-align: center;">
			<button type="submit" class="btn btn-primary mb-3">Submit</button>
		</div>
	</form>


	<!-- Add Bootstrap JS and jQuery -->
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
