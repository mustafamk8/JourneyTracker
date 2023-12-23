<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Faculty Login</title>
  <link rel="stylesheet" href="../faculty/facultycss/LoginPage.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
</head>
<body class="b">
  <div class="wrapper">
    <header>Faculty Login</header>
    <form action="../FacultyLogin" method="post">
      <%@include file="../components/message.jsp" %>
      <div class="field user">
        <div class="input-area">
          <input type="email" placeholder="Email" name="email">
          <i class="icon fas fa-solid fa-user"></i>
          <i class="error error-icon fas fa-exclamation-circle"></i>
        </div>
        <div class="error error-txt">Email can't be blank</div>
      </div>
      
      <div class="field password">
        <div class="input-area">
          <input type="password" name="password" placeholder="Password" required>
          <i class="icon fas fa-lock"></i>
          <i class="error error-icon fas fa-exclamation-circle"></i>
        </div>
        <div class="error error-txt">Password can't be blank</div>
      </div>
      <div id="updatePassDiv" class="field password" style="display: none;">
        <div class="input-area">
          <input type="password" placeholder="New Password" >
          <i class="icon fas fa-lock"></i>
          <i class="error error-icon fas fa-exclamation-circle"></i>
        </div>
        <div class="error error-txt">New password can't be blank</div>
      </div>
      <div class="update_pass">
        <p>Forget Password? <span class="update" onclick="myFunction()">Update here</span></p>
      </div>
      <input id="login" type="submit" value="Login">
      <input id="save" type="button" value="Save" style="display: none;" onclick="window.location.reload();">
    </form>
  </div>


</body>
</html>