package com.resume.student.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.bean.Curricular;
import com.resume.bean.Skill;
import com.resume.model.StudentModel;


@WebServlet("/UpdateCurricular")
public class UpdateCurricular extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		String scholar = request.getParameter("sid");
		
		StudentModel model = new StudentModel();
		Curricular cur = model.getCurricularById(id,scholar);
		
		RequestDispatcher rd = request.getRequestDispatcher("updateCurricular.jsp");
		request.setAttribute("curri", cur);
		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Integer id = Integer.parseInt(request.getParameter("id"));
		String scholar = request.getParameter("scholar");
		String curri = request.getParameter("curri");
		
		Curricular c  = new Curricular(scholar, curri);
		StudentModel model = new StudentModel();
		int i = model.updateCurricularDetails(c,id);
		
		HttpSession session = request.getSession();
		if(i!=0) {
			session.setAttribute("message", "Curricular updated Successfully");
			response.sendRedirect("allCurricular.jsp");
		}else {
			session.setAttribute("message", "Something went wrong");
			response.sendRedirect("allCurricular.jsp");
		}
	
		
	}

}
