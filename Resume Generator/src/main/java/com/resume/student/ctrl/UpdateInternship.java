package com.resume.student.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.bean.Internship;
import com.resume.bean.Project;
import com.resume.model.StudentModel;


@WebServlet("/UpdateInternship")
public class UpdateInternship extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		String scholar = request.getParameter("sid");
		
		StudentModel model = new StudentModel();
		Internship inter = model.getInternshipById(id,scholar);
		
		RequestDispatcher rd = request.getRequestDispatcher("updateInternship.jsp");
		request.setAttribute("inter", inter);
		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer id = Integer.parseInt(request.getParameter("id"));
		String scholar = request.getParameter("scholar");
		String training = request.getParameter("training");
		String org = request.getParameter("org");
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		String certi = request.getParameter("certi");
		String desc = request.getParameter("desc");
		
		Internship j = new Internship(scholar, training, org, start, end, certi,desc);
		StudentModel model = new StudentModel();
		int i = model.updateInternshipDetails(j,id);
		
		HttpSession session = request.getSession();
		if(i!=0) {
			session.setAttribute("message", "Internship updated Successfully");
			response.sendRedirect("allInternships.jsp");
		}else {
			session.setAttribute("message", "Something went wrong");
			response.sendRedirect("allInternships.jsp");
		}
		
		
		
	}

}
