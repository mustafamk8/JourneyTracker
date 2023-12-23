<%@page import="java.util.Date"%>
<%@page import="com.resume.bean.Curricular"%>
<%@page import="com.resume.bean.Achievement"%>
<%@page import="com.resume.bean.Certificates"%>
<%@page import="com.resume.bean.Skill"%>
<%@page import="com.resume.bean.Project"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="javax.swing.event.InternalFrameListener"%>
<%@page import="com.resume.bean.Internship"%>
<%@page import="com.resume.bean.Career"%>
<%@page import="com.resume.model.StudentModel"%>
<%@include file="components/logout.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Resume</title>
<script src="https://unpkg.com/feather-icons"></script>
<!-- <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"> -->
<link rel="stylesheet" href="studentcss/resume.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">

<style type="text/css">
@media print {
	/* Set page size to A4 (210mm x 297mm) and adjust margins */
	@page {
		size: 210mm 297mm;
		margin: 0; /* No margin for top, bottom, left, and right */
	}
	/* Reduce font size */
	body {
		font-size: 14pt; /* Reduce font size to fit content on one page */
		margin: auto;
		padding: 0;
		background-color: white;
	}
	.container {
		min-height: 100%;
		margin: 0;
		grid-template-columns: 1.8fr 1.2fr;
	}
	.downloadBtn {
		display: none;
	}
	.contact h2 {
		font-size: 1.5rem;
	}
	.group-2 {
		margin-right: 20px;
		padding-right: 50px;
	}
}
</style>

</head>

