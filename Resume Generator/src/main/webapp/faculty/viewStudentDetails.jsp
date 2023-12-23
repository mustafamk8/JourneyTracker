<%@include file="../faculty/components/facultyLogout.jsp"%>	
<%@page import="com.resume.bean.StudentPersonel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.resume.bean.StudentPersonel"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../faculty/facultycss/studentdashboard.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap/dist/css/bootstrap.min.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
    <link rel="stylesheet" href="StudentDashboard.css">
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
    
    <title>Details</title>

    <style>
        body{
            min-height: 100vh;
            background-color: #e6e5e5;
        }
        .dashboard {
            background-color: var(--panel-color);
            width: 70%;
            padding-top: 2px;
            padding-bottom: 14px;
            transition: var(--tran-05);
        }
        section{
            margin: 15px;
        }
        .dashboard .top{
            width: 100%;
            left: 0px;
            position: fixed;
        }

    </style>
</head>
<body>

<%
	Faculty f = (Faculty) session.getAttribute("current-user");
	StudentPersonel s = (StudentPersonel) session.getAttribute("list");
	%>

    
    <!-- student basic Information setion-->
    <section class="dashboard" id="student-info" style="margin-top: 100px;">
        <div class="top">
            <button type="button" class="navbar-brand" style="border: none; cursor: pointer;text-decoration: none;" onclick="goBack()"><i class="fas fa-arrow-left mx-2"></i>Go Back</button>            
            <div class="profile">
                <div class="profile-name"><%=f.getName() %></div>
                <div class="profile-dropdown">
                    <button type="button" class="dropdown-toggle"><i class="uil uil-user"></i></button>
                    <ul class="dropdown-menu">
                        <li><a href="#">Update Password</a></li>
                        <li><a href="#">Logout</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="dash-content">
            <div class="overview">
                <div class="title">
                    <i class="uil uil-user"></i>
                    <span class="text">Student Information</span>
                </div>
            </div>
            <div class="student-details">
                    <div class="form-row"  style="display: flex; flex-wrap: wrap;">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label>Full Name:</label>
                                <p id="full-name"><%=s.getStName() %></p>
                            </div>
                            <div class="form-group">
                                <label>Enrollment No.:</label>
                                <p id="enrollment-no"><%=s.getStEnroll() %></p>
                            </div>
                            <div class="form-group">
                                <label>Scholar No.:</label>
                                <p id="scholar-no"><%=s.getScholarNo() %></p>
                            </div>
                            <div class="form-group">
                                <label>Gender:</label>
                                <p id="gender"><%=s.getStGender() %></p>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label>Department:</label>
                                <p id="department"><%=s.getStDept() %></p>
                            </div>
                            <div class="form-group">
                                <label>Semester:</label>
                                <p id="semester"><%=s.getStSem() %></p>
                            </div>
                            <div class="form-group">
                                <label>Section:</label>
                                <p id="section"><%=s.getStSection() %></p>
                            </div>
                            <div class="form-group">
                                <label>Phone No.:</label>
                                <p id="phone"><%=s.getStPhone() %></p>
                            </div>
                        </div>
                    </div>
                    <div class="form-row"  style="display: flex; flex-wrap: wrap;">
                        <div class="col-md-6" >
                            <div class="form-group">
                                <label>College Email address:</label>
                                <p id="college-email"><%=s.getStCollegeMail() %></p>
                            </div>
                        </div>
                        <div class="col-md-6" >
                            <div class="form-group">
                                <label>Personal Email address:</label>
                                <p id="personal-email"><%=s.getStPersonelMail() %></p>
                            </div>
                        </div>
                    </div>
                    <div class="form-row" style="display: flex; flex-wrap: wrap;">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label>Linkedin Id (URL):</label>
                                <p id="linkedin-url"><%=s.getStLinkedin() %></p>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label>Github Id (URL):</label>
                                <p id="github-url"><%=s.getStGithub() %></p>
                            </div>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label>Address:</label>
                                <p id="address"><%=s.getStAddress() %></p>
                            </div>
                            <div class="form-group">
                                <label>Date Of Birth :</label>
                                <p id="caste-category"><%=s.getStDob() %></p>
                            </div>
                        </div>
                    </div>                   
                </div>
                
        </div>

    </section>
    
    <!-- academic-details section-->
    <section class="dashboard" id="academic-details">
        <div class="dash-content">
            <div class="overview">
                <div class="title">
                    <i class="uil uil-graduation-cap"></i>
                    <span class="text">Academic Details</span>
                </div>
            </div>
            <div class="student-details">
                <div class="form-row" style="display: flex; flex-wrap: wrap;">
                        <div class="form-group" style="flex: 1;">
                            <label for="BoardName">10th Grade Board Name:</label>
                            <p id="board-name">Example Board</p>
                        </div>
                        <div class="form-group">
                            <label for="TenthSchool">10th Grade School Name:</label>
                            <p id="tenth-school">Example School</p>
                        </div>
                        <div class="form-group">
                            <label for="TenthPercentage">10th Grade Percentage:</label>
                            <p id="tenth-percentage">87%</p>
                        </div>
                </div>
                <div class="form-row" style="display: flex; flex-wrap: wrap;">
                        <div class="form-group" style="flex: 1;">
                            <label for="BoardName">12th Grade Board Name:</label>
                            <p id="board-name">Example Board</p>
                        </div>
                        <div class="form-group">
                            <label for="TenthSchool">12th Grade School Name:</label>
                            <p id="tenth-school">Example School</p>
                        </div>
                        <div class="form-group">
                            <label for="TenthPercentage">12th Grade Percentage:</label>
                            <p id="tenth-percentage">87%</p>
                        </div>
                </div>
                <div class="form-row" style="display: flex; flex-wrap: wrap;">
                        <div class="form-group" style="flex: 1;">
                            <label for="ActiveBacklogs">Any Active Backlogs:</label>
                            <p id="active-backlogs">No</p>
                        </div>
                        <div class="form-group">
                            <label for="CurrentCGPA">Current CGPA:</label>
                            <p id="current-cgpa">8.7</p>
                        </div>
                </div>
            </div>
        </div>
    </section>
    
    <!-- projects section -->
    <section class="dashboard" id="projects">
        <div class="dash-content">
            <div class="overview">
                <div class="title">
                    <i class="uil uil-briefcase"></i>
                    <span class="text">Projects</span>
                </div>
            </div>
            <div class="boxes">
                <h4>Recent Project</h4>
                <div class="box">
                    <div class="form-group my-3">
                        <label for="ProjectName">Project Name</label>
                        <p>Project</p>
                    </div>
                    <div class="form-group my-3">
                        <label for="ProjectDisc">Project Description in Short</label>
                        <p>Project</p>
                    </div>
                    <div class="form-group my-3">
                        <label for="ProjectRole">Your Role in Project</label>
                        <p>Project</p>
                    </div>
                    <div class="form-group my-3">
                        <label for="ProjectDuration">Project Duration (in Months)</label>
                        <p>Project</p>
                    </div>
                    <div class="form-group my-3">
                        <label for="ProjectLink">Project URL (if Available)</label>
                        <p>Project</p>
                    </div>
                </div>
                <!-- <div class="box"></div>
                <div class="box"></div> -->
            </div>
        </div>            

    </section>
    
    <!-- certificate section -->
    <section class="dashboard" id="certifications">
        <div class="dash-content">
            <div class="overview">
                <div class="title">
                    <i class="uil uil-award"></i>
                    <span class="text">Certifications</span>
                </div>
            </div>
            <div class="form-group my-2">
                <label for="CertificateID">Certificate ID:</label>
                <p id="certificate-id">C12345</p>
            </div>
            <div class="form-group my-3">
                <label for="CertificateName">Certificate Name:</label>
                <p id="certificate-name">Certification Name</p>
            </div>
            <div class="form-group my-3">
                <label for="CompletionDate">Date of Completion:</label>
                <p id="completion-date">2023-10-12</p>
            </div>
            <div class="form-group my-3">
                <label for="Platform">Platform:</label>
                <p id="platform">Certification Platform</p>
            </div>
            <div class="form-group my-3">
                <label for="DigitalID">Digital ID (Optional):</label>
                <p id="digital-id">D12345</p>
            </div>
            <div class="form-group my-3">
                <label for="Upload">Uploaded Certificate:</label>
                <p id="uploaded-certificate">Certificate.pdf</p>
            </div>
        </div>
    </section>
    
    <!-- internship section -->
    <section class="dashboard" id="internships">
        <div class="dash-content">
            <div class="overview">
                <div class="title">
                    <i class="uil uil-bag"></i>
                    <span class="text">Internships/Trainings</span>
                </div>
            </div>
            <div class="boxes">
                <div class="box">
                    <div class="form-group my-3">
                        <label for="TrainingName">Training Name:</label>
                        <p id="training-name">Training Name</p>
                    </div>
                    <div class="form-group my-3">
                        <label for="TrOrgName">Training Organisation Name:</label>
                        <p id="tr-org-name">Training Organisation Name</p>
                    </div>
                    <div class="form-group my-3">
                        <label for="StartDate">Start Date:</label>
                        <p id="start-date">2023-10-12</p>
                    </div>
                    <div class="form-group my-3">
                        <label for="CompletionDate">Date of Completion:</label>
                        <p id="completion-date">2023-12-31</p>
                    </div>
                    <div class="form-group my-3">
                        <label for="Upload">Uploaded Training Certificate:</label>
                        <p id="uploaded-certificate">TrainingCertificate.pdf</p>
                    </div>
                </div>
            </div>
        </div>
    </section>
    
    <!-- skill section -->
    <section class="dashboard" id="skills">
        <div class="dash-content">
            <div class="overview">
                <div class="title">
                    <i class="uil uil-layers"></i>
                    <span class="text">Skills</span>
                </div>
            </div>
            <div class="container mt-5">
                <p>skill 1</p>
                <p>skill 2</p>
                <p>skill 3</p>
            </div>
        </div>
    </section> 

    <!-- achievements section -->
    <section class="dashboard" id="achievements">
        <div class="dash-content">
            <div class="overview">
                <div class="title">
                    <i class="uil uil-trophy"></i>
                    <span class="text">Achievements</span>
                </div>
            </div>
            <div class="form-group my-3">
                <label for="TrainingName">Achievement Name:</label>
                <p>Achievement sem</p>
            </div>
            <div class="form-group my-3">
                <label for="TrainingName">Achievement Name:</label>
                <p>Achievement sem</p>
            </div>
        </div>
    </section>

    <!-- CoCurricular section -->
    <section class="dashboard" id="co-curricular">
        <div class="dash-content">
            <div class="overview">
                <div class="title">
                    <i class="bi bi-puzzle"></i>
                    <span class="text">Co-Curricular</span>
                </div>
            </div>
            <div class="container mt-5">
                <p>skill 1</p>
                <p>skill 2</p>
                <p>skill 3</p>
            </div>
        </div>
    </section>

    <!-- carrer detail section -->
    <section class="dashboard" id="career-details">
        <div class="dash-content">
            <div class="overview">
                <div class="title">
                    <i class="uil uil-bag"></i>
                    <span class="text">Career Details</span>
                </div>
            </div>      
            <div class="form-group form-row my-3">
                <label for="CareerObj">Career Objective:</label>
                <p id="career-objective">Your career objective</p>
            </div>
            <div class="form-row">
                <div class="form-group my-3">
                    <label for="Strength_1">Strength 1:</label>
                    <p id="strength-1">Strength 1</p>
                </div>
                <div class="form-group my-3">
                    <label for="Strength_2">Strength 2:</label>
                    <p id="strength-2">Strength 2</p>
                </div>
            </div>
            <div class="form-row">
                <div class="form-group my-3">
                    <label for="Hobby_1">Hobby 1:</label>
                    <p id="hobby-1">Hobby 1</p>
                </div>
                <div class="form-group my-3">
                    <label for="Hobby_2">Hobby 2:</label>
                    <p id="hobby-2">Hobby 2</p>
                </div>
            </div>
            <div class="form-row"></div>
                <div class="form-group my-3">
                    <label for="Weakness_1">Weakness 1:</label>
                    <p id="weakness-1">Weakness 1</p>
                </div>
                <div class="form-group my-3">
                    <label for="Weakness_2">Weakness 2:</label>
                    <p id="weakness-2">Weakness 2</p>
                </div>
            </div>
            
        </div>
    </section>
    <script>
		function goBack() {
			window.history.back();
		}
	</script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
</body>
</html>