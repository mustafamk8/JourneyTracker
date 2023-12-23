package com.resume.faculty.ctrl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.bean.Skill;
import com.resume.bean.StudentPersonel;
import com.resume.model.AdminModel;
import com.resume.model.FacultyModel;

@WebServlet("/SearchStudentBySkill")
public class SearchStudentBySkill extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String search = request.getParameter("skill");

		FacultyModel model = new FacultyModel();
		List<Skill> list = model.getStudentBySkill(search);

		HttpSession session = request.getSession();

		if (list.size() == 0) {
			session.setAttribute("message", "Student Not Found");
			response.sendRedirect("faculty/allStudents.jsp");
		} else {
			session.setAttribute("list", list);
			response.sendRedirect("faculty/studentlist.jsp");
		}

	}

}
