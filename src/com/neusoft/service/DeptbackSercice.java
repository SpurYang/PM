package com.neusoft.service;

import com.neusoft.model.DeptbackInf;

public interface  DeptbackSercice   {
	public void updateDept(DeptbackInf deptBack);
    public void deletDept(Long postBackID);
    public void savaDept(DeptbackInf deptBack);


}
