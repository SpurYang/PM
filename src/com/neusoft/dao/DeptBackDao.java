package com.neusoft.dao;

import com.neusoft.model.DeptbackInf;


public interface DeptBackDao extends GenericDao<DeptbackInf, Long>{
	public void deletedDeptba(Long deptBackID);
    public void updateDeptID(DeptbackInf deptBackinf);
}
