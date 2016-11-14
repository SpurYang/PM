package com.neusoft.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.neusoft.model.DeptInf;
import com.neusoft.model.EmployeeInf;
import com.neusoft.service.DeptInfService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DeptInfAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private EmployeeInf employeeInf;
	private DeptInf deptinf;
	private DeptInfService deptinfService;
	private long DId;
	private String EDept;

	public String getEDept() {
		return EDept;
	}

	public void setEDept(String dept) {
		EDept = dept;
	}

	public long getDId() {
		return DId;
	}

	public void setDId(long id) {
		DId = id;
	}

	public DeptInf getDeptinf() {
		return deptinf;
	}

	public void setDeptinf(DeptInf deptinf) {
		this.deptinf = deptinf;
	}

	public void setDeptinfService(DeptInfService deptinfService) {
		this.deptinfService = deptinfService;
	}

	public String save() {
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
		deptinf.setDDate(date.format(new Date()));

		deptinf.getDId();
		deptinf.getDName();
		deptinf.getDPhone();
		deptinf.getDFax();
		deptinf.getDType();
		deptinf.getDNote();
		deptinf.getDSuperior();

		deptinfService.save(deptinf);
		System.out.println("success save");
		return "success";
	}

	public String findAll() {

		List<DeptInf> list = deptinfService.findAll();
		ActionContext.getContext().getSession().put("list_r", list);
		return "success";
	}

	public String deleteDeptInf() {
		this.getDId();
		deptinfService.deleteDeptInf(this.getDId());
		return "success";

	}

	public String find() {
		DeptInf di = deptinfService.findDAll(this.getDId());
		ActionContext.getContext().getSession().put("d", di);
		return "success";

	}
	public String finddept(){
		
		List<EmployeeInf> list = deptinfService.finddept(this.getEDept());
		ActionContext.getContext().getSession().put("list_e", list);
		return "success";
		
	}

	public EmployeeInf getEmployeeInf() {
		return employeeInf;
	}

	public void setEmployeeInf(EmployeeInf employeeInf) {
		this.employeeInf = employeeInf;
	}

}
