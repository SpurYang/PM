package com.neusoft.web;

import com.neusoft.model.Admin;
import com.neusoft.service.AdminService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private Admin admin;
	
	private AdminService adminService;
	
	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	public String login() {
		
		if(adminService.validate(admin.getUsername(), admin.getPassword())==null){
			//adminService.saveAdmin(admin);
			return "error";
		}else {
			ActionContext.getContext().getSession().put("admin.username", admin.getUsername());
			return "success";
		}
	}
	public String register(){
		if(adminService.saveAdmin(admin)){
			
		}
		
		return "";
	}

	



}
