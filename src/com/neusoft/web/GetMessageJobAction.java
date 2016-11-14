package com.neusoft.web;

import java.util.List;

import com.neusoft.model.EmployeeInf;
import com.neusoft.service.EmployeeInfService;
import com.opensymphony.xwork2.ActionContext;

public class GetMessageJobAction {

	private static final long serialVersionUID = 1L;
	
	private EmployeeInf empInf;
	private EmployeeInfService emps;
	/*private Integer EId;*/
	public void setEmps(EmployeeInfService emps) {
		this.emps = emps;
	}

	public EmployeeInf getEmpInf() {
		return empInf;
	}

	public void setEmpInf(EmployeeInf empInf) {
		this.empInf = empInf;
	}
	
	public String isGetMessage() {
		List<EmployeeInf>list = emps.getMessage(); 
		if (list==null) {
			return "error";
		} else {
			ActionContext.getContext().getSession().put("list", list);
			return "success";
		}
	}
	
}
