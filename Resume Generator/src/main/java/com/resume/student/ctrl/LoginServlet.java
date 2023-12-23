package com.resume.student.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.bean.StudentPersonel;
import com.resume.model.StudentModel;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String st_scholar = request.getParameter("st_scholar");
		String password = request.getParameter("st_password");
		
		StudentPersonel s = new StudentPersonel();
		s.setScholarNo(st_scholar);
		s.setStPassword(password);
		StudentModel model = new StudentModel();
		StudentPersonel student = model.createLogin(st_scholar,password);
		HttpSession session = request.getSession();

		if (student == null) {
			session.setAttribute("message", "invalid username or password");
			response.sendRedirect("studentLogin.jsp");
		} else {
			session.setAttribute("current-user", student);
			response.sendRedirect("student_dashboard.jsp");

		}
				
		}
		
	}


