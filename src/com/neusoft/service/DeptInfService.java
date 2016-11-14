package com.neusoft.service;

import java.util.List;

import com.neusoft.model.DeptInf;
import com.neusoft.model.EmployeeInf;
import com.neusoft.model.PostInf;

public interface DeptInfService {

	public void save(DeptInf di);
	public List<DeptInf> findAll();
	public void deleteDeptInf(Long id);
	public DeptInf findDAll(Long id);
	public List<EmployeeInf> finddept(String dept);
	public void updateDeptInf(Long DId,String DName,String DType,String DPhone,String DFax,String DNote,String DSuperior,String DDate);
}
