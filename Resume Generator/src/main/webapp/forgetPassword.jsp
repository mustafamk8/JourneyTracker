<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Forgot Password</title>
<link rel="stylesheet" href="studentcss/studentLogin.css">
<script>
	function validateEmail() {
		var emailInput = document.getElementById("clg_email");
		var emailValue = emailInput.value.trim();

		// Check if the email contains 'acropolis.in'
		if (!emailValue.endsWith('@acropolis.in')) {
			alert("Email must contain 'acropolis.in'");
			emailInput.focus();
			return false;
		}

		return true;
	}
</script>
</head>
<body class="b">
	<div class="wrapper">
		<header>Forgot Password</header>
		<form method="post" action="ForgetPassword"
			onsubmit="return validateEmail();">
			<div class="field email">
				<div class="input-area">
					<input type="email" id="clg_email" name="clg_email"
						placeholder="College Email" required>
				</div>
			</div>
			<input type="submit" value="Reset Password">
		</form>
	</div>
</body>
</html>
