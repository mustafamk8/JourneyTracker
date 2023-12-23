package com.resume.student.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.bean.Certificates;
import com.resume.bean.Project;
import com.resume.model.StudentModel;


@WebServlet("/UpdateCertificate")
public class UpdateCertificate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Integer cid = Integer.parseInt(request.getParameter("cid"));
		String scholar = request.getParameter("sid");
		
		StudentModel model = new StudentModel();
		Certificates certi = model.getCertificateById(cid);
		System.out.println("certi : "+certi);
		RequestDispatcher rd = request.getRequestDispatcher("updateCertificate.jsp");
		request.setAttribute("certi", certi);
		rd.forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Integer cid = Integer.parseInt(request.getParameter("cid"));
		String scholar = request.getParameter("scholar");
		String cerName = request.getParameter("cer_name");
		String cerPlat = request.getParameter("cer_plat");
		String cerDate = request.getParameter("cer_date");
		String cerUrl = request.getParameter("cer_url");
		
		Certificates c = new Certificates(scholar, cerName, cerPlat, cerDate, cerUrl);
		StudentModel model = new StudentModel();
		int i = model.updateCertificateDetails(c, cid);
		
		HttpSession session = request.getSession();
		if(i!=0) {
			session.setAttribute("message", "Cerificate updated Successfully");
			response.sendRedirect("allCertificates.jsp");
		}else {
			session.setAttribute("message", "Something went wrong");
			response.sendRedirect("allCertificates.jsp");
		}
	}

}
