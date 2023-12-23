<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Role</title>
  <link rel="stylesheet" href="studentcss/Role.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
</head>

<body class="b">
  <div class="wrapper">
    <header>Welcome to Journey Tracker</header>
    <form id="roleForm" method="post" action="SubmitRole" >
        <div class="heading">
            <header>Select Role</header>
            <%@include file="components/message.jsp" %>
        </div>
        <div class="role btn-group" role="role" aria-label="Basic radio toggle button group">
            <input type="radio" class="btn-check" name="role" id="btnradio1" autocomplete="off" value="Student">
            <label class="btn btn-outline-primary custom" for="btnradio1">Student</label>
          
            <input type="radio" class="btn-check" name="role" id="btnradio2" autocomplete="off" value="Faculty">
            <label class="btn btn-outline-primary custom" for="btnradio2">Faculty</label>
          
            <input type="radio" class="btn-check" name="role" id="btnradio3" autocomplete="off" value="Admin">
            <label class="btn btn-outline-primary custom" for="btnradio3">Admin</label>
          </div>
        <input type="submit" value="Proceed">
    </form>
  </div>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>

</body>
</html>