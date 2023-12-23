package com.resume.admin.ctrl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.bean.StudentPersonel;
import com.resume.model.AdminModel;


@WebServlet("/SearchStudent")
public class SearchStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String search = request.getParameter("studentName");
		
		AdminModel model = new AdminModel();
		List<StudentPersonel> list = model.getStudentDetail(search);
		
		HttpSession session = request.getSession();
		
		if(list.size()==0) {
			session.setAttribute("message", "Student Not Found");
			response.sendRedirect("admin/allStudents.jsp");
		}else {
			session.setAttribute("list", list);
			response.sendRedirect("admin/studentlist.jsp");
		}
		
	}

}
