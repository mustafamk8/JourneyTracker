package com.resume.student.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.bean.Project;
import com.resume.model.StudentModel;


@WebServlet("/InsertProject")
public class InsertProject extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String scholar = request.getParameter("scholar");
		String name = request.getParameter("ProjectName");
		String desc = request.getParameter("ProjectDesc");
		String role = request.getParameter("ProjectRole");
		Integer duration = Integer.parseInt(request.getParameter("ProjectDuration"));
		String url = request.getParameter("ProjectLink");
		
		Project p = new Project(scholar, name, desc, role, duration, url) ;
		
		StudentModel model = new StudentModel();
		int i = model.insertProjectDetail(p);
		
		HttpSession session = request.getSession();
		if(i!=0) {
			session.setAttribute("message", "Project added Successfully");
			response.sendRedirect("addProject.jsp");
		}else {
			session.setAttribute("message", "Something went wrong");
			response.sendRedirect("addProject.jsp");
		}
		
		
	}

}
