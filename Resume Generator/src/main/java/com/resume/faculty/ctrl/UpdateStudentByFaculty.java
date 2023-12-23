package com.resume.faculty.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.resume.bean.StudentPersonel;
import com.resume.model.AdminModel;
import com.resume.model.FacultyModel;

/**
 * Servlet implementation class UpdateStudentByFaculty
 */
@WebServlet("/UpdateStudentByFaculty")
public class UpdateStudentByFaculty extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String sid = request.getParameter("sid");
		AdminModel model = new AdminModel();
		StudentPersonel st = model.getStudentByScholar(sid);
		System.out.println("admin studentByScholar : " + st);
		
		RequestDispatcher rd = request.getRequestDispatcher("faculty/updateStudentInfo.jsp");
		request.setAttribute("student", st);
		rd.forward(request, response);
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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

		String st_10th_board = request.getParameter("st_10th_board");
		String st_tenth_school = request.getParameter("st_tenth_school");
		Double st_tenth_marks = Double.parseDouble(request.getParameter("st_tenth_marks"));
		String st_12th_board = request.getParameter("st_12th_board");
		String st_12th_schhol = request.getParameter("st_12th_schhol");
		Double st_12th_marks = Double.parseDouble(request.getParameter("st_12th_marks"));
		String st_backlog = request.getParameter("st_backlog");
		Double st_current_cgpa = Double.parseDouble(request.getParameter("st_current_cgpa"));

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
		s.setTenthBoardName(st_10th_board);
		s.setTenthSchoolName(st_tenth_school);
		s.setTenthMarks(st_tenth_marks);
		s.setTwelfthBoardName(st_12th_board);
		s.setTwelfthSchoolName(st_12th_schhol);
		s.setTwelfthMarks(st_12th_marks);
		s.setCollegeBacklog(st_backlog);
		s.setCollegeCgpa(st_current_cgpa);

		System.out.println("post update student : "+s);
		
		FacultyModel model = new FacultyModel();
		int i = model.updateStudentAllDetail(s);

		HttpSession session = request.getSession();
		if (i != 0) {
			session.setAttribute("message", "Details Updated");
			response.sendRedirect("faculty/allStudents.jsp");
		} else {
			session.setAttribute("message", "Something went wrong");
			response.sendRedirect("faculty/allStudents.jsp");
		}

	}

}
