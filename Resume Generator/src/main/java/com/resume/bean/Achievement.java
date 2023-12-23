package com.resume.bean;

public class Achievement {

	private Integer achId;
	private String sId;
	private String achieveName;
	
	
	
	@Override
	public String toString() {
		return "Achievement [achId=" + achId + ", sId=" + sId + ", achieveName=" + achieveName + "]";
	}
	public Achievement(Integer achId, String sId, String achieveName) {
		this.achId = achId;
		this.sId = sId;
		this.achieveName = achieveName;
	}
	
	
	
	public Achievement(String sId, String achieveName) {
		super();
		this.sId = sId;
		this.achieveName = achieveName;
	}
	public Achievement() {
		// TODO Auto-generated constructor stub
	}
	public Integer getAchId() {
		return achId;
	}
	public void setAchId(Integer achId) {
		this.achId = achId;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getAchieveName() {
		return achieveName;
	}
	public void setAchieveName(String achieveName) {
		this.achieveName = achieveName;
	}
	
	
}
