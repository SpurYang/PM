package com.neusoft.web;

import com.neusoft.service.PostInfService;
import com.opensymphony.xwork2.ActionSupport;

public class UpdatePostInfAction extends ActionSupport{

	
	private static final long serialVersionUID = 1L;

	private long PId;
	private String PName;
	private String PType;
	private long POrg;
	private PostInfService postinfService;
	
	public void setPostinfService(PostInfService postinfService) {
		this.postinfService = postinfService;
	}
	
	public long getPId() {
		return PId;
	}
	public void setPId(long id) {
		PId = id;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String name) {
		PName = name;
	}
	public String getPType() {
		return PType;
	}
	public void setPType(String type) {
		PType = type;
	}
	public long getPOrg() {
		return POrg;
	}
	public void setPOrg(long org) {
		POrg = org;
	}
	
	public String UpdatePostInf(){
		/* this.getPId();
		 this.getPName();
		 this.getPType();
		 this.getPOrg();*/ 
		postinfService.updatePostInf(this.getPId(),this.getPName(), this.getPType(), this.getPOrg());
		return "success";
		
	}

	
}
