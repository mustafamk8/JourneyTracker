package com.resume.student.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.bean.Achievement;
import com.resume.bean.Skill;
import com.resume.model.StudentModel;


@WebServlet("/UpdateAchievement")
public class UpdateAchievement extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		String scholar = request.getParameter("sid");
		
		
		StudentModel model = new StudentModel();
		Achievement achieve = model.getAchievementById(id,scholar);
		
		RequestDispatcher rd = request.getRequestDispatcher("updateAchievement.jsp");
		request.setAttribute("achieve", achieve);
		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		String scholar = request.getParameter("scholar");
		String achieve = request.getParameter("achieve");
		
		Achievement a = new Achievement(scholar, achieve);
		
		StudentModel model = new StudentModel();
		int i = model.updateAchievementDetails(a,id);
		
		HttpSession session = request.getSession();
		if(i!=0) {
			session.setAttribute("message", "Achievement updated Successfully");
			response.sendRedirect("allAchievement.jsp");
		}else {
			session.setAttribute("message", "Something went wrong");
			response.sendRedirect("allAchievement.jsp");
		}
		
	}

}
