package com.neusoft.web;

import com.neusoft.model.EmployeeInf;
import com.neusoft.service.EmployeeInfService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EmpAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private EmployeeInf empinf;
	
	private EmployeeInfService emps;
	
	private Integer eid;
	
	private Integer mid;
	
	private Integer did;
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

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}
	
	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String isDetailedMessage() {
		EmployeeInf ei = emps.detailedMessage(this.getMid());
		if (ei == null) {
			return "error";
		} else {
			ActionContext.getContext().getSession().put("employeeInf", ei);
			return "success";
		}
	}
	
	public String isAdd() {
		
		emps.save(this.getEmpinf());
		return "success";
	}

	public String isDelete(){
		
		Integer id = this.getDid();
		emps.delete(id);
		return "success";
	}
}
