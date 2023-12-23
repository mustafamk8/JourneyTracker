package com.resume.student.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.bean.Internship;
import com.resume.model.StudentModel;

/**
 * Servlet implementation class InsertInternship
 */
@WebServlet("/InsertInternship")
public class InsertInternship extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String scholar = request.getParameter("scholar");
		String training = request.getParameter("training");
		String org = request.getParameter("org");
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		String certi = request.getParameter("certi");
		String desc = request.getParameter("desc");
		
		Internship j = new Internship(scholar, training, org, start, end, certi,desc);
		StudentModel model= new StudentModel();
		int i = model.insertInternshipDetail(j);
		
		HttpSession session = request.getSession();
		if(i!=0) {
			session.setAttribute("message", "Internship added Successfully");
			response.sendRedirect("addInternship.jsp");
		}else {
			session.setAttribute("message", "Something went wrong");
			response.sendRedirect("addInternship.jsp");
		}
		
		
	}

}