<body>
	<%
	StudentPersonel s = (StudentPersonel) session.getAttribute("current-user");
	StudentModel sm = new StudentModel();

	Career c = sm.getCareerDetails(s.getScholarNo());
	List<Internship> internList = sm.getAllInternship(s.getScholarNo());
	List<Project> projectList = sm.getAllProjects(s.getScholarNo());
	List<Skill> skillList = sm.getAllSkill(s.getScholarNo());
	List<Certificates> certiList = sm.getAllCertificates(s.getScholarNo());
	List<Achievement> achieveList = sm.getAllAchievement(s.getScholarNo());
	List<Curricular> curriList = sm.getAllCurricular(s.getScholarNo());
	%>
	<div class="container">
		<div class="profile"
			style="display: flex; justify-content: space-between;">
			<div class="profile_container">
				<div class="profile_profileImg">
					<img
						src="https://i.pinimg.com/originals/4a/cf/16/4acf16a2999a4c6dfdfe03f198b95b13.jpg"
						alt="pic">
				</div>
				<div style="margin-top: 2%;">
					<h1 class="profile_name">
						<span class="profile_name"><%=s.getStName()%></span>
					</h1>
					<div class="contact">
						<div class="contact_info" style="display: flex;">
							<h2 style="margin-top: 1rem; padding-right: 3px;">Address:</h2>
							<p class="description"><%=s.getStAddress()%></p>
						</div>
						<div class="mail" style="display: flex;">
							<h2 style="margin-top: 1rem;">Contact:</h2>
							<div class="mail_info"
								style="display: flex; flex-direction: row; padding-left: 3px;">
								<p class="description"><%=s.getStPhone()%></p>
								<p class="description"><%=s.getStPersonelMail()%></p>
							</div>

						</div>
						<div class="social">
							<div class="social_items"
								style="display: flex; flex-direction: row;">
								<a href="<%=s.getStGithub()%>" target="_b" class="social_item ">
									<i data-feather="github"></i> <span><%=s.getStGithub().substring(23)%>
								</span>
								</a> <a href="<%=s.getStLinkedin()%>" target="_blank"
									class="social_item"> <i data-feather="linkedin"></i> <span><%=s.getStLinkedin().substring(28)%></span>
								</a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="print">
				<a class="downloadBtn" onclick="window.print()">Print PDF</a>
			</div>
		</div>
		<div class="group-1">
			<div class="obj">
				<h3 class="title">Objective</h3>
				<p class="description profile_description"><%=c.getCareerObj()%></p>
			</div>
			<div class="edu">
				<h3 class="title">Education</h3>
				<div class="edu_item">
					<h4 class="item_title"
						style="display: flex; justify-content: space-between;">
						Bachelor of Technology in
						<%=s.getStDept()%>
						(current CGPA:<%=s.getCollegeCgpa()%>)
						<p class="item_preTitle" style="font-weight: 500;">
							<%

							%>
						</p>
					</h4>
					<p class="item_subtitle">Acropolis Institute of Technology and
						Research</p>
				</div>
				<div class="edu_item">
					<h4 class="item_title"
						style="display: flex; justify-content: space-between;">
						<%=s.getTwelfthSchoolName()%>
						(Percentage:
						<%=s.getTwelfthMarks()%>)
						<!-- 						<p class="item_preTitle" style="font-weight: 500;">2012-2014</p>  -->
					</h4>
					<p class="item_subtitle">Acropolis Institute of Technology and
						Research</p>
				</div>
				<div class="edu_item">
					<h4 class="item_title"
						style="display: flex; justify-content: space-between;">
						<%=s.getTenthSchoolName()%>
						(Percentage:
						<%=s.getTenthMarks()%>)
						<!-- 						<p class="item_preTitle" style="font-weight: 500;">2012-2014</p> -->
					</h4>
					<p class="item_subtitle">Acropolis Institute of Technology and
						Research</p>
				</div>
			</div>
			<div class="exp">
				<h3 class="title">Experience</h3>
				<%
				for (Internship i : internList) {
				%>
				<div class="exp_item">
					<h4 class="item_title"
						style="display: flex; justify-content: space-between;">
						<%=i.getOrgName()%>
						<p class="item_preTitle" style="font-weight: 500;">
							<%=i.getTrStartDate()%>
							-
							<%=i.getTrEndDate()%>
						</p>
					</h4>
					<p class="item_subtitle">
						<%=i.getTrName()%>
					</p>
					<p class=" description">lorem shansnaiunasin n sajnas</p>
				</div>
				<%
				}
				%>
			</div>
			<div class="exp">
				<h3 class="title">Projects</h3>
				<%
				for (Project p : projectList) {
				%>
				<div class="exp_item">
					<h4 class="item_title"
						style="display: flex; justify-content: space-between;">
						<%=p.getProjectName()%>
						<p class="item_preTitle" style="font-weight: 500;">
							<%=p.getProjectDuration()%>
							Months
						</p>
					</h4>
					<p class="item_subtitle">
						<%=p.getProjectRole()%>
					</p>
					<p class=" description"><%=p.getProjectDesc()%></p>
				</div>
				<%
				}
				%>
			</div>
		</div>
		<div class="group-2">
			<div class="skills">
				<h3 class="title">Skills</h3>
				<ul class="skills_list description">
					<%
					for (Skill skill : skillList) {
					%>
					<li><%=skill.getSkillName()%></li>
					<%
					}
					%>
				</ul>
			</div>
			<div class="certification">
				<h3 class="title">Certification</h3>
				<ul class="certification_list description">
					<%
					for (Certificates certi : certiList) {
					%>
					<li><%=certi.getCertiName()%> - <%=certi.getCertiCompletionDate()%></li>
					<%
					}
					%>

				</ul>
			</div>
			<div class="achievements">
				<h3 class="title">Achievements</h3>
				<ul class="achievements_list description">
					<%
					for (Achievement ach : achieveList) {
					%>
					<li><%=ach.getAchieveName()%></li>
					<%
					}
					%>
				</ul>
			</div>
			<div class="cocurricular">
				<h3 class="title">CoCurricular</h3>
				<ul class="cocurricular_list description">
					<%
					for (Curricular curr : curriList) {
					%>
					<li><%=curr.getCurricularName()%></li>
					<%
					}
					%>
				</ul>
			</div>
			<div class="interest">
				<h3 class="title">Interest</h3>
				<div class="interest_items">
					<div class="interest_item">
						<span><%=c.getHobby1()%></span>
					</div>
					<div class="interest_item">
						<span><%=c.getHobby2()%></span>
					</div>
				</div>
			</div>
			<div class="strength">
				<h3 class="title">Strengths</h3>
				<div class="strength_items">
					<div class="strength_item">
						<span><%=c.getStrength1()%></span>
					</div>
					<div class="strength_item">
						<span><%=c.getStrength2()%></span>
					</div>
				</div>
			</div>
			<div class="weakness">
				<h3 class="title">Weakness</h3>
				<div class="weakness_items">
					<div class="weakness_item">
						<span><%=c.getWeakness1()%></span>
					</div>
					<div class="weakness_item">
						<span><%=c.getWeakness2()%></span>
					</div>

				</div>
			</div>
		</div>
	</div>

	<script>
		feather.replace()
	</script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
		integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
		integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
		crossorigin="anonymous"></script>
</body>

</html>