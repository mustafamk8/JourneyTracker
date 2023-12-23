package com.resume.bean;

import java.sql.Blob;

public class StudentPersonel {

	
	private String scholarNo;
	private String stName;
	private String stPassword;
	private String stGender;
	private String stDept;
	private Integer stSem;
	private Integer stSection;
	private String stCollegeMail;
	private String stPersonelMail;
	private String stGithub;
	private String stLinkedin;
	private String stPhone;
	private String stEnroll;
	private Blob stPhoto;
	private String stPhotoName;
	private String stAddress;
	private String stDob;
	
	// academics details
	
	private String tenthBoardName;
	private String tenthSchoolName;
	private Double tenthMarks;
	private String twelfthBoardName;
	private String twelfthSchoolName;
	private Double twelfthMarks;
	private String collegeBacklog;
	private Double collegeCgpa;
	
	
	
	
	
	@Override
	public String toString() {
		return "StudentPersonel [scholarNo=" + scholarNo + ", stName=" + stName + ", stPassword=" + stPassword
				+ ", stGender=" + stGender + ", stDept=" + stDept + ", stSem=" + stSem + ", stSection=" + stSection
				+ ", stCollegeMail=" + stCollegeMail + ", stPersonelMail=" + stPersonelMail + ", stGithub=" + stGithub
				+ ", stLinkedin=" + stLinkedin + ", stPhone=" + stPhone + ", stEnroll=" + stEnroll + ", stPhoto="
				+ stPhoto + ", stPhotoName=" + stPhotoName + ", stAddress=" + stAddress + ", stDob=" + stDob
				+ ", tenthBoardName=" + tenthBoardName + ", tenthSchoolName=" + tenthSchoolName + ", tenthMarks="
				+ tenthMarks + ", twelfthBoardName=" + twelfthBoardName + ", twelfthSchoolName=" + twelfthSchoolName
				+ ", twelfthMarks=" + twelfthMarks + ", collegeBacklog=" + collegeBacklog + ", collegeCgpa="
				+ collegeCgpa + "]";
	}
	public StudentPersonel(String scholarNo,String tenthBoardName, String tenthSchoolName, Double tenthMarks, String twelfthBoardName,
			String twelfthSchoolName, Double twelfthMarks, String collegeBacklog, Double collegeCgpa) {
		super();
		this.scholarNo = scholarNo;
		this.tenthBoardName = tenthBoardName;
		this.tenthSchoolName = tenthSchoolName;
		this.tenthMarks = tenthMarks;
		this.twelfthBoardName = twelfthBoardName;
		this.twelfthSchoolName = twelfthSchoolName;
		this.twelfthMarks = twelfthMarks;
		this.collegeBacklog = collegeBacklog;
		this.collegeCgpa = collegeCgpa;
	}
	public StudentPersonel(String scholarNo, String stName, String stPassword, String stGender, String stDept,
			Integer stSem, Integer stSection, String stCollegeMail, String stPersonelMail, String stGithub,
			String stLinkedin, String stPhone, String stEnroll, Blob stPhoto, String stPhotoName, String stAddress,
			String stDob) {
		super();
		this.scholarNo = scholarNo;
		this.stName = stName;
		this.stPassword = stPassword;
		this.stGender = stGender;
		this.stDept = stDept;
		this.stSem = stSem;
		this.stSection = stSection;
		this.stCollegeMail = stCollegeMail;
		this.stPersonelMail = stPersonelMail;
		this.stGithub = stGithub;
		this.stLinkedin = stLinkedin;
		this.stPhone = stPhone;
		this.stEnroll = stEnroll;
		this.stPhoto = stPhoto;
		this.stPhotoName = stPhotoName;
		this.stAddress = stAddress;
		this.stDob = stDob;
	}
	public StudentPersonel(String scholarNo, String stName, String stPassword, String stGender, String stDept,
			Integer stSem, Integer stSection, String stCollegeMail, String stPersonelMail, String stGithub,
			String stLinkedin, String stPhone, String stEnroll, Blob stPhoto, String stPhotoName, String stAddress,
			String stDob, String tenthBoardName, String tenthSchoolName, Double tenthMarks, String twelfthBoardName,
			String twelfthSchoolName, Double twelfthMarks, String collegeBacklog, Double collegeCgpa) {
		super();
		this.scholarNo = scholarNo;
		this.stName = stName;
		this.stPassword = stPassword;
		this.stGender = stGender;
		this.stDept = stDept;
		this.stSem = stSem;
		this.stSection = stSection;
		this.stCollegeMail = stCollegeMail;
		this.stPersonelMail = stPersonelMail;
		this.stGithub = stGithub;
		this.stLinkedin = stLinkedin;
		this.stPhone = stPhone;
		this.stEnroll = stEnroll;
		this.stPhoto = stPhoto;
		this.stPhotoName = stPhotoName;
		this.stAddress = stAddress;
		this.stDob = stDob;
		this.tenthBoardName = tenthBoardName;
		this.tenthSchoolName = tenthSchoolName;
		this.tenthMarks = tenthMarks;
		this.twelfthBoardName = twelfthBoardName;
		this.twelfthSchoolName = twelfthSchoolName;
		this.twelfthMarks = twelfthMarks;
		this.collegeBacklog = collegeBacklog;
		this.collegeCgpa = collegeCgpa;
	}
	public StudentPersonel() {
		// TODO Auto-generated constructor stub
	}
	public String getScholarNo() {
		return scholarNo;
	}
	public void setScholarNo(String scholarNo) {
		this.scholarNo = scholarNo;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStPassword() {
		return stPassword;
	}
	public void setStPassword(String stPassword) {
		this.stPassword = stPassword;
	}
	public String getStGender() {
		return stGender;
	}
	public void setStGender(String stGender) {
		this.stGender = stGender;
	}
	public String getStDept() {
		return stDept;
	}
	public void setStDept(String stDept) {
		this.stDept = stDept;
	}
	public Integer getStSem() {
		return stSem;
	}
	public void setStSem(Integer stSem) {
		this.stSem = stSem;
	}
	public Integer getStSection() {
		return stSection;
	}
	public void setStSection(Integer stSection) {
		this.stSection = stSection;
	}
	public String getStCollegeMail() {
		return stCollegeMail;
	}
	public void setStCollegeMail(String stCollegeMail) {
		this.stCollegeMail = stCollegeMail;
	}
	public String getStPersonelMail() {
		return stPersonelMail;
	}
	public void setStPersonelMail(String stPersonelMail) {
		this.stPersonelMail = stPersonelMail;
	}
	public String getStGithub() {
		return stGithub;
	}
	public void setStGithub(String stGithub) {
		this.stGithub = stGithub;
	}
	public String getStLinkedin() {
		return stLinkedin;
	}
	public void setStLinkedin(String stLinkedin) {
		this.stLinkedin = stLinkedin;
	}
	public String getStPhone() {
		return stPhone;
	}
	public void setStPhone(String stPhone) {
		this.stPhone = stPhone;
	}
	public String getStEnroll() {
		return stEnroll;
	}
	public void setStEnroll(String stEnroll) {
		this.stEnroll = stEnroll;
	}
	public Blob getStPhoto() {
		return stPhoto;
	}
	public void setStPhoto(Blob stPhoto) {
		this.stPhoto = stPhoto;
	}
	public String getStPhotoName() {
		return stPhotoName;
	}
	public void setStPhotoName(String stPhotoName) {
		this.stPhotoName = stPhotoName;
	}
	public String getTenthBoardName() {
		return tenthBoardName;
	}
	public void setTenthBoardName(String tenthBoardName) {
		this.tenthBoardName = tenthBoardName;
	}
	public String getTenthSchoolName() {
		return tenthSchoolName;
	}
	public void setTenthSchoolName(String tenthSchoolName) {
		this.tenthSchoolName = tenthSchoolName;
	}
	public Double getTenthMarks() {
		return tenthMarks;
	}
	public void setTenthMarks(Double tenthMarks) {
		this.tenthMarks = tenthMarks;
	}
	public String getTwelfthBoardName() {
		return twelfthBoardName;
	}
	public void setTwelfthBoardName(String twelfthBoardName) {
		this.twelfthBoardName = twelfthBoardName;
	}
	public String getTwelfthSchoolName() {
		return twelfthSchoolName;
	}
	public void setTwelfthSchoolName(String twelfthSchoolName) {
		this.twelfthSchoolName = twelfthSchoolName;
	}
	public Double getTwelfthMarks() {
		return twelfthMarks;
	}
	public void setTwelfthMarks(Double twelfthMarks) {
		this.twelfthMarks = twelfthMarks;
	}
	public String getCollegeBacklog() {
		return collegeBacklog;
	}
	public void setCollegeBacklog(String collegeBacklog) {
		this.collegeBacklog = collegeBacklog;
	}
	public Double getCollegeCgpa() {
		return collegeCgpa;
	}
	public void setCollegeCgpa(Double collegeCgpa) {
		this.collegeCgpa = collegeCgpa;
	}
	public String getStAddress() {
		return stAddress;
	}
	public void setStAddress(String stAddress) {
		this.stAddress = stAddress;
	}
	public String getStDob() {
		return stDob;
	}
	public void setStDob(String stDob) {
		this.stDob = stDob;
	}
	
	
	
	
	
}
