package com.resume.admin.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.resume.bean.Admin;
import com.resume.model.AdminModel;


@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = request.getParameter("admin_username");
		String pass = request.getParameter("admin_password");
		
		Admin a = new Admin(user,pass);
		AdminModel model = new AdminModel();
		Admin admin = model.checkLogin(user,pass);
		
		HttpSession session = request.getSession();
		if(admin!=null) {
			session.setAttribute("current-user", admin);
			response.sendRedirect("admin/admin_dashboard.jsp");
		}else {
			session.setAttribute("message", "Invalid Credentials");
			response.sendRedirect("admin/adminLogin.jsp");
		}
	}

}
