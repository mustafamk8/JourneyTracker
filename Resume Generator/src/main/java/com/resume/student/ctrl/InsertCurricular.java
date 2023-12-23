package com.resume.student.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.bean.Curricular;
import com.resume.bean.Skill;
import com.resume.model.StudentModel;


@WebServlet("/InsertCurricular")
public class InsertCurricular extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String scholar = request.getParameter("scholar");
		String curri = request.getParameter("curri");
		
		Curricular c = new Curricular(scholar, curri);
		
		StudentModel model = new StudentModel();
		int i = model.insertCurricularDetail(c);
		
		HttpSession session = request.getSession();
		if(i!=0) {
			session.setAttribute("message", "Curricular added Successfully");
			response.sendRedirect("addCurricular.jsp");
		}else {
			session.setAttribute("message", "Something went wrong");
			response.sendRedirect("addCurricular.jsp");
		}
	}

}
