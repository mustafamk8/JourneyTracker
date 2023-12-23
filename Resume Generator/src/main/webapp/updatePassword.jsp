<%@include file="components/logout.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login</title>
<link rel="stylesheet" href="studentcss/studentLogin.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />
</head>
<body class="b">
	<%
	StudentPersonel s = (StudentPersonel) session.getAttribute("current-user");
	%>
	<div class="wrapper">
		<header>Track Your Journey here!</header>
		<%@include file="components/message.jsp"%>
		<form method="post" action="UpdatePassword">
			<div class="input-area">
				<input type="hidden" name="scholar" placeholder="Password"
					value="<%=s.getScholarNo()%>">
			</div>
			<div class="field scholar">
				<div class="input-area">

					<input type="text" name="newPassword" placeholder="Enter New Password" required>
					<i class="icon fas fa-solid fa-user"></i> <i
						class="error error-icon fas fa-exclamation-circle"></i>
				</div>
			</div>
			<input id="login" type="submit" value="Update Password">
			<!-- <input id="save" type="button" value="Save" style="display: none;" onclick="window.location.reload();"> -->
		</form>

	</div>

	<script src="student_javascript/Script.js"></script>

</body>
</html>