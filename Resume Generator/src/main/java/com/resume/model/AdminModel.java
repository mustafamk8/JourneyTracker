package com.resume.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.resume.bean.Admin;
import com.resume.bean.Faculty;
import com.resume.bean.StudentPersonel;

public class AdminModel {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/resume", "root", "root");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public Admin checkLogin(String user, String pass) {
		// TODO Auto-generated method stub
		Admin a = null;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "select * from admin where username =? and password=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				a = new Admin();
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setUsername(rs.getString(3));
				a.setPassword(rs.getString(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return a;
	}
	
	public List<StudentPersonel> getAllStudents(){
		List<StudentPersonel> list = new ArrayList<StudentPersonel>();
		StudentPersonel s = null;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "select * from student_basic";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			int i =0;
			while (rs.next()) {
				s = new StudentPersonel();
				s.setScholarNo(rs.getString(1));
				s.setStName(rs.getString(2));
				s.setStPassword(rs.getString(3));
				s.setStGender(rs.getString(4));
				s.setStDept(rs.getString(5));
				s.setStSem(rs.getInt(6));
				s.setStSection(rs.getInt(7));
				s.setStCollegeMail(rs.getString(8));
				s.setStPersonelMail(rs.getString(9));
				s.setStGithub(rs.getString(10));
				s.setStLinkedin(rs.getString(11));
				s.setStPhone(rs.getString(12));
				s.setStEnroll(rs.getString(13));
				s.setStPhoto(rs.getBlob(14));
				s.setStAddress(rs.getString(15));
				s.setStPhotoName(rs.getString(16));
				s.setTenthBoardName(rs.getString(17));
				s.setTenthSchoolName(rs.getString(18));
				s.setTenthMarks(rs.getDouble(19));
				s.setTwelfthBoardName(rs.getString(20));
				s.setTwelfthSchoolName(rs.getString(21));
				s.setTwelfthMarks(rs.getDouble(22));
				s.setCollegeBacklog(rs.getString(23));
				s.setCollegeCgpa(rs.getDouble(24));
				s.setStDob(rs.getString(25));
				System.out.println(s.getStDept()+ " "+ i++);
				list.add(s);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public StudentPersonel getStudentByScholar(String sid) {
		// TODO Auto-generated method stub
		StudentPersonel s = null;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "select * from student_basic where scholar_no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, sid);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				s = new StudentPersonel();
				s.setScholarNo(rs.getString(1));
				s.setStName(rs.getString(2));
				s.setStPassword(rs.getString(3));
				s.setStGender(rs.getString(4));
				s.setStDept(rs.getString(5));
				s.setStSem(rs.getInt(6));
				s.setStSection(rs.getInt(7));
				s.setStCollegeMail(rs.getString(8));
				s.setStPersonelMail(rs.getString(9));
				s.setStGithub(rs.getString(10));
				s.setStLinkedin(rs.getString(11));
				s.setStPhone(rs.getString(12));
				s.setStEnroll(rs.getString(13));
				s.setStPhoto(rs.getBlob(14));
				s.setStAddress(rs.getString(15));
				s.setStPhotoName(rs.getString(16));
				s.setTenthBoardName(rs.getString(17));
				s.setTenthSchoolName(rs.getString(18));
				s.setTenthMarks(rs.getDouble(19));
				s.setTwelfthBoardName(rs.getString(20));
				s.setTwelfthSchoolName(rs.getString(21));
				s.setTwelfthMarks(rs.getDouble(22));
				s.setCollegeBacklog(rs.getString(23));
				s.setCollegeCgpa(rs.getDouble(24));
				s.setStDob(rs.getString(25));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}

	public int updateStudentAllDetail(StudentPersonel s) {
		int i = 0;
		Connection con = null;

		try {
			con = getConnection();
			String sql = "update student_basic set st_address=?, st_enroll=?, st_dob=?,st_college_mail=?, st_dept=?, st_gender=?, st_github=?, st_linkedin=?,st_name=?, st_personel_mail=?, st_phone_no=?, st_sec=?, st_sem=?,tenth_board_name=?, tenth_school_name=?, tenth_marks=?,twelfth_board_name=?, twelfth_school_name=?, tewlfth_marks=?, clg_backlog=?, clg_cgpa=? where scholar_no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, s.getStAddress());
			ps.setString(2, s.getStEnroll());
			ps.setString(3, s.getStDob());
			ps.setString(4, s.getStCollegeMail());
			ps.setString(5, s.getStDept());
			ps.setString(6, s.getStGender());
			ps.setString(7, s.getStGithub());
			ps.setString(8, s.getStLinkedin());
			ps.setString(9, s.getStName());
			ps.setString(10, s.getStPersonelMail());
			ps.setString(11, s.getStPhone());
			ps.setInt(12, s.getStSection());
			ps.setInt(13, s.getStSem());
			ps.setString(14, s.getTenthBoardName());
			ps.setString(15, s.getTenthSchoolName());
			ps.setDouble(16, s.getTenthMarks());
			ps.setString(17, s.getTwelfthBoardName());
			ps.setString(18, s.getTwelfthSchoolName());
			ps.setDouble(19, s.getTwelfthMarks());
			ps.setString(20, s.getCollegeBacklog());
			ps.setDouble(21, s.getCollegeCgpa());
			ps.setString(22, s.getScholarNo());

			i = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}
	
	
	public List<Faculty> getAllFaculty(){
		List<Faculty> list = new ArrayList<Faculty>();
		Faculty f = null;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "select * from faculty";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				f = new Faculty();
				f.setEmail(rs.getString(1));
				f.setName(rs.getString(2));
				f.setPassword(rs.getString(3));
				f.setDepartment(rs.getString(4));
				
				list.add(f);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List getAllStudentsDept(){
		List<Integer> list = new ArrayList<Integer>();
		StudentPersonel s = null;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "select * from student_basic";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			int cse = 0,it=0,csit=0,csds=0,aiml=0,iot=0,other=0;
			while (rs.next()) {
				s = new StudentPersonel();
				s.setScholarNo(rs.getString(1));
				s.setStName(rs.getString(2));
				s.setStPassword(rs.getString(3));
				s.setStGender(rs.getString(4));
				s.setStDept(rs.getString(5));
				s.setStSem(rs.getInt(6));
				s.setStSection(rs.getInt(7));
				s.setStCollegeMail(rs.getString(8));
				s.setStPersonelMail(rs.getString(9));
				s.setStGithub(rs.getString(10));
				s.setStLinkedin(rs.getString(11));
				s.setStPhone(rs.getString(12));
				s.setStEnroll(rs.getString(13));
				s.setStPhoto(rs.getBlob(14));
				s.setStAddress(rs.getString(15));
				s.setStPhotoName(rs.getString(16));
				s.setTenthBoardName(rs.getString(17));
				s.setTenthSchoolName(rs.getString(18));
				s.setTenthMarks(rs.getDouble(19));
				s.setTwelfthBoardName(rs.getString(20));
				s.setTwelfthSchoolName(rs.getString(21));
				s.setTwelfthMarks(rs.getDouble(22));
				s.setCollegeBacklog(rs.getString(23));
				s.setCollegeCgpa(rs.getDouble(24));
				s.setStDob(rs.getString(25));
				if(s.getStDept().equals("CSE")) {
					cse++;
				}else if(s.getStDept().equals("IT")) {
					it++;
				}else if(s.getStDept().equals("CSIT")) {
					csit++;
				}else if(s.getStDept().equals("CSE-DS")) {
					csds++;
				}else if(s.getStDept().equals("AIML")) {
					aiml++;
				}else if(s.getStDept().equals("IOT")) {
					iot++;
				}else {
					other++;
				}
			}
			list.add(cse);
			list.add(it);
			list.add(csit);
			list.add(csds);
			list.add(aiml);
			list.add(iot);
			list.add(other);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<StudentPersonel> getStudentDetail(String search) {
		// TODO Auto-generated method stub
		List<StudentPersonel> list = new ArrayList<>();
		StudentPersonel s = null;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "select * from student_basic where scholar_no=? or st_name=? or st_enroll=? or st_college_mail=?";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, search);
			ps.setString(2, search);
			ps.setString(3, search);
			ps.setString(4, search);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				s = new StudentPersonel();
				s.setScholarNo(rs.getString(1));
				s.setStName(rs.getString(2));
				s.setStPassword(rs.getString(3));
				s.setStGender(rs.getString(4));
				s.setStDept(rs.getString(5));
				s.setStSem(rs.getInt(6));
				s.setStSection(rs.getInt(7));
				s.setStCollegeMail(rs.getString(8));
				s.setStPersonelMail(rs.getString(9));
				s.setStGithub(rs.getString(10));
				s.setStLinkedin(rs.getString(11));
				s.setStPhone(rs.getString(12));
				s.setStEnroll(rs.getString(13));
				s.setStPhoto(rs.getBlob(14));
				s.setStAddress(rs.getString(15));
				s.setStPhotoName(rs.getString(16));
				s.setTenthBoardName(rs.getString(17));
				s.setTenthSchoolName(rs.getString(18));
				s.setTenthMarks(rs.getDouble(19));
				s.setTwelfthBoardName(rs.getString(20));
				s.setTwelfthSchoolName(rs.getString(21));
				s.setTwelfthMarks(rs.getDouble(22));
				s.setCollegeBacklog(rs.getString(23));
				s.setCollegeCgpa(rs.getDouble(24));
				s.setStDob(rs.getString(25));
				
				list.add(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public boolean deleteStudent(String scholar) {
		boolean f = false;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "delete from student_basic where scholar_no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, scholar);
			int i = ps.executeUpdate();
			if(i==1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	public boolean deleteFaculty(String mail) {
		boolean f = false;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "delete from faculty where email=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, mail);
			int i = ps.executeUpdate();
			if(i==1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
}
