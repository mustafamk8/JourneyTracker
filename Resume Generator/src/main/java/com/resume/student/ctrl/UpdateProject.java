package com.resume.student.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.bean.Project;
import com.resume.model.StudentModel;


@WebServlet("/UpdateProject")
public class UpdateProject extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Integer pid = Integer.parseInt(request.getParameter("pid"));
		String scholar = request.getParameter("sid");
		
		StudentModel model = new StudentModel();
		Project project = model.getProjectById(pid,scholar);
		
		RequestDispatcher rd = request.getRequestDispatcher("updateProject.jsp");
		request.setAttribute("project", project);
		rd.forward(request, response);
		
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Integer pid = Integer.parseInt(request.getParameter("pid"));
		String scholar = request.getParameter("scholar");
		String name = request.getParameter("name");
		String desc = request.getParameter("desc");
		String role = request.getParameter("role");
		Integer duration = Integer.parseInt(request.getParameter("duration"));
		String url = request.getParameter("url");
		
		System.out.println("pid : "+pid);
		
		Project p = new Project(scholar, name, desc, role, duration, url);
		StudentModel model = new StudentModel();
		int i = model.updateProjectDetails(p,pid);
		
		HttpSession session = request.getSession();
		if(i!=0) {
			session.setAttribute("message", "Project updated Successfully");
			response.sendRedirect("allProjects.jsp");
		}else {
			session.setAttribute("message", "Something went wrong");
			response.sendRedirect("allProjects.jsp");
		}
		
		
	}
	
	

}
