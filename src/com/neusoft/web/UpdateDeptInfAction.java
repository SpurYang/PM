package com.neusoft.web;

import com.neusoft.service.DeptInfService;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateDeptInfAction  extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private long DId;
	private String DName;
	private String DType;
	private String DPhone;
	private String DFax;
	private String DNote;
	private String DSuperior;
	private String DDate;
	private DeptInfService deptinfService;
	
	
	public void setDeptinfService(DeptInfService deptinfService) {
		this.deptinfService = deptinfService;
	}
	public long getDId() {
		return DId;
	}
	public void setDId(long id) {
		DId = id;
	}
	public String getDName() {
		return DName;
	}
	public void setDName(String name) {
		DName = name;
	}
	public String getDType() {
		return DType;
	}
	public void setDType(String type) {
		DType = type;
	}
	public String getDPhone() {
		return DPhone;
	}
	public void setDPhone(String phone) {
		DPhone = phone;
	}
	public String getDFax() {
		return DFax;
	}
	public void setDFax(String fax) {
		DFax = fax;
	}
	public String getDNote() {
		return DNote;
	}
	public void setDNote(String note) {
		DNote = note;
	}
	public String getDSuperior() {
		return DSuperior;
	}
	public void setDSuperior(String superior) {
		DSuperior = superior;
	}
	public String getDDate() {
		return DDate;
	}
	public void setDDate(String date) {
		DDate = date;
	}

  public String UpdateDeptInf(){
	 deptinfService.updateDeptInf(this.getDId(), this.getDName(), this.getDType(), this.getDPhone(), this.getDFax(),
			                       this.getDNote(), this.getDSuperior(), this.getDDate());
	  return "success";
	  
  }

}
