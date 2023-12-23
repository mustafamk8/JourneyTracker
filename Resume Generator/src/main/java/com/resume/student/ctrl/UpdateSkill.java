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
import com.resume.bean.Skill;
import com.resume.model.StudentModel;


@WebServlet("/UpdateSkill")
public class UpdateSkill extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		String scholar = request.getParameter("sid");
		
		StudentModel model = new StudentModel();
		Skill skill = model.getSkillById(id,scholar);
		
		RequestDispatcher rd = request.getRequestDispatcher("updateSkill.jsp");
		request.setAttribute("skill", skill);
		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		Integer id = Integer.parseInt(request.getParameter("id"));
		String scholar = request.getParameter("scholar");
		String skillName = request.getParameter("skill");
		
		Skill s = new Skill(scholar, skillName);
		StudentModel model = new StudentModel();
		int i = model.updateSkillDetails(s,id);
		
		HttpSession session = request.getSession();
		if(i!=0) {
			session.setAttribute("message", "Skill updated Successfully");
			response.sendRedirect("allSkill.jsp");
		}else {
			session.setAttribute("message", "Something went wrong");
			response.sendRedirect("allSkill.jsp");
		}
		
	}

}
