package com.resume.faculty.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.bean.StudentPersonel;
import com.resume.model.AdminModel;

@WebServlet("/ViewFullDetail")
public class ViewFullDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String scholar = request.getParameter("sid");
		AdminModel admindao = new AdminModel();
		StudentPersonel s = admindao.getStudentByScholar(scholar);
		HttpSession session = request.getSession();
		if (s != null) {
			session.setAttribute("list", s);
			response.sendRedirect("faculty/viewStudentDetails.jsp");
		}
	}

}
