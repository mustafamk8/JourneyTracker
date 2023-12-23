package com.resume.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.resume.bean.Achievement;
import com.resume.bean.Career;
import com.resume.bean.Certificates;
import com.resume.bean.Curricular;
import com.resume.bean.Internship;
import com.resume.bean.Project;
import com.resume.bean.Skill;
import com.resume.bean.StudentPersonel;

public class StudentModel {

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

	public StudentPersonel createLogin(String scholar, String password) {
		// TODO Auto-generated method stub
		StudentPersonel s = null;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "select * from student_basic where scholar_no =? and st_password=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, scholar);
			ps.setString(2, password);
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

	public int insertCareerDetails(Career c) {
		// TODO Auto-generated method stub
		int i = 0;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "insert into career(sid,career_obj,strength1,strength2,hobby1,hobby2,weakness1,weakness2) values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, c.getsId());
			ps.setString(2, c.getCareerObj());
			ps.setString(3, c.getStrength1());
			ps.setString(4, c.getStrength2());
			ps.setString(5, c.getHobby1());
			ps.setString(6, c.getHobby2());
			ps.setString(7, c.getHobby1());
			ps.setString(8, c.getHobby2());

			i = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public Career getCareerDetails(String sId) {
		Career c = null;
		Connection con = null;
		try {
			con = getConnection();

			String sql = "select * from career where sid =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, sId);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				c = new Career();
				c.setCareerId(rs.getInt(1));
				c.setsId(rs.getString(2));
				c.setCareerObj(rs.getString(3));
				c.setStrength1(rs.getString(4));
				c.setStrength2(rs.getString(5));
				c.setHobby1(rs.getString(6));
				c.setHobby2(rs.getString(7));
				c.setWeakness1(rs.getString(8));
				c.setWeakness2(rs.getString(9));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

	public int updateCareerDetails(Career c) {
		int i = 0;
		Connection con = null;

		try {
			con = getConnection();
			String sql = "update career set career_obj=?, strength1=?, strength2=?,hobby1=?, hobby2=?, weakness1=?, weakness2=? where sid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, c.getCareerObj());
			ps.setString(2, c.getStrength1());
			ps.setString(3, c.getStrength2());
			ps.setString(4, c.getHobby1());
			ps.setString(5, c.getHobby2());
			ps.setString(6, c.getWeakness1());
			ps.setString(7, c.getWeakness2());
			ps.setString(8, c.getsId());

			i = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public int updateStudentPersonelProfile(StudentPersonel s) {
		// TODO Auto-generated method stub
		int i = 0;
		Connection con = null;

		try {
			con = getConnection();
			String sql = "update student_basic set st_address=?, st_enroll=?, st_dob=?,st_college_mail=?, st_dept=?, st_gender=?, st_github=?, st_linkedin=?, st_name=?, st_personel_mail=?, st_phone_no=?, st_sec=?, st_sem=? where scholar_no=?";
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
			ps.setString(14, s.getScholarNo());

			i = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public int updateStudentAcademics(StudentPersonel s) {
		int i = 0;
		Connection con = null;

		try {
			con = getConnection();
			String sql = "update student_basic set tenth_board_name=?, tenth_school_name=?, tenth_marks=?,twelfth_board_name=?, twelfth_school_name=?, tewlfth_marks=?, clg_backlog=?, clg_cgpa=? where scholar_no=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, s.getTenthBoardName());
			ps.setString(2, s.getTenthSchoolName());
			ps.setDouble(3, s.getTenthMarks());
			ps.setString(4, s.getTwelfthBoardName());
			ps.setString(5, s.getTwelfthSchoolName());
			ps.setDouble(6, s.getTwelfthMarks());
			ps.setString(7, s.getCollegeBacklog());
			ps.setDouble(8, s.getCollegeCgpa());
			ps.setString(9, s.getScholarNo());

			i = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public int insertProjectDetail(Project p) {
		int i = 0;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "insert into projects(sid,project_name,project_desc,project_role,project_duration,project_link) values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, p.getsId());
			ps.setString(2, p.getProjectName());
			ps.setString(3, p.getProjectDesc());
			ps.setString(4, p.getProjectRole());
			ps.setInt(5, p.getProjectDuration());
			ps.setString(6, p.getProjectLink());

			i = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public List<Project> getAllProjects(String sid) {

		List<Project> list = new ArrayList<Project>();
		Project p = null;
		Connection con = null;

		try {
			con = getConnection();

			String sql = "select * from projects where sid=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, sid);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				p = new Project();
				p.setProjectId(rs.getInt(1));
				p.setsId(rs.getString(2));
				p.setProjectName(rs.getString(3));
				p.setProjectDesc(rs.getString(4));
				p.setProjectRole(rs.getString(5));
				p.setProjectDuration(rs.getInt(6));
				p.setProjectLink(rs.getString(7));

				list.add(p);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public Project getProjectById(Integer pid, String sid) {
		// TODO Auto-generated method stub
		Project p = null;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "select * from projects where pid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, pid);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				p = new Project();
				p.setProjectId(rs.getInt(1));
				p.setsId(rs.getString(2));
				p.setProjectName(rs.getString(3));
				p.setProjectDesc(rs.getString(4));
				p.setProjectRole(rs.getString(5));
				p.setProjectDuration(rs.getInt(6));
				p.setProjectLink(rs.getString(7));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}

	public int updateProjectDetails(Project p, Integer pid) {
		int i = 0;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "update projects set sid=?,project_name=?,project_desc=?,project_role=?,project_duration=?,project_link=? where pid=?";
			PreparedStatement ps = con.prepareStatement(sql);

			System.out.println("update Project Model");
			ps.setString(1, p.getsId());
			ps.setString(2, p.getProjectName());
			ps.setString(3, p.getProjectDesc());
			ps.setString(4, p.getProjectRole());
			ps.setInt(5, p.getProjectDuration());
			ps.setString(6, p.getProjectLink());
			ps.setInt(7, pid);

			i = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public int insertCertificateDetail(Certificates c) {
		int i = 0;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "insert into certificates(sid,certi_name,certi_plateform,certi_completion_date,certi_url) values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, c.getsId());
			ps.setString(2, c.getCertiName());
			ps.setString(3, c.getCertiPlateform());
			ps.setString(4, c.getCertiCompletionDate());
			ps.setString(5, c.getCertiUrl());

			i = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public List<Certificates> getAllCertificates(String sid) {

		List<Certificates> list = new ArrayList<Certificates>();
		Certificates c = null;
		Connection con = null;

		try {
			con = getConnection();

			String sql = "select * from certificates where sid=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, sid);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				c = new Certificates();
				c.setCertiId(rs.getInt(1));
				c.setsId(rs.getString(2));
				c.setCertiName(rs.getString(3));
				c.setCertiPlateform(rs.getString(4));
				c.setCertiCompletionDate(rs.getString(5));
				c.setCertiUrl(rs.getString(6));
				list.add(c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public Certificates getCertificateById(Integer cid) {
		// TODO Auto-generated method stub
		Certificates c = null;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "select * from certificates where cid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cid);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				c = new Certificates();
				c.setCertiId(rs.getInt(1));
				c.setsId(rs.getString(2));
				c.setCertiName(rs.getString(3));
				c.setCertiPlateform(rs.getString(4));
				c.setCertiCompletionDate(rs.getString(5));
				c.setCertiUrl(rs.getString(6));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

	public int updateCertificateDetails(Certificates c, Integer cid) {
		// TODO Auto-generated method stub
		int i = 0;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "update certificates set sid=?, certi_name=?, certi_plateform=?, certi_completion_date=?, certi_url=? where cid=?";
			PreparedStatement ps = con.prepareStatement(sql);

			System.out.println("update Project Model");
			ps.setString(1, c.getsId());
			ps.setString(2, c.getCertiName());
			ps.setString(3, c.getCertiPlateform());
			ps.setString(4, c.getCertiCompletionDate());
			ps.setString(5, c.getCertiUrl());
			ps.setInt(6, cid);

			i = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public int insertInternshipDetail(Internship i) {
		int j = 0;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "insert into internship(sid,tr_name,org_name,tr_start_date,tr_end_date,tr_certi_url,tr_desc) values(?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, i.getsId());
			ps.setString(2, i.getTrName());
			ps.setString(3, i.getOrgName());
			ps.setString(4, i.getTrStartDate());
			ps.setString(5, i.getTrEndDate());
			ps.setString(6, i.getTrCerti());
			ps.setString(7, i.getTrDesc());

			j = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;
	}

	public Internship getInternshipById(Integer id, String sid) {
		// TODO Auto-generated method stub
		Internship i = null;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "select * from internship where tid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				i = new Internship();
				i.settId(rs.getInt(1));
				i.setTrName(rs.getString(2));
				i.setOrgName(rs.getString(3));
				i.setTrStartDate(rs.getString(4));
				i.setTrEndDate(rs.getString(5));
				i.setTrCerti(rs.getString(6));
				i.setsId(rs.getString(7));
				i.setTrDesc(rs.getString(8));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public List<Internship> getAllInternship(String sid) {

		List<Internship> list = new ArrayList<Internship>();
		Internship i = null;
		Connection con = null;

		try {
			con = getConnection();

			String sql = "select * from internship where sid=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, sid);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				i = new Internship();
				i.settId(rs.getInt(1));
				i.setTrName(rs.getString(2));
				i.setOrgName(rs.getString(3));
				i.setTrStartDate(rs.getString(4));
				i.setTrEndDate(rs.getString(5));
				i.setTrCerti(rs.getString(6));
				i.setsId(rs.getString(7));
				i.setTrDesc(rs.getString(8));
				list.add(i);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public int updateInternshipDetails(Internship i, Integer id) {
		// TODO Auto-generated method stub
		int j = 0;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "update internship set sid=?, tr_name=?, org_name=?, tr_start_date=?, tr_end_date=?,tr_certi_url=?,tr_desc=? where tid=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, i.getsId());
			ps.setString(2, i.getTrName());
			ps.setString(3, i.getOrgName());
			ps.setString(4, i.getTrStartDate());
			ps.setString(5, i.getTrEndDate());
			ps.setString(6, i.getTrCerti());
			ps.setString(7, i.getTrDesc());
			ps.setInt(8, id);

			j = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;
	}

	public int insertSkillDetail(Skill s) {
		int j = 0;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "insert into skill(sid, skill_name) values(?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, s.getsId());
			ps.setString(2, s.getSkillName());

			j = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;
	}

	public Skill getSkillById(Integer id, String sid) {
		// TODO Auto-generated method stub
		Skill s = null;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "select * from skill where skill_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				s = new Skill();
				s.setSkillId(rs.getInt(1));
				s.setsId(rs.getString(2));
				s.setSkillName(rs.getString(3));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}

	public List<Skill> getAllSkill(String sid) {

		List<Skill> list = new ArrayList<Skill>();
		Skill s = null;
		Connection con = null;

		try {
			con = getConnection();

			String sql = "select * from skill where sid=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, sid);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				s = new Skill();
				s.setSkillId(rs.getInt(1));
				s.setsId(rs.getString(2));
				s.setSkillName(rs.getString(3));
				list.add(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public int updateSkillDetails(Skill s, Integer id) {
		// TODO Auto-generated method stub
		int j = 0;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "update skill set sid=?, skill_name=? where skill_id=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, s.getsId());
			ps.setString(2, s.getSkillName());
			ps.setInt(3, id);

			j = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;
	}

	public int insertAchievementDetail(Achievement a) {
		int j = 0;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "insert into achievement(sid, achieve_name) values(?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, a.getsId());
			ps.setString(2, a.getAchieveName());

			j = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;
	}

	public Achievement getAchievementById(Integer id, String sid) {
		// TODO Auto-generated method stub
		Achievement a = null;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "select * from achievement where ach_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				a = new Achievement();
				a.setAchId(rs.getInt(1));
				a.setsId(rs.getString(2));
				a.setAchieveName(rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a;
	}

	public List<Achievement> getAllAchievement(String sid) {

		List<Achievement> list = new ArrayList<Achievement>();
		Achievement a = null;
		Connection con = null;

		try {
			con = getConnection();

			String sql = "select * from achievement where sid=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, sid);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				a = new Achievement();
				a.setAchId(rs.getInt(1));
				a.setsId(rs.getString(2));
				a.setAchieveName(rs.getString(3));
				list.add(a);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public int updateAchievementDetails(Achievement a, Integer id) {
		// TODO Auto-generated method stub
		int j = 0;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "update achievement set sid=?, achieve_name=? where ach_id=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, a.getsId());
			ps.setString(2, a.getAchieveName());
			ps.setInt(3, id);

			j = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;
	}

	public int insertCurricularDetail(Curricular c) {
		int j = 0;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "insert into curricular(sid, curricular_name) values(?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, c.getsId());
			ps.setString(2, c.getCurricularName());

			j = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;
	}

	public Curricular getCurricularById(Integer id, String sid) {
		// TODO Auto-generated method stub
		Curricular c = null;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "select * from curricular where curri_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				c = new Curricular();
				c.setCurrId(rs.getInt(1));
				c.setsId(rs.getString(2));
				c.setCurricularName(rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

	public List<Curricular> getAllCurricular(String sid) {

		List<Curricular> list = new ArrayList<Curricular>();
		Curricular c = null;
		Connection con = null;

		try {
			con = getConnection();

			String sql = "select * from curricular where sid=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, sid);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				c = new Curricular();
				c.setCurrId(rs.getInt(1));
				c.setsId(rs.getString(2));
				c.setCurricularName(rs.getString(3));
				list.add(c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public int updateCurricularDetails(Curricular c, Integer id) {
		// TODO Auto-generated method stub
		int j = 0;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "update curricular set sid=?, curricular_name=? where curri_id=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, c.getsId());
			ps.setString(2, c.getCurricularName());
			ps.setInt(3, id);

			j = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;
	}

	public int updatePassword(String scholar, String newPassword) {
		int j = 0;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "update student_basic set st_password=? where scholar_no=?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, newPassword);
			ps.setString(2, scholar);

			j = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;
	}

//	public boolean deleteStudentSkill(String skill_id) {
//		boolean f = false;
//		Connection con = null;
//		try {
//			con = getConnection();
//			String sql = "delete from skill where skill_id=?";
//			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setString(1, skill_id);
//			int i = ps.executeUpdate();
//			if (i == 1) {
//				f = true;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return f;
//	}

	public boolean deleteStudentSkill(String skill_id) {
		boolean f = false;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "delete from skill where skill_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, skill_id);
			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public boolean deleteStudentProject(String pid) {
		boolean f = false;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "delete from projects where pid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, pid);
			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public boolean deleteStudentinternship(String tid) {
		boolean f = false;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "delete from internship where tid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, tid);
			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public boolean deleteStudentcurricular(String curri_id) {
		boolean f = false;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "delete from curricular where curri_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, curri_id);
			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public boolean deleteStudentcertificate(String cid) {
		boolean f = false;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "delete from certificates where cid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cid);
			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public boolean deleteStudentAchievement(String ach_id) {
		boolean f = false;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "delete from achievement where ach_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, ach_id);
			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public int updatePasswordByEmail(String email, String newPassword) {
		int j = 0;
		Connection con = null;
		try {
			con = getConnection();
			String sql = "update student_basic set st_password=? where st_college_mail=?";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println(email + "Student Model Email ");
			System.out.println(newPassword);
			ps.setString(1, newPassword);
			ps.setString(2, email);

			j = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;
	}

}
