package com.resume.bean;

public class Certificates {

	private Integer certiId;
	private String sId;
	private String certiName;
	private String certiPlateform;
	private String certiCompletionDate;
	private String certiUrl;
	public Certificates() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificates(Integer certiId, String sId, String certiName, String certiPlateform,
			String certiCompletionDate, String certiUrl) {
		super();
		this.certiId = certiId;
		this.sId = sId;
		this.certiName = certiName;
		this.certiPlateform = certiPlateform;
		this.certiCompletionDate = certiCompletionDate;
		this.certiUrl = certiUrl;
	}
	
	public Certificates(String sId, String certiName, String certiPlateform, String certiCompletionDate,
			String certiUrl) {
		super();
		this.sId = sId;
		this.certiName = certiName;
		this.certiPlateform = certiPlateform;
		this.certiCompletionDate = certiCompletionDate;
		this.certiUrl = certiUrl;
	}
	public Integer getCertiId() {
		return certiId;
	}
	public void setCertiId(Integer certiId) {
		this.certiId = certiId;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getCertiName() {
		return certiName;
	}
	public void setCertiName(String certiName) {
		this.certiName = certiName;
	}
	public String getCertiPlateform() {
		return certiPlateform;
	}
	public void setCertiPlateform(String certiPlateform) {
		this.certiPlateform = certiPlateform;
	}
	public String getCertiCompletionDate() {
		return certiCompletionDate;
	}
	public void setCertiCompletionDate(String certiCompletionDate) {
		this.certiCompletionDate = certiCompletionDate;
	}
	public String getCertiUrl() {
		return certiUrl;
	}
	public void setCertiUrl(String certiUrl) {
		this.certiUrl = certiUrl;
	}
	
	
	
}
