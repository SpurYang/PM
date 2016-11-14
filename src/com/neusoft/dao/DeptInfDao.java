package com.neusoft.dao;

import java.util.List;

import com.neusoft.model.DeptInf;
import com.neusoft.model.EmployeeInf;

public interface DeptInfDao  extends GenericDao<DeptInf, Long>{
	
	
	public void deletebyid(Long id);
	
	public List<EmployeeInf> findbydept(String EDept);
	
	public void updateDeptInf(Long DId,String DName,String DType,String DPhone,String DFax,String DNote,String DSuperior,String DDate);

	public DeptInf findDeptInfAll(Long DId);
}
