package com.neusoft.web;

import com.neusoft.model.EmployeeInf;
import com.neusoft.service.EmployeeInfService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class GetDetailedMessageAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private EmployeeInf empInf;
	private EmployeeInfService emps;
	private Integer eid;
	
	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public void setEmps(EmployeeInfService emps) {
		this.emps = emps;
	}

	public EmployeeInf getEmpInf() {
		return empInf;
	}

	public void setEmpInf(EmployeeInf empInf) {
		this.empInf = empInf;
	}

	
	public String isDetailedMessage() {
		EmployeeInf ei = emps.detailedMessage(this.getEid());
		if (ei==null) {
			return "error";
		}else {
			ActionContext.getContext().getSession().put("employeeInf",ei);
			return "success";
		}
	}




}
