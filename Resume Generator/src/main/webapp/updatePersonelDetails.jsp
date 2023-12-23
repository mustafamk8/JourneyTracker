<%@include file="components/logout.jsp" %>
<%@page import="com.resume.bean.StudentPersonel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Information</title>
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
	<form action="UpdateStudentPersonel" method="post"
		enctype="multipart/form-data">
		<h1 class="text-center my-3" style="color: #47108f;">Student
			Information</h1>
			<%@include file="components/message.jsp"%>
		<div class="form-group my-2">
			<label for="name">Full Name</label> <input type="text" name="st_name"
				value="<%=s.getStName() %>" class="form-control" id="name"
				placeholder="Enter your full name">
		</div>
		<div class="form-group my-2">
			<div class="row"
				style="display: flex; flex-wrap: wrap; flex-direction: row;">
				<div class="col">
					<label for="enroll">Enrollment No.</label> <input type="text"
						name="st_enroll" value="<%=s.getStEnroll() %>" class="form-control" id="enroll"
						placeholder="Enter enrollment no.">
				</div>
				<div class="col">
					<label for="scholar">Scholar No.</label> <input type="text"
						name="st_scholar" value="<%=s.getScholarNo() %>" class="form-control" id="scholar"
						placeholder="Enter scholar no.">
				</div>
			</div>
		</div>
		
		<div class="form-group my-2">
			<div class="row">
				<div class="col">
					<label for="dept">Department</label> <input type="text"
						name="st_dept" value="<%=s.getStDept() %>" class="form-control" id="dept"
						placeholder="Mention your department">
				</div>
				<div class="col">
					<label for="sem">Semester</label> <input type="number"
						name="st_sem" value="<%=s.getStSem() %>" class="form-control" id="sem"
						placeholder="Mention semester">
				</div>
			</div>
		</div>
		<div class="form-group my-2">
			<div class="row">
				<div class="col">
					<label for="section">Section</label> <input type="number"
						name="st_sec" value="<%=s.getStSection()%>"
						class="form-control" id="section" placeholder="Mention section">
				</div>
				<div class="col">
					<label for="clg_mail">College Email address</label>
					<div class="input-group">
						<div class="input-group-prepend">
							<div class="input-group-text">@</div>
						</div>
						<input type="email" name="st_clgmail" value="<%=s.getStCollegeMail()%>" class="form-control"
							id="clg_mail" aria-describedby="emailHelp"
							placeholder="Enter college email">
					</div>
				</div>
			</div>
		</div>
		<div class="form-group my-2">
			<div class="row">
				<div class="col">
					<label for="mail">Personal Email address</label>
					<div class="input-group">
						<div class="input-group-prepend">
							<div class="input-group-text">@</div>
						</div>
						<input type="email" name="st_personalmail"	value="<%=s.getStPersonelMail()%>" class="form-control"
							id="mail" aria-describedby="emailHelp"
							placeholder="Enter personal email">
					</div>
				</div>
				<div class="col">
					<label for="phone">Phone No.</label> <input type="number"
						name="st_phone" value="<%=s.getStPhone() %>" class="form-control" id="phone"
						placeholder="Phone no.">
				</div>
			</div>
		</div>
		<div class="form-group my-2">
			<label for="add">Address</label> <input type="text" name="st_address"
				value="<%=s.getStAddress() %>" class="form-control" id="add" placeholder="Address">
		</div>
		<div class="form-group my-2">
			<div class="row">
				<div class="col">
					<label for="caste">Date Of Birth</label> <input type="date"
						value="<%=s.getStDob()%>" name="st_dob"
						class="form-control" id="caste" placeholder="Mention your caste">
				</div>
				<div class="col">
					<label for="linkedin">Linkedin Id (URL)</label> <input type="url"
						value="<%=s.getStLinkedin()%>" name="st_linkedin"
						class="form-control" id="linkedin" placeholder="Linkedin URL">
				</div>
				<div class="col">
					<label for="github">Github Id (URL)</label> <input type="url"
						value="<%=s.getStGithub()%>" name="st_github"
						class="form-control" id="github" placeholder="Github URL">
				</div>
			</div>
		</div>
		<fieldset class="form-group my-2">
			<div class="row">
				<legend class="col-form-label col-sm-2 pt-0"
					style="font-weight: 500;">Gender</legend>
				<div class="col-sm-10">
					<div class="form-check">
						<input class="form-check-input" type="radio" name="st_gender"
							id="gridRadios1" value="Female"> <label
							class="form-check-label" for="gridRadios1"> Female </label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="st_gender"
							id="gridRadios2" value="Male"> <label
							class="form-check-label" for="gridRadios2"> Male </label>
					</div>
				</div>
			</div>
		</fieldset>
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
