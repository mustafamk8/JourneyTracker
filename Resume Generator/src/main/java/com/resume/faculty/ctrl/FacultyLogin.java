package com.resume.faculty.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.bean.Faculty;
import com.resume.model.FacultyModel;


@WebServlet("/FacultyLogin")
public class FacultyLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String pwd = request.getParameter("password");
		
		Faculty f = new Faculty();
	
		FacultyModel model = new FacultyModel();
		Faculty faculty = model.createLogin(email,pwd);
		
		HttpSession session = request.getSession();
		if(faculty!=null) {
			session.setAttribute("current-user", faculty);
			response.sendRedirect("faculty/faculty_dashboard.jsp");
		}else {
			session.setAttribute("message", "Invalid Credentials");
			response.sendRedirect("faculty/facultyLogin.jsp");
		}
		
	}

}
