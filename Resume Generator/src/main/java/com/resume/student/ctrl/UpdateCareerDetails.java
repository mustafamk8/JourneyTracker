package com.resume.student.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.bean.Career;
import com.resume.model.StudentModel;


@WebServlet("/UpdateCareerDetails")
public class UpdateCareerDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String st_scholar  = request.getParameter("scholar");
		String st_career  = request.getParameter("st_career");
		String strength1  = request.getParameter("strength1");
		String strength2  = request.getParameter("strength2");
		String hobby1  = request.getParameter("hobby1");
		String hobby2  = request.getParameter("hobby2");
		String weakness1  = request.getParameter("weakness1");
		String weakness2  = request.getParameter("weakness2");

		Career c = new Career(st_scholar, st_career, strength1, strength2, hobby1, hobby2, weakness1, weakness2);
		
		
		StudentModel model = new StudentModel();
		int i = model.updateCareerDetails(c);
		
		HttpSession session = request.getSession();
		if(i!=0) {
			session.setAttribute("message", "Student Academic Career Details Updated Successfully");
			response.sendRedirect("updateCarrerDetails.jsp");
		}else {
			session.setAttribute("message", "Something went wrong");
			response.sendRedirect("updateCarrerDetails.jsp");
		}
		
	}

}
