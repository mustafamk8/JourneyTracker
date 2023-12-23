package com.resume.bean;

public class Project {

	private Integer projectId;
	private String sId;
	private String projectName;
	private String projectDesc;
	private String projectRole;
	private Integer projectDuration;
	private String projectLink;
	
	
	
	
	public Project(String sId, String projectName, String projectDesc, String projectRole, Integer projectDuration,
			String projectLink) {
		this.sId = sId;
		this.projectName = projectName;
		this.projectDesc = projectDesc;
		this.projectRole = projectRole;
		this.projectDuration = projectDuration;
		this.projectLink = projectLink;
	}
	public Project() {
		// TODO Auto-generated constructor stub
	}
	public Project(Integer projectId, String sId, String projectName, String projectDesc, String projectRole,
			Integer projectDuration, String projectLink) {
		this.projectId = projectId;
		this.sId = sId;
		this.projectName = projectName;
		this.projectDesc = projectDesc;
		this.projectRole = projectRole;
		this.projectDuration = projectDuration;
		this.projectLink = projectLink;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDesc() {
		return projectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
	public String getProjectRole() {
		return projectRole;
	}
	public void setProjectRole(String projectRole) {
		this.projectRole = projectRole;
	}
	public Integer getProjectDuration() {
		return projectDuration;
	}
	public void setProjectDuration(Integer projectDuration) {
		this.projectDuration = projectDuration;
	}
	public String getProjectLink() {
		return projectLink;
	}
	public void setProjectLink(String projectLink) {
		this.projectLink = projectLink;
	}
	
	
	
}
