package com.resume.student.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.bean.Skill;
import com.resume.model.StudentModel;


@WebServlet("/InsertSkill")
public class InsertSkill extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String scholar = request.getParameter("scholar");
		String skill = request.getParameter("skill");
		
		Skill s = new Skill(scholar, skill);
		StudentModel model = new StudentModel();
		int i = model.insertSkillDetail(s);
		
		HttpSession session = request.getSession();
		if(i!=0) {
			session.setAttribute("message", "Skill added Successfully");
			response.sendRedirect("addSkill.jsp");
		}else {
			session.setAttribute("message", "Something went wrong");
			response.sendRedirect("addSkill.jsp");
		}
		
	}

}
