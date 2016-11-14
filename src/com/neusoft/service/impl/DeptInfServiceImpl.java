package com.neusoft.service.impl;

import java.util.List;

import com.neusoft.dao.DeptInfDao;
import com.neusoft.model.DeptInf;
import com.neusoft.model.EmployeeInf;
import com.neusoft.service.DeptInfService;

public class DeptInfServiceImpl implements DeptInfService {
	private DeptInfDao deptinfDao;
	


	public void setDeptinfDao(DeptInfDao deptinfDao) {
		this.deptinfDao = deptinfDao;
	}

	
      public void save(DeptInf di) {
		deptinfDao.save(di);
	}


	
	public List<DeptInf> findAll() {
		return deptinfDao.findAll();
	}

	public void deleteDeptInf(Long id) {
		deptinfDao.deletebyid(id);
		
	}
	public void updateDeptInf(Long DId,String DName,String DType,String DPhone,String DFax,String DNote,String DSuperior,String DDate){
		deptinfDao.updateDeptInf(DId, DName, DType, DPhone, DFax, DNote, DSuperior, DDate);
	}
	
	public DeptInf findDAll(Long did){
		return deptinfDao.findDeptInfAll(did);
	}


	@Override
	public List<EmployeeInf> finddept(String dept) {
		
		return deptinfDao.findbydept(dept);
	}
}
