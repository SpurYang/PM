package com.neusoft.web;

import com.neusoft.model.EmployeeInf;
import com.neusoft.service.EmployeeInfService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class InductionAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private EmployeeInf empinf;

	private EmployeeInfService emps;
	
	private Integer id;
	
	private Integer EId;
	private String EName;
	private String EDept;
	private String EPost;
	private String EIndate;
	private String ETrialstatus;
	private String ETrstartdate;
	private String ETrenddate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public EmployeeInf getEmpinf() {
		return empinf;
	}
	public void setEmpinf(EmployeeInf empinf) {
		this.empinf = empinf;
	}
	public EmployeeInfService getEmps() {
		return emps;
	}
	public void setEmps(EmployeeInfService emps) {
		this.emps = emps;
	}
	public Integer getEId() {
		return EId;
	}
	public void setEId(Integer id) {
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
	public String getEIndate() {
		return EIndate;
	}
	public void setEIndate(String indate) {
		EIndate = indate;
	}
	
	public String getETrialstatus() {
		return ETrialstatus;
	}
	public void setETrialstatus(String trialstatus) {
		ETrialstatus = trialstatus;
	}
	
	public String getETrstartdate() {
		return ETrstartdate;
	}
	public void setETrstartdate(String trstartdate) {
		ETrstartdate = trstartdate;
	}
	public String getETrenddate() {
		return ETrenddate;
	}
	public void setETrenddate(String trenddate) {
		ETrenddate = trenddate;
	}
	
	
	public String isInduction() {
		
		emps.induction(this.getEId(),this.getEDept(),this.getEPost(),this.getEIndate(),this.getETrialstatus(),this.getETrstartdate(),this.getETrenddate());
	
		return "success";
	}
	
}
