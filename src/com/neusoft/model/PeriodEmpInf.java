package com.neusoft.model;

public class PeriodEmpInf implements java.io.Serializable{
	private long EId;
	private String EName;
	private String EDept;
	private String EPost;
	private String peStatus;
	private String peSdate;
	private String peEdate;
	private String peComment;
	private String ETrialstatus;
	
	public String getETrialstatus() {
		return ETrialstatus;
	}
	public void setETrialstatus(String trialstatus) {
		ETrialstatus = trialstatus;
	}
	public long getEId() {
		return EId;
	}
	public void setEId(long id) {
		EId = id;
	}
	public String getEName() {
		return EName;
	}
	public void setEName(String name) {
		EName = name;
	}
	public String getEDept() {
		return EDept;
	}
	public void setEDept(String dept) {
		EDept = dept;
	}
	public String getEPost() {
		return EPost;
	}
	public void setEPost(String post) {
		EPost = post;
	}
	public String getPeStatus() {
		return peStatus;
	}
	public void setPeStatus(String peStatus) {
		this.peStatus = peStatus;
	}
	public String getPeSdate() {
		return peSdate;
	}
	public void setPeSdate(String peSdate) {
		this.peSdate = peSdate;
	}
	public String getPeEdate() {
		return peEdate;
	}
	public void setPeEdate(String peEdate) {
		this.peEdate = peEdate;
	}
	public String getPeComment() {
		return peComment;
	}
	public void setPeComment(String peComment) {
		this.peComment = peComment;
	}
	
	

}
