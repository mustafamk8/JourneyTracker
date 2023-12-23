package com.resume.admin.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.model.AdminModel;


@WebServlet("/DeleteStudent")
public class DeleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String scholar_no = request.getParameter("id");
		AdminModel dao = new AdminModel();
		boolean f = dao.deleteStudent(scholar_no);
		
		HttpSession session = request.getSession();
		
		if(f) {
			session.setAttribute("message", "student deleted successfully");
			response.sendRedirect("admin/allStudents.jsp");
		}else {
			session.setAttribute("message", "something wrong student not deleted");
			response.sendRedirect("admin/allStudents.jsp");
		}
		
	}

}
