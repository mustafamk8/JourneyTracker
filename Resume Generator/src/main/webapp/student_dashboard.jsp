<%@include file="components/logout.jsp"%>
<%@page import="com.resume.bean.Curricular"%>
<%@page import="com.resume.bean.Achievement"%>
<%@page import="com.resume.bean.Skill"%>
<%@page import="com.resume.bean.Internship"%>
<%@page import="com.resume.bean.Certificates"%>
<%@page import="com.resume.bean.Project"%>
<%@page import="com.resume.bean.Career"%>
<%@page import="java.util.List"%>
<%@page import="com.resume.model.StudentModel"%>
<%@page import="com.resume.bean.StudentPersonel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap/dist/css/bootstrap.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<link rel="stylesheet" href="studentcss/student_dashboard.css">
<link rel="stylesheet"
	href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
<title>Student Dashboard</title>
</head>
<body>
	<%
	StudentPersonel s = (StudentPersonel) session.getAttribute("current-user");
	%>
	<nav>
		<a href="#dashboard">
			<div class="logo-name">
				<span class="logo-icon">JT</span> <span class="logo_name">Journey
					Tracker</span>
			</div>
		</a>

		<div class="menu-items">
			<ul class="nav-links">
				<li><a href="#student-info"> <i class="uil uil-user"></i> <span
						class="link-name">Student Info</span>
				</a></li>
				<li><a href="#academic-details"> <i
						class="uil uil-graduation-cap"></i> <span class="link-name">Academic
							Details</span>
				</a></li>
				<li><a href="#projects"> <i class="uil uil-briefcase"></i>
						<span class="link-name">Projects</span>
				</a></li>
				<li><a href="#certifications"> <i class="uil uil-award"></i>
						<span class="link-name">Certifications</span>
				</a></li>
				<li><a href="#internships"> <i class="uil uil-bag"></i> <span
						class="link-name">Internships</span>
				</a></li>
				<li><a href="#skills"> <i class="uil uil-layers"></i> <span
						class="link-name">Skills</span>
				</a></li>
				<li><a href="#achievements"> <i class="uil uil-trophy"></i>
						<span class="link-name">Achievements</span>
				</a></li>
				<li><a href="#co-curricular"> <i class="bi bi-puzzle"></i>
						<span class="link-name">Co-Curricular Info</span>
				</a></li>
				<li><a href="#career-details"> <i class="uil uil-briefcase"></i>
						<span class="link-name">Career Details</span>
				</a></li>
			</ul>

			<ul class="logout-mode">
				<li><a href="StudentLogout"> <i class="uil uil-signout"></i>
						<span class="link-name">Logout</span>
				</a></li>
				</li>
			</ul>
		</div>
	</nav>

	<!-- dashboard with welcome message -->
	<section class="dashboard" id="dashboard">
		<div class="top">
			<i class="uil uil-bars sidebar-toggle"></i>

			<div class="profile">
				<div class="profile-name"><%=s.getStName()%></div>
				<div class="profile-dropdown">
					<button type="button" class="dropdown-toggle">
						<i class="uil uil-user"></i>
					</button>
					<ul class="dropdown-menu">
						<li><a href="" data-bs-toggle="modal"
							data-bs-target="#exampleModal">Add Profile Pic</a></li>
						<li><a href="resume.jsp">Generate Resume</a></li>
						<li><a href="updatePassword.jsp">Update Password</a></li>
						<li><a href="StudentLogout">Logout</a></li>
					</ul>
				</div>
			</div>
		</div>



		<!-- Modal  -->




		<div class="dash-content">
			<div class="overview">
				<div class="title">
					<i class="uil uil-tachometer-fast-alt"></i> <span class="text">Dashboard</span>


					<%-- modal start --%>
					<div class="modal fade" id="exampleModal" tabindex="-1"
						aria-labelledby="exampleModalLabel" aria-hidden="true">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<h5 class="modal-title" id="exampleModalLabel">Add Profile
										Photo</h5>
									<button type="button" class="btn-close" data-bs-dismiss="modal"
										aria-label="Close"></button>
								</div>
								<div class="modal-body">
									<label for="photo">Professional Photo</label> <input
										type="file" class="form-control" id="photo">
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-secondary"
										data-bs-dismiss="modal">Close</button>
									<button type="button" class="btn btn-primary">Save
										changes</button>
								</div>
							</div>
						</div>
						          
					</div>
					<%-- modal end --%>
				</div>
				<div class="div">
					<div class="animated-title">
						<div class="text-top">
							<div>
								<span>WELCOME</span> <span><%=s.getStName()%></span>
							</div>
						</div>
						<div class="text-bottom">
							<div>"College journey is not just about the classes you
								take, but the skills you build and the achievements you unlock.
								Let your dashboard be your canvas, and your resume, a
								masterpiece of your unique journey."</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- student basic Information setion-->
	<section class="dashboard" id="student-info">
		<div class="dash-content">
			<div class="overview">
				<div class="title">
					<i class="uil uil-user"></i> <span class="text">Student
						Information</span>
				</div>
			</div>
			<div class="student-details">
				<div class="form-row" style="display: flex; flex-wrap: wrap;">
					<div class="col-md-6">
						<div class="form-group">
							<label>Full Name:</label>
							<p id="full-name"><%=s.getStName()%></p>
						</div>
						<div class="form-group">
							<label>Enrollment No.:</label>
							<p id="enrollment-no"><%=s.getStEnroll()%></p>
						</div>
						<div class="form-group">
							<label>Scholar No.:</label>
							<p id="scholar-no"><%=s.getScholarNo()%></p>
						</div>
						<div class="form-group">
							<label>Gender:</label>
							<p id="gender"><%=s.getStGender()%></p>
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<label>Department:</label>
							<p id="department"><%=s.getStDept()%></p>
						</div>
						<div class="form-group">
							<label>Semester:</label>
							<p id="semester"><%=s.getStSem()%></p>
						</div>
						<div class="form-group">
							<label>Section:</label>
							<p id="section"><%=s.getStSection()%></p>
						</div>
						<div class="form-group">
							<label>Phone No.:</label>
							<p id="phone"><%=s.getStPhone()%></p>
						</div>
					</div>
				</div>
				<div class="form-row" style="display: flex; flex-wrap: wrap;">
					<div class="col-md-6">
						<div class="form-group">
							<label>College Email address:</label>
							<p id="college-email"><%=s.getStCollegeMail()%></p>
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<label>Personal Email address:</label>
							<p id="personal-email"><%=s.getStPersonelMail()%></p>
						</div>
					</div>
				</div>
				<div class="form-row" style="display: flex; flex-wrap: wrap;">
					<div class="col-md-6">
						<div class="form-group">
							<label>Linkedin Id (URL):</label>
							<p id="linkedin-url"><%=s.getStLinkedin()%></p>
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<label>Github Id (URL):</label>
							<p id="github-url"><%=s.getStGithub()%></p>
						</div>
					</div>
				</div>
				<div class="form-row">
					<div class="col-md-6">
						<div class="form-group">
							<label>Address:</label>
							<p id="address"><%=s.getStAddress()%></p>
						</div>
						<div class="form-group">
							<label>Date Of Birth:</label>
							<p id="DatOfBirth"><%=s.getStDob()%></p>
						</div>
					</div>
				</div>
			</div>

		</div>
		<div class="form-row text-center">
			<a href="updatePersonelDetails.jsp" class="btn">Update</a>
		</div>
	</section>

	<!-- academic-details section-->
	<section class="dashboard" id="academic-details">
		<div class="dash-content">
			<div class="overview">
				<div class="title">
					<i class="uil uil-graduation-cap"></i> <span class="text">Academic
						Details</span>
				</div>
			</div>
			<div class="student-details">
				<div class="form-row" style="display: flex; flex-wrap: wrap;">
					<div class="form-group" style="flex: 1;">
						<label for="BoardName">10th Grade Board Name:</label>
						<p id="board-name"><%=s.getTenthBoardName()%></p>
					</div>
					<div class="form-group">
						<label for="TenthSchool">10th Grade School Name:</label>
						<p id="tenth-school"><%=s.getTenthSchoolName()%></p>
					</div>
					<div class="form-group">
						<label for="TenthPercentage">10th Grade Percentage:</label>
						<p id="tenth-percentage"><%=s.getTenthMarks()%></p>
					</div>
				</div>
				<div class="form-row" style="display: flex; flex-wrap: wrap;">
					<div class="form-group" style="flex: 1;">
						<label for="BoardName">12th Grade Board Name:</label>
						<p id="board-name"><%=s.getTwelfthBoardName()%></p>
					</div>
					<div class="form-group">
						<label for="TenthSchool">12th Grade School Name:</label>
						<p id="tenth-school"><%=s.getTwelfthSchoolName()%></p>
					</div>
					<div class="form-group">
						<label for="TenthPercentage">12th Grade Percentage:</label>
						<p id="tenth-percentage"><%=s.getTwelfthMarks()%></p>
					</div>
				</div>
				<div class="form-row" style="display: flex; flex-wrap: wrap;">
					<div class="form-group" style="flex: 1;">
						<label for="ActiveBacklogs">Any Active Backlogs:</label>
						<p id="active-backlogs"><%=s.getCollegeBacklog()%></p>
					</div>
					<div class="form-group">
						<label for="CurrentCGPA">Current CGPA:</label>
						<p id="current-cgpa"><%=s.getCollegeCgpa()%></p>
					</div>
				</div>
			</div>
		</div>
		<div class="form-row text-center">
			<a href="UpdateAcademicInfo.jsp" class="btn">Update</a>
		</div>
	</section>

	<%
	StudentModel model = new StudentModel();
	List<Project> projectList = model.getAllProjects(s.getScholarNo());
	if (projectList.size() != 0) {
		int i = 0;
		for (Project p : projectList) {
			if (i == 1)
		break;
			i++;
	%>

	<!-- projects section -->
	<section class="dashboard" id="projects">
		<div class="dash-content">
			<div class="overview">
				<div class="title">
					<i class="uil uil-briefcase"></i> <span class="text">Projects</span>
				</div>
			</div>
			<div class="boxes">
				<h4>Recent Project</h4>
				<div class="box">
					<div class="form-group my-3">
						<label for="ProjectName">Project Name</label>
						<p><%=p.getProjectName()%></p>
					</div>
					<div class="form-group my-3">
						<label for="ProjectDisc">Project Description in Short</label>
						<p><%=p.getProjectDesc()%></p>
					</div>
					<div class="form-group my-3">
						<label for="ProjectRole">Your Role in Project</label>
						<p><%=p.getProjectRole()%></p>
					</div>
					<div class="form-group my-3">
						<label for="ProjectDuration">Project Duration (in Months)</label>
						<p><%=p.getProjectDuration()%></p>
					</div>
					<div class="form-group my-3">
						<label for="ProjectLink">Project URL (if Available)</label>
						<p><%=p.getProjectLink()%></p>
					</div>
				</div>
				<!-- <div class="box"></div>
                <div class="box"></div> -->
			</div>
		</div>
		<div id="additionalProjects"></div>
		<div class="form-row text-center">
			<a href="allProjects.jsp" class="btn">Show All</a> <a
				href="addProject.jsp" class="btn">Add More</a>
		</div>
	</section>

	<%
	}
	} else {
	%>

	<section class="dashboard" id="projects">
		<div class="dash-content">
			<div class="overview">
				<div class="title">
					<i class="uil uil-bag"></i> <span class="text">Project
						Details</span>
				</div>
			</div>
			<h3>There is no projects added</h3>
			<div class="form-row text-center">
				<a href="addProject.jsp" class="btn">Add Project</a>
			</div>
		</div>
	</section>


	<%
	}
	%>




	<%
	List<Certificates> cerList = model.getAllCertificates(s.getScholarNo());
	if (cerList.size() != 0) {
		int i = 0;
		for (Certificates c : cerList) {
			if (i == 1)
		break;
			i++;
	%>


	<!-- certificate section -->
	<section class="dashboard" id="certifications">
		<div class="dash-content">
			<div class="overview">
				<div class="title">
					<i class="uil uil-award"></i> <span class="text">Certifications</span>
				</div>
			</div>

			<div class="form-group my-3">
				<label for="CertificateName">Certificate Name:</label>
				<p id="certificate-name"><%=c.getCertiName()%></p>
			</div>
			<div class="form-group my-3">
				<label for="CompletionDate">Date of Completion:</label>
				<p id="completion-date"><%=c.getCertiCompletionDate()%></p>
			</div>
			<div class="form-group my-3">
				<label for="Platform">Platform:</label>
				<p id="platform"><%=c.getCertiPlateform()%></p>
			</div>

			<div class="form-group my-3">
				<label for="Upload">Certificate Url:</label>
				<p id="uploaded-certificate"><%=c.getCertiUrl()%></p>
			</div>
		</div>
		<div class="form-row text-center">
			<a href="allCertificates.jsp" class="btn">Show All</a> <a
				href="addCertificate.jsp" class="btn">Add More</a>
		</div>
	</section>

	<%
	}
	} else {
	%>


	<section class="dashboard" id="certifications">
		<div class="dash-content">
			<div class="overview">
				<div class="title">
					<i class="uil uil-award"></i> <span class="text">Certificates
						Details</span>
				</div>
			</div>
			<h3>There is no Certificates added</h3>
			<div class="form-row text-center">
				<a href="addCertificate.jsp" class="btn">Add Certificate</a>
			</div>
		</div>
	</section>

	<%
	}
	%>



	<%
	List<Internship> interList = model.getAllInternship(s.getScholarNo());
	if (interList.size() != 0) {
		int j = 0;
		for (Internship i : interList) {
			if (j == 1)
		break;
			j++;
	%>

	<!-- internship section -->
	<section class="dashboard" id="internships">
		<div class="dash-content">
			<div class="overview">
				<div class="title">
					<i class="uil uil-bag"></i> <span class="text">Internships/Trainings</span>
				</div>
			</div>
			<div class="boxes">
				<div class="box">
					<div class="form-group my-3">
						<label for="TrainingName">Training Name:</label>
						<p id="training-name"><%=i.getTrName()%></p>
					</div>
					<div class="form-group my-3">
						<label for="TrOrgName">Training Organisation Name:</label>
						<p id="tr-org-name"><%=i.getOrgName()%></p>
					</div>
					<div class="form-group my-3">
						<label for="TrOrgName">Training Description in short:</label>
						<p id="tr-org-name"><%=i.getTrDesc()%></p>
					</div>
					<div class="form-group my-3">
						<label for="StartDate">Start Date:</label>
						<p id="start-date"><%=i.getTrStartDate()%></p>
					</div>
					<div class="form-group my-3">
						<label for="CompletionDate">Date of Completion:</label>
						<p id="completion-date"><%=i.getTrEndDate()%></p>
					</div>
					<div class="form-group my-3">
						<label for="Upload">Training Certificate Url :</label>
						<p id="uploaded-certificate"><%=i.getTrCerti()%></p>
					</div>
				</div>
			</div>
		</div>
		<div class="form-row text-center">
			<a href="allInternships.jsp" class="btn">Show All</a> <a
				href="addInternship.jsp" class="btn">Add More</a>
		</div>
	</section>

	<%
	}
	} else {
	%>

	<section class="dashboard" id="internships">
		<div class="dash-content">
			<div class="overview">
				<div class="title">
					<i class="uil uil-bag"></i> <span class="text">Internship
						Details</span>
				</div>
			</div>
			<h3>There is no Internship added</h3>
			<div class="form-row text-center">
				<a href="addInternship.jsp" class="btn">Add Internship</a>
			</div>
		</div>
	</section>


	<%
	}
	%>


	<%
	List<Skill> skillList = model.getAllSkill(s.getScholarNo());
	if (skillList.size() != 0) {
	%>

	<!-- skill section -->
	<section class="dashboard" id="skills">
		<div class="dash-content">
			<div class="overview">
				<div class="title">
					<i class="uil uil-layers"></i> <span class="text">Skills</span>
				</div>
			</div>
			<div class="container mt-5">
				<%
				for (Skill sk : skillList) {
				%>
				<p><%=sk.getSkillName()%></p>

				<%
				}
				%>
			</div>
		</div>
		<div class="form-row text-center">
			<a href="allSkill.jsp" class="btn">Show All</a> <a
				href="addSkill.jsp" class="btn">Add more</a>
		</div>
	</section>
	<%
	} else {
	%>

	<section class="dashboard" id="skills">
		<div class="dash-content">
			<div class="overview">
				<div class="title">
					<i class="uil uil-layers"></i> <span class="text">Skills </span>
				</div>
			</div>
			<h3>There is no Skill added</h3>
			<div class="form-row text-center">
				<a href="addSkill.jsp" class="btn">Add Skill</a>
			</div>
		</div>
	</section>

	<%
	}
	%>


	<%
	List<Achievement> achieveList = model.getAllAchievement(s.getScholarNo());
	if (achieveList.size() != 0) {
	%>



	<!-- achievements section -->
	<section class="dashboard" id="achievements">
		<div class="dash-content">
			<div class="overview">
				<div class="title">
					<i class="uil uil-trophy"></i> <span class="text">Achievements</span>
				</div>
			</div>
			<div class="container mt-5">
				<%
				for (Achievement a : achieveList) {
				%>
				<p><%=a.getAchieveName()%></p>

				<%
				}
				%>
			</div>
		</div>
		<div class="form-row text-center">
			<a href="allAchievement.jsp" class="btn">Show All</a> <a
				href="addAchievement.jsp" class="btn">Add More</a>
		</div>
	</section>

	<%
	} else {
	%>

	<section class="dashboard" id="achievements">
		<div class="dash-content">
			<div class="overview">
				<div class="title">
					<i class="uil uil-trophy"></i> <span class="text">Achievement
					</span>
				</div>
			</div>
			<h3>There is no Achievement added</h3>
			<div class="form-row text-center">
				<a href="addAchievement.jsp" class="btn">Add Achievement</a>
			</div>
		</div>
	</section>

	<%
	}
	%>

	<%
	List<Curricular> curriList = model.getAllCurricular(s.getScholarNo());
	if (curriList.size() != 0) {
	%>

	<!-- CoCurricular section -->
	<section class="dashboard" id="co-curricular">
		<div class="dash-content">
			<div class="overview">
				<div class="title">
					<i class="bi bi-puzzle"></i> <span class="text">Co-Curricular</span>
				</div>
			</div>
			<div class="container mt-5">
				<%
				for (Curricular c : curriList) {
				%>
				<p><%=c.getCurricularName()%></p>

				<%
				}
				%>
			</div>
		</div>
		<div class="form-row text-center">
			<a href="allCurricular.jsp" class="btn">Show All</a> <a
				href="addCurricular.jsp" class="btn">Add More</a>

		</div>
	</section>




	<%
	} else {
	%>

	<section class="dashboard" id="co-curricular">
		<div class="dash-content">
			<div class="overview">
				<div class="title">
					<i class="bi bi-puzzle"></i> <span class="text">Curricular </span>
				</div>
			</div>
			<h3>There is no Curricular added</h3>
			<div class="form-row text-center">
				<a href="addCurricular.jsp" class="btn">Add Curricular</a>
			</div>
		</div>
	</section>

	<%
	}
	%>


	<%
	StudentModel model1 = new StudentModel();
	Career c = model1.getCareerDetails(s.getScholarNo());

	if (c != null) {
	%>
	<!-- carrer detail section -->
	<section class="dashboard" id="career-details">
		<div class="dash-content">
			<div class="overview">
				<div class="title">
					<i class="uil uil-bag"></i> <span class="text">Career
						Details</span>
				</div>
			</div>
			<div class="form-group form-row my-3">
				<label for="CareerObj">Career Objective:</label>
				<p id="career-objective"><%=c.getCareerObj()%></p>
			</div>
			<div class="form-row">
				<div class="form-group my-3">
					<label for="Strength_1">Strength 1:</label>
					<p id="strength-1"><%=c.getStrength1()%></p>
				</div>
				<div class="form-group my-3">
					<label for="Strength_2">Strength 2:</label>
					<p id="strength-2"><%=c.getStrength2()%></p>
				</div>
			</div>
			<div class="form-row">
				<div class="form-group my-3">
					<label for="Hobby_1">Hobby 1:</label>
					<p id="hobby-1"><%=c.getHobby1()%></p>
				</div>
				<div class="form-group my-3">
					<label for="Hobby_2">Hobby 2:</label>
					<p id="hobby-2"><%=c.getHobby1()%></p>
				</div>
			</div>
			<div class="form-row"></div>
			<div class="form-group my-3">
				<label for="Weakness_1">Weakness 1:</label>
				<p id="weakness-1"><%=c.getWeakness1()%></p>
			</div>
			<div class="form-group my-3">
				<label for="Weakness_2">Weakness 2:</label>
				<p id="weakness-2"><%=c.getWeakness2()%></p>
			</div>
		</div>


		<div class="form-row text-center">
			<a href="updateCarrerDetails.jsp" class="btn">Update</a>
		</div>
	</section>
	<%
	} else {
	%>

	<section class="dashboard" id="career-details">
		<div class="dash-content">
			<div class="overview">
				<div class="title">
					<i class="uil uil-bag"></i> <span class="text">Career
						Details</span>
				</div>
			</div>
			<div class="form-row text-center">
				<a href="career_details.jsp" class="btn">Add Career Details</a>
			</div>
		</div>
	</section>


	<%
	}
	%>
	<script>
        const body = document.querySelector("body"),
        sidebar = body.querySelector("nav");
        sidebarToggle = body.querySelector(".sidebar-toggle");

        sidebarToggle.addEventListener("click", () => {
            sidebar.classList.toggle("close");
            if(sidebar.classList.contains("close")){
                localStorage.setItem("status", "close");
            }else{
                localStorage.setItem("status", "open");
            }
        })


    </script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>
</body>
</html>