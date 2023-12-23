<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login</title>
  <link rel="stylesheet" href="studentcss/studentLogin.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
</head>
<body class="b">
  <div class="wrapper">
    <header>Track Your Journey here!</header>
    <%@include file="components/message.jsp"%>
    <form method="post" action="LoginServlet">
      <div class="field scholar">
        <div class="input-area">
          <input type="text" name="st_scholar" placeholder="Username (Scholar No.)" required>
          <i class="icon fas fa-solid fa-user"></i>
          <i class="error error-icon fas fa-exclamation-circle"></i>
        </div>
        <div class="error error-txt">Username can't be blank</div>
        <div class="note">
        *Note : must contain 2 characters in captial and 5 digits e.g. "BE20140"
        </div>
      </div>
      
      <div class="field password">
        <div class="input-area">
          <input type="password" name="st_password" placeholder="Password" required>
          <i class="icon fas fa-lock"></i>
          <i class="error error-icon fas fa-exclamation-circle"></i>
        </div>
        <div class="error error-txt">Password can't be blank</div>
      </div>
      <!-- <div id="updatePassDiv" class="field password" style="display: none;">
        <div class="input-area">
          <input type="password" placeholder="New Password">
          <i class="icon fas fa-lock"></i>
          <i class="error error-icon fas fa-exclamation-circle"></i>
        </div>
        <div class="error error-txt">New password can't be blank</div>
      </div> -->
      <div class="update_pass">
        <p>Forget Password? <a class="update" href="forgetPassword.jsp">Mail Us</a></p>
      </div>
      <input id="login" type="submit" value="Login">
      <!-- <input id="save" type="button" value="Save" style="display: none;" onclick="window.location.reload();"> -->
    </form>

  </div>

  <script src="student_javascript/Script.js"></script>

</body>
</html>