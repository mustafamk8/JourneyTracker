<%@page import="com.resume.bean.StudentPersonel"%>
<%@page import="java.util.List"%>
<%@page import="com.resume.model.FacultyModel"%>
<%@include file="../faculty/components/facultyLogout.jsp"%>
<%@page import="com.resume.bean.Faculty"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="../faculty/facultycss/facultydashboard.css">
<link rel="stylesheet"
	href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">

<title>Faculty Dashboard</title>
<style>
        @import url("https://fonts.googleapis.com/css?family=Roboto:700");
@keyframes showTopText {
  0% {
    transform: translate3d(0, 100%, 0);
  }
  40%, 60% {
    transform: translate3d(0, 50%, 0);
  }
  100% {
    transform: translate3d(0, 0, 0);
  }
}
@keyframes showBottomText {
  0% {
    transform: translate3d(0, -100%, 0);
  }
  100% {
    transform: translate3d(0, 0, 0);
  }
}
.animated-title {
  color: rgb(65, 62, 62);
  font-family: Roboto, Arial, sans-serif;
  height: 95vmin;
  left: 50%;
  position: absolute;
  top: 60%;
  transform: translate(-50%, -50%);
  width: 100vmin;
}

.animated-title > div {
  height: 50%;
  overflow: hidden;
  position: absolute;
  width: 100%;
}

.animated-title > div div {
  font-size: 12vmin;
  padding: 2vmin 0;
  position: absolute;
}

.animated-title > div div span {
  display: block;
}

.animated-title > div.text-top {
  border-bottom: 1vmin solid #000;
  top: 0;
}

.animated-title > div.text-top div {
  animation: showTopText 1s;
  animation-delay: 0.5s;
  animation-fill-mode: forwards;
  bottom: 0;
  transform: translate(0, 100%);
}

.animated-title > div.text-top div span:first-child {
  color: #4d2572;
}

.animated-title > div.text-bottom {
  bottom: 0;
  
}

.animated-title > div.text-bottom div {
  animation: showBottomText 0.5s;
  animation-delay: 1.75s;
  animation-fill-mode: forwards;
  top: 0;
  transform: translate(0, -100%);
  font-size: 20px;
  font-style: italic;
  color: #27123a;
}

    </style>
</head>
<body>

	<%
	Faculty f = (Faculty) session.getAttribute("current-user");
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
				<li><a href="#dashboard"> <i class="uil uil-estate"></i> <span
						class="link-name">Dashboard</span>
				</a></li>
				<li><a href="#students"> </i><i class="far fa-user fa-3x"></i>
						<span class="link-name">All Students</span>
				</a></li>
			</ul>

			<ul class="logout-mode">
				<li><a href="../FacultyLogout"> <i class="uil uil-signout"></i>
						<span class="link-name">Logout</span>
				</a></li>
				</li>
			</ul>
		</div>
	</nav>

	<section class="dashboard" id="dashboard">
		<div class="top">
			<i class="uil uil-bars sidebar-toggle"></i>

			<div class="profile">
				<div class="profile-name"><%=f.getName()%></div>
				<div class="profile-dropdown">
					<button type="button" class="dropdown-toggle">
						<i class="uil uil-user" style="font-size: 18px;"></i>
					</button>
					<ul class="dropdown-menu">
						<li><a href="../faculty/update_password.jsp">Update
								Password</a></li>
						<li><a href="../FacultyLogout">Logout</a></li>
					</ul>
				</div>
			</div>
		</div>

				<div id="toast">
					<%@include file="../faculty/components/message.jsp"%>
				</div>
<script type="text/javascript">
		showToast();
		function showToast(content)
		{
		    $('#toast').addClass("display");
		    $('#toast').html(content);
		    setTimeout(()=>{
		        $("#toast").removeClass("display");
		    },2000)
		}	
</script>
		<div class="dash-content">
			<div class="overview">
				<div class="title">
					<i class="uil uil-tachometer-fast-alt"></i> <span class="text">Dashboard</span>
				</div>
				
				<div class="div">
					<div class="animated-title">
						<div class="text-top">
							<div>
								<span>WELCOME</span> <span><%=f.getName()%></span>
							</div>
						</div>
						<div class="text-bottom">
							<div>"Teaching is not merely a profession; it's a
								passionate brushstroke on the canvas of knowledge, coloring the
								future with wisdom and shaping the world with inspiration."</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<%
	FacultyModel model = new FacultyModel();
	List<StudentPersonel> list = model.getAllStudentsByDept(f.getDepartment());
	%>

	<section class="dashboard" id="students">
		<div class="dash-content">
			<div class="overview">
				<div class="title">
					<i class="far fa-user fa-3x"></i>
					<h6 class="text">All Students</h6>
				</div>
				<div class="boxes2" style="margin-left: 30px;">
					<div class="box">
						<span class="text">Total Students in <%=f.getDepartment()%>
						</span> <span class="number"><%=list.size()%></span>
					</div>
				</div>
				<div class="container" style="margin-top: 50px;">
					<div class="row"
						style="display: flex; flex-direction: row; flex-wrap: wrap;">
						<div class="card-sl" style="margin-left: 30px;">
							<div class="card-image">
								<img
									src="data:image/jpeg;base64,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" />
							</div>
							<div class="card-heading">STUDENTS</div>
							<a href="allStudents.jsp" class="card-button">View All</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	
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

</body>
</html>