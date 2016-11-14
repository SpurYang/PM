package com.neusoft.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import com.neusoft.model.DeptbackInf;
import com.neusoft.model.PostbackInf;
import com.neusoft.service.DeptbackSercice;

public class DeptbackAction {
	private Long id;
    private List<PostbackInf> list;
    private DeptbackInf deptBackInf;
    private DeptbackSercice deptBackService;
    public void setDeptBackService(DeptbackSercice deptBackService) {
    	this.deptBackService = deptBackService;
    }
    
    public DeptbackInf getDeptBackInf() {
		return deptBackInf;
	}

	public void setDeptBackInf(DeptbackInf deptBackInf) {
		this.deptBackInf = deptBackInf;
	}
	
	public List<PostbackInf> getList() {
		return list;
	}

	public void setList(List<PostbackInf> list) {
		this.list = list;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String addDeptback(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
		deptBackInf.setDsDate(sdf.format(new Date()));
		deptBackService.savaDept(deptBackInf);
		return "success";
	}
	public String deletDept() {
		deptBackService.deletDept(id);
		return "success";
	}
public String UpDateDept(){
		
		
	  deptBackService.updateDept(deptBackInf);
		return "success";
	}



}
