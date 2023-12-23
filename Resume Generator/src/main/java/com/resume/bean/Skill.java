package com.resume.bean;

public class Skill {

	private Integer skillId;
	private String sId;
	private String skillName;
	public Skill() {
		// TODO Auto-generated constructor stub
	}
	
	public Skill(String sId, String skillName) {
		super();
		this.sId = sId;
		this.skillName = skillName;
	}

	public Skill(Integer skillId, String sId, String skillName) {
		this.skillId = skillId;
		this.sId = sId;
		this.skillName = skillName;
	}
	public Integer getSkillId() {
		return skillId;
	}
	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
	
}
