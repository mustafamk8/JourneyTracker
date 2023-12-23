package com.resume.student.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.bean.Certificates;
import com.resume.model.StudentModel;


@WebServlet("/UploadCertificate")
public class UploadCertificate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String scholar = request.getParameter("scholar");
		String cerName = request.getParameter("cer_name");
		String cerPlat = request.getParameter("cer_plat");
		String cerDate = request.getParameter("cer_date");
		String cerUrl = request.getParameter("cer_url");
		
		Certificates c = new Certificates(scholar, cerName, cerPlat, cerDate, cerUrl);
		StudentModel model = new StudentModel();
		int i = model.insertCertificateDetail(c);
		
		HttpSession session = request.getSession();
		if(i!=0) {
			session.setAttribute("message", "Certificate added Successfully");
			response.sendRedirect("addCertificate.jsp");
		}else {
			session.setAttribute("message", "Something went wrong");
			response.sendRedirect("addCertificate.jsp");
		}
		
	}

}
