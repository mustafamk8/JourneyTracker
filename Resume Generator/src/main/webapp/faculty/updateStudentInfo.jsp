<%@page import="com.resume.bean.StudentPersonel"%>
<%@include file="../faculty/components/facultyLogout.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Details</title>
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
	Faculty f = (Faculty) session.getAttribute("current-user");
	StudentPersonel s = (StudentPersonel)request.getAttribute("student");
	%>
	<nav class="navbar navbar-expand-lg navbar-light bg-light"
		style="display: flex; justify-content: space-between;">
		<button type="button" class="navbar-brand"
			style="border: none; cursor: pointer; text-decoration: none;"
			onclick="goBack()">
			<i class="fas fa-arrow-left mx-2"></i>Go Back
		</button>
		<div class="profile">
			<div class="profile-name"><%=f.getName() %></div>
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
	<form method="post" action="UpdateStudentByFaculty"> 
		<h1 class="text-center">Student Details</h1>
		<%@include file="../faculty/components/message.jsp"%>
		<div class="form-group my-2">
			<label for="name">Full Name</label> <input type="text"  name="st_name"
				value="<%=s.getStName() %>"
				class="form-control" id="name" placeholder="Enter your full name">
		</div>
		<div class="form-group my-2">
			<div class="row"
				style="display: flex; flex-wrap: wrap; flex-direction: row;">
				<div class="col">
					<label for="enroll">Enrollment No.</label> <input type="text"
						readonly class="form-control" id="enroll" name="st_enroll" value="<%=s.getStEnroll() %>"
						value="Enter enrollment no.">
				</div>
				<div class="col">
					<label for="scholar">Scholar No.</label> <input type="text" name="st_scholar" value="<%=s.getScholarNo() %>"
						readonly class="form-control" id="scholar" value="BE20001">
				</div>
			</div>
		</div>
		<div class="form-group my-2">
			<div class="row">
				<div class="col">
					<label for="dept">Department</label> <input type="text"
						class="form-control" id="dept" name="st_dept" value="<%=s.getStDept() %>"
						placeholder="Mention your department">
				</div>
				<div class="col">
					<label for="sem">Semester</label> <input type="number"
						name="st_sem" value="<%=s.getStSem() %>" class="form-control" id="sem" placeholder="Mention semester">
				</div>
			</div>
		</div>
		<div class="form-group my-2">
			<div class="row">
				<div class="col">
					<label for="section">Section</label> <input type="number"
						name="st_sec" value="<%=s.getStSection()%>" class="form-control" id="section" placeholder="Mention section">
				</div>
				<div class="col">
					<label for="clg_mail">College Email address</label>
					<div class="input-group">
						<div class="input-group-prepend">
							<div class="input-group-text">@</div>
						</div>
						<input type="email" class="form-control" readonly id="clg_mail"
							name="st_clgmail" value="<%=s.getStCollegeMail()%>" aria-describedby="emailHelp" value="Enter college email">
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
						<input type="email" class="form-control" id="mail" name="st_personalmail"	value="<%=s.getStPersonelMail()%>"
							aria-describedby="emailHelp" placeholder="Enter personal email">
					</div>
				</div>
				<div class="col">
					<label for="phone">Phone No.</label> <input type="text"
						name="st_phone" value="<%=s.getStPhone() %>" class="form-control" id="phone" placeholder="Phone no.">
				</div>
			</div>
		</div>
		<div class="form-group my-2">
			<label for="add">Address</label> <input type="text"
				name="st_address"
				value="<%=s.getStAddress() %>" class="form-control" id="add" placeholder="Address">
		</div>
		<div class="form-group my-2">
			<div class="row">
				<div class="col">
					<label for="caste">Date Of Birth</label> <input type="month"
						value="<%=s.getStDob()%>" name="st_dob" class="form-control" id="caste" placeholder="Mention your DOB">
				</div>
				<div class="col">
					<label for="linkedin">Linkedin Id (URL)</label> <input type="url"
						value="<%=s.getStLinkedin()%>" name="st_linkedin" class="form-control" id="linkedin" placeholder="Linkedin URL">
				</div>
				<div class="col">
					<label for="github">Github Id (URL)</label> <input type="url"
						value="<%=s.getStGithub()%>" name="st_github" class="form-control" id="github" placeholder="Github URL">
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
		<div class="form-group my-2">
			<label for="BoardName">10th School Board Name</label> <input
				type="text" name="st_10th_board"
				value="<%=s.getTenthBoardName()%>" class="form-control" id="BoardName"
				placeholder="Enter your School Board name">
		</div>
		<div class="form-group my-2">
			<label for="BoardName">12th School Board Name</label> <input
				type="text" name="st_12th_board"
				value="<%=s.getTwelfthBoardName()%>" class="form-control" id="BoardName"
				placeholder="Enter your School Board name">
		</div>
		<div class="form-group my-2">
			<div class="row">
				<div class="col">
					<label for="TenthSchool">10th Grade School Name</label> <input
						type="text" name="st_tenth_school"
						value="<%=s.getTenthSchoolName()%>" class="form-control" id="TenthSchool"
						placeholder="Enter 10th Grade School Name">
				</div>
				<div class="col">
					<label for="TenthPercentage">10th Grade Percentage</label> <input
						type="text" name="st_tenth_marks" value="<%=s.getTenthMarks()%>" class="form-control" id="TenthPercentage"
						placeholder="Mention 10th Grade Percentage (example: 87)">
				</div>
			</div>
		</div>
		<div class="form-group my-2">
			<div class="row">
				<div class="col">
					<label for="TwelfthSchool">12th Grade School Name</label> <input
						type="text" name="st_12th_schhol"
						value="<%=s.getTwelfthSchoolName()%>" class="form-control" id="TwelfthSchool"
						placeholder="Enter 12th Grade School Name">
				</div>
				<div class="col">
					<label for="TwelfthPercentage">12th Grade Percentage</label> <input
						type="text" name="st_12th_marks" value="<%=s.getTwelfthMarks()%>" class="form-control" id="TwelfthPercentage"
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
				class="form-control" id="CurrentCGPA" name="st_current_cgpa" value="<%=s.getCollegeCgpa() %>"
				placeholder="Mention Current CGPA (example: 8.7)">
		</div>

		<div class="div" style="text-align: center;">
			<button type="submit" class="btn btn-primary mb-3">Save
				Changes</button>
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
