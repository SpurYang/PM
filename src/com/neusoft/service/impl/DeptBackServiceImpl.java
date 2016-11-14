package com.neusoft.service.impl;

import com.neusoft.dao.DeptBackDao;
import com.neusoft.model.DeptbackInf;
import com.neusoft.service.DeptbackSercice;

public class DeptBackServiceImpl implements DeptbackSercice{
	 private DeptBackDao deptBackDao;
	    
	    public DeptBackDao getDeptBackDao() {
			return deptBackDao;
		}

		public void setDeptBackDao(DeptBackDao deptBackDao) {
			this.deptBackDao = deptBackDao;
		}
	public void savaDept(DeptbackInf deptBack){
		deptBackDao.save(deptBack);
	}
	public void deletDept(Long deptBackID){
		deptBackDao.deletedDeptba(deptBackID);
	}

	public void updateDept(DeptbackInf deptBack){
		deptBackDao.updateDeptID(deptBack);
	}

}
