package com.resume.student.ctrl;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.resume.model.StudentModel;

@WebServlet("/ForgetPassword")
public class ForgetPasswordServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("clg_email");

		if (isValidEmail(email)) {
			// Generate a temporary password
			String temporaryPassword = generateTemporaryPassword();
			System.out.print(temporaryPassword);
			StudentModel model = new StudentModel();
			int i = model.updatePasswordByEmail(email, temporaryPassword);

			// Send the temporary password to the student's email
			if (i != 0) {
				sendTemporaryPassword(email, temporaryPassword);
			}

			// Redirect to a confirmation page
			response.sendRedirect("passwordResetConfirmation.jsp");
		}
	}

	private boolean isValidEmail(String email) {
		if (email.endsWith("acropolis.in")) {
			return true;
		}
		return false;
	}

	private String generateTemporaryPassword() {
		// Generate a random temporary password (You can implement a more secure method)
		Random random = new Random();
		int length = 8; // Adjust the length as needed
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder password = new StringBuilder();

		for (int i = 0; i < length; i++) {
			password.append(characters.charAt(random.nextInt(characters.length())));
		}

		return password.toString();
	}

	private void sendTemporaryPassword(String recipient, String temporaryPassword) {
		final String senderEmail = "palashshah606@gmail.com";
		final String senderPassword = "wbcj oznd vxyp ftkz";

		// Set up email properties
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		// Create a session with the email server
		Session session = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(senderEmail, senderPassword);
			}
		});

		try {
			// Create a message
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(senderEmail));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject("Password Reset");
			message.setText("You must remember your password so keep it shorter but smarter...\n"
					+ "Your temporary password is: " + temporaryPassword
					+ "\n and you can now login using this password.");

			// Send the email
			Transport.send(message);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}
