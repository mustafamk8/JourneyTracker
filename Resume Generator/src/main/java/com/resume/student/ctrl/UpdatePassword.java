package com.resume.student.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.bean.StudentPersonel;
import com.resume.model.StudentModel;

@WebServlet("/UpdatePassword")
public class UpdatePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String scholar = request.getParameter("scholar");
		String newPassword = request.getParameter("newPassword");

		StudentPersonel s = new StudentPersonel();
		s.setScholarNo(scholar);
		s.setStPassword(newPassword);
		StudentModel model = new StudentModel();
		int i = model.updatePassword(scholar, newPassword);

		HttpSession session = request.getSession();

		if (i == 0) {
			session.setAttribute("message", "Password Not Updated");
			response.sendRedirect("updatePassword.jsp");
		} else {
			session.setAttribute("message", "Password Updated");
			response.sendRedirect("updatePassword.jsp");

		}

	}

}
