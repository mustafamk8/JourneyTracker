package com.resume.student.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.bean.StudentPersonel;
import com.resume.model.StudentModel;

@WebServlet("/UpdateStudentPersonel")
@MultipartConfig
public class UpdateStudentPersonel extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String st_name = request.getParameter("st_name");
		
		String st_enroll = request.getParameter("st_enroll");
		String st_scholar = request.getParameter("st_scholar");
		String st_gender = request.getParameter("st_gender");
		String st_dept = request.getParameter("st_dept");
		Integer st_sem = Integer.parseInt(request.getParameter("st_sem"));
		Integer st_sec = Integer.parseInt(request.getParameter("st_sec"));
		String st_clgmail = request.getParameter("st_clgmail");
		String st_personalmail = request.getParameter("st_personalmail");
		String st_phone = request.getParameter("st_phone");
		String st_address = request.getParameter("st_address");
		String st_dob = request.getParameter("st_dob");
		String st_linkedin = request.getParameter("st_linkedin");
		String st_github = request.getParameter("st_github");
		
		StudentPersonel s = new StudentPersonel();		
		s.setScholarNo(st_scholar);
		s.setStEnroll(st_enroll);
		s.setStName(st_name);
		s.setStGender(st_gender);
		s.setStDept(st_dept);
		s.setStSection(st_sec);
		s.setStCollegeMail(st_clgmail);
		s.setStPersonelMail(st_personalmail);
		s.setStPhone(st_phone);
		s.setStAddress(st_address);
		s.setStDob(st_dob);
		s.setStLinkedin(st_linkedin);
		s.setStGithub(st_github);
		s.setStSem(st_sem);
		
		
		StudentModel model = new StudentModel();
		int i = model.updateStudentPersonelProfile(s);
		
		HttpSession session = request.getSession();
		if(i!=0) {
			session.setAttribute("message", "Student Profile Update Successfully");
			response.sendRedirect("updatePersonelDetails.jsp");
		}else {
			session.setAttribute("message", "Something went wrong");
			response.sendRedirect("updatePersonelDetails.jsp");
		}
		
		
		
		
		
	}

}
