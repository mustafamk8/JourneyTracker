package com.resume.student.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.model.AdminModel;
import com.resume.model.StudentModel;

@WebServlet("/DeleteStudentAchievement")
public class DeleteStudentAchievement extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String ach_id = request.getParameter("id");
		StudentModel dao = new StudentModel();
		boolean f = dao.deleteStudentAchievement(ach_id);

		HttpSession session = request.getSession();

		if (f) {
			session.setAttribute("message", "achievement deleted successfully");
			response.sendRedirect("allAchievement.jsp");
		} else {
			session.setAttribute("message", "something wrong achievement not deleted");
			response.sendRedirect("allAchievement.jsp");
		}

	}

}
