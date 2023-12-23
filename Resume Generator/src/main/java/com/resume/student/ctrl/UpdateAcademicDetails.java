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

@WebServlet("/UpdateAcademicDetails")
public class UpdateAcademicDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String scholar_no  = request.getParameter("st_scholarno");
		String st_10th_board  = request.getParameter("st_10th_board");
		String st_tenth_school  = request.getParameter("st_tenth_school");
		Double st_tenth_marks  = Double.parseDouble(request.getParameter("st_tenth_marks"));
		String st_12th_board  = request.getParameter("st_12th_board");
		String st_12th_schhol  = request.getParameter("st_12th_schhol");
		Double st_12th_marks  = Double.parseDouble(request.getParameter("st_12th_marks"));
		String st_backlog  = request.getParameter("st_backlog");
		Double st_current_cgpa  =Double.parseDouble(request.getParameter("st_current_cgpa"));
		
		StudentPersonel s = new StudentPersonel(scholar_no, st_10th_board, st_tenth_school, st_tenth_marks, st_12th_board, st_12th_schhol, st_12th_marks, st_backlog, st_current_cgpa);
		
		StudentModel model = new StudentModel();
		int i = model.updateStudentAcademics(s);
		
		
		HttpSession session = request.getSession();
		if(i!=0) {
			session.setAttribute("message", "Student Academic detaiks Updated Successfully");
			response.sendRedirect("UpdateAcademicInfo.jsp");
		}else {
			session.setAttribute("message", "Something went wrong");
			response.sendRedirect("UpdateAcademicInfo.jsp");
		}
		
	}

}
