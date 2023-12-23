package com.resume.student.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SubmitRole")
public class SubmitRole extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String role = request.getParameter("role");
		System.out.println(role);
		switch (role) {
        case "Student":
        	response.sendRedirect("studentLogin.jsp");
            break;
        case "Faculty":
        	response.sendRedirect("faculty/facultyLogin.jsp");
            break;
        case "Admin":
        	response.sendRedirect("admin/adminLogin.jsp");
            break;
        default:
            // Handle the default case or display an error message
            break;
	}
	}
}
