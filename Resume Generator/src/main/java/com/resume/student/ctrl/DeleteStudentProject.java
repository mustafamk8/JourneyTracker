package com.resume.student.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.model.StudentModel;

@WebServlet("/DeleteStudentProject")
public class DeleteStudentProject extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String pid = request.getParameter("id");
		StudentModel dao = new StudentModel();
		boolean f = dao.deleteStudentProject(pid);

		HttpSession session = request.getSession();

		if (f) {
			session.setAttribute("message", "Project deleted successfully");
			response.sendRedirect("allProjects.jsp");
		} else {
			session.setAttribute("message", "something wrong Project not deleted");
			response.sendRedirect("allProjects.jsp");
		}

	}

}
