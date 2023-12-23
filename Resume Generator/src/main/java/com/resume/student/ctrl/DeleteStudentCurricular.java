package com.resume.student.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.model.StudentModel;

@WebServlet("/DeleteStudentCurricular")
public class DeleteStudentCurricular extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String curri_id = request.getParameter("id");
		StudentModel dao = new StudentModel();
		boolean f = dao.deleteStudentcurricular(curri_id);

		HttpSession session = request.getSession();

		if (f) {
			session.setAttribute("message", "activity deleted successfully");
			response.sendRedirect("allCurricular.jsp");
		} else {
			session.setAttribute("message", "something wrong activity not deleted");
			response.sendRedirect("allCurricular.jsp");
		}

	}

}
