package com.resume.student.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.bean.Achievement;
import com.resume.model.StudentModel;

@WebServlet("/InsertAchievement")
public class InsertAchievement extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String scholar = request.getParameter("scholar");
		String achieve = request.getParameter("achieve");
		
		Achievement a = new Achievement(scholar, achieve);
		StudentModel model = new StudentModel();
		int i = model.insertAchievementDetail(a);
		
		HttpSession session = request.getSession();
		if(i!=0) {
			session.setAttribute("message", "Achievement Details inserted Successfully");
			response.sendRedirect("addAchievement.jsp");
		}else {
			session.setAttribute("message", "Something went wrong");
			response.sendRedirect("addAchievement.jsp");
		}
		
	}

}
