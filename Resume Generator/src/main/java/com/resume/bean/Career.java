package com.resume.bean;

public class Career {

	private Integer careerId;
	private String sId;
	private String careerObj;
	private String strength1;
	private String strength2;
	private String hobby1;
	private String hobby2;
	private String weakness1;
	private String weakness2;
	public Career() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Career(String sId, String careerObj, String strength1, String strength2, String hobby1, String hobby2,
			String weakness1, String weakness2) {
		super();
		this.sId = sId;
		this.careerObj = careerObj;
		this.strength1 = strength1;
		this.strength2 = strength2;
		this.hobby1 = hobby1;
		this.hobby2 = hobby2;
		this.weakness1 = weakness1;
		this.weakness2 = weakness2;
	}

	public Career(Integer careerId, String sId, String careerObj, String strength1, String strength2, String hobby1,
			String hobby2, String weakness1, String weakness2) {
		super();
		this.careerId = careerId;
		this.sId = sId;
		this.careerObj = careerObj;
		this.strength1 = strength1;
		this.strength2 = strength2;
		this.hobby1 = hobby1;
		this.hobby2 = hobby2;
		this.weakness1 = weakness1;
		this.weakness2 = weakness2;
	}
	public Integer getCareerId() {
		return careerId;
	}
	public void setCareerId(Integer careerId) {
		this.careerId = careerId;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getCareerObj() {
		return careerObj;
	}
	public void setCareerObj(String careerObj) {
		this.careerObj = careerObj;
	}
	public String getStrength1() {
		return strength1;
	}
	public void setStrength1(String strength1) {
		this.strength1 = strength1;
	}
	public String getStrength2() {
		return strength2;
	}
	public void setStrength2(String strength2) {
		this.strength2 = strength2;
	}
	public String getHobby1() {
		return hobby1;
	}
	public void setHobby1(String hobby1) {
		this.hobby1 = hobby1;
	}
	public String getHobby2() {
		return hobby2;
	}
	public void setHobby2(String hobby2) {
		this.hobby2 = hobby2;
	}
	public String getWeakness1() {
		return weakness1;
	}
	public void setWeakness1(String weakness1) {
		this.weakness1 = weakness1;
	}
	public String getWeakness2() {
		return weakness2;
	}
	public void setWeakness2(String weakness2) {
		this.weakness2 = weakness2;
	}
	
	
	
}
