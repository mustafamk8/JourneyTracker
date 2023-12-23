<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" >
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Login</title>
    <link rel="stylesheet" href="../admin/css/adminLogin.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
    
</head>

<body>
<div class="wrapper">
    <header>Admin Login</header>
    <form action="../AdminLogin" method="post">
      <%@include file="../components/message.jsp" %>
      <div class="field user">
        <div class="input-area">
          <input type="text" name="admin_username" placeholder="Username" required>
          <i class="icon fas fa-solid fa-user"></i>
          <i class="error error-icon fas fa-exclamation-circle"></i>
        </div>
        <div class="error error-txt">Username can't be blank</div>
      </div>
      
      <div class="field password">
        <div class="input-area">
          <input type="password" name="admin_password" placeholder="Password" required>
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
      
    </form>
</div>



</body>
</html>