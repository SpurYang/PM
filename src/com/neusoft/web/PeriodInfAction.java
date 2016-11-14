package com.neusoft.web;




import java.util.List;

import com.neusoft.model.PeriodEmpInf;

import com.neusoft.service.PeriodInfService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class PeriodInfAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private PeriodInfService periodinfService;
	private PeriodEmpInf periodempinf;
	//转正功能
	private String ETrialstatus;
	public String getETrialstatus() {
		return ETrialstatus;
	}
	public void setETrialstatus(String trialstatus) {
		ETrialstatus = trialstatus;
	}
	
	
	//删除功能
	private Long EId;
	public Long getEId() {
		return EId;
	}
	public void setEId(Long id) {
		EId = id;
	}
	
	
	
	
	
	
	
	public PeriodEmpInf getPeriodempinf() {
		return periodempinf;
	}
	public void setPeriodempinf(PeriodEmpInf periodempinf) {
		this.periodempinf = periodempinf;
	}

	public void setPeriodinfService(PeriodInfService periodinfService) {
		this.periodinfService = periodinfService;
	}
	
	//show()
	public String show(){
		List<PeriodEmpInf>  pei = periodinfService.isShow();
		if (pei==null) {
			return "error";
		}else {
			ActionContext.getContext().getSession().put("pei",pei);
			return "success";
		}
	}
	
	//delete()
	public String delete(){
		this.getEId();
		periodinfService.deleteP(this.getEId());
		periodinfService.deleteE(this.getEId());
		return "success";	
	}
	
	//update()
	public String update(){
		this.getEId();
		this.getETrialstatus();
		periodinfService.updateEstatus(this.getETrialstatus());
		periodinfService.deleteP(Long.parseLong(this.getETrialstatus()));
		return"success";
	}

		
	
	

}
