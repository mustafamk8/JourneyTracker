package com.resume.faculty.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.bean.Faculty;
import com.resume.model.FacultyModel;

@WebServlet("/updatePasswordByEmail")
public class updatePasswordByEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String email = request.getParameter("scholar");
		String newPassword = request.getParameter("newPassword");

		Faculty f = new Faculty();
		f.setEmail(email);
		f.setPassword(newPassword);
		FacultyModel model = new FacultyModel();
		int i = model.updatePasswordByEmail(email, newPassword);

		HttpSession session = request.getSession();

		if (i == 0) {
			session.setAttribute("message", "Password Not Updated");
			response.sendRedirect("faculty/update_password.jsp");
		} else {
			session.setAttribute("message", "Password Updated");
			response.sendRedirect("faculty/faculty_dashboard.jsp");

		}

	}

}