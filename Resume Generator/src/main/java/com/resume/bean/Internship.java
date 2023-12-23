package com.resume.bean;

public class Internship {

	private Integer tId;
	private String sId;
	private String trName;
	private String orgName;
	private String trStartDate;
	private String trEndDate;
	private String trCerti;
	private String trDesc;
	public Internship() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Internship(String sId, String trName, String orgName, String trStartDate, String trEndDate, String trCerti, String trDesc) {
		super();
		this.sId = sId;
		this.trName = trName;
		this.orgName = orgName;
		this.trStartDate = trStartDate;
		this.trEndDate = trEndDate;
		this.trCerti = trCerti;
		this.trDesc = trDesc;
	}



	public Internship(Integer tId, String sId, String trName, String orgName, String trStartDate, String trEndDate,
			String trCerti,String trDesc) {
		this.tId = tId;
		this.sId = sId;
		this.trName = trName;
		this.orgName = orgName;
		this.trStartDate = trStartDate;
		this.trEndDate = trEndDate;
		this.trCerti = trCerti;
		this.trDesc = trDesc;
	}
	public Integer gettId() {
		return tId;
	}
	public void settId(Integer tId) {
		this.tId = tId;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getTrName() {
		return trName;
	}
	public void setTrName(String trName) {
		this.trName = trName;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getTrStartDate() {
		return trStartDate;
	}
	public void setTrStartDate(String trStartDate) {
		this.trStartDate = trStartDate;
	}
	public String getTrEndDate() {
		return trEndDate;
	}
	public void setTrEndDate(String trEndDate) {
		this.trEndDate = trEndDate;
	}
	public String getTrCerti() {
		return trCerti;
	}
	public void setTrCerti(String trCerti) {
		this.trCerti = trCerti;
	}



	public String getTrDesc() {
		return trDesc;
	}



	public void setTrDesc(String trDesc) {
		this.trDesc = trDesc;
	}
	
	
	
	
	
}
