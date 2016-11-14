package com.neusoft.web;


import com.neusoft.model.PeriodInf;
import com.neusoft.service.ProbationService;
import com.opensymphony.xwork2.ActionSupport;

public class ProbationAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private PeriodInf employee;
	private ProbationService probationService;
	
	public PeriodInf getEmployee() {
		return employee;
	}
	public void setEmployee(PeriodInf employee) {
		this.employee = employee;
	}

	public void setProbationService(ProbationService probationService) {
		this.probationService = probationService;
	}
    public String probationAction(){
    	probationService.probationService(employee);
    	
    	return "success";
    }

} 
