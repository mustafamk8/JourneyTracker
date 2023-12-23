package com.resume.bean;

public class Curricular {

	private Integer currId;
	private String sId;
	private String curricularName;
	public Curricular() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Curricular(String sId, String curricularName) {
		super();
		this.sId = sId;
		this.curricularName = curricularName;
	}

	public Curricular(Integer currId, String sId, String curricularName) {
		super();
		this.currId = currId;
		this.sId = sId;
		this.curricularName = curricularName;
	}
	public Integer getCurrId() {
		return currId;
	}
	public void setCurrId(Integer currId) {
		this.currId = currId;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getCurricularName() {
		return curricularName;
	}
	public void setCurricularName(String curricularName) {
		this.curricularName = curricularName;
	}
	
	
}
