package com.neusoft.service.impl;

import com.neusoft.dao.ProbationDao;

import com.neusoft.model.PeriodInf;

public class ProbationService implements com.neusoft.service.ProbationService{
	private ProbationDao probationDaoSer;
    
	public void setProbationDaoSer(ProbationDao probationDaoSer) {
		this.probationDaoSer = probationDaoSer;
	}

	public void probationService(PeriodInf emp) {
		probationDaoSer.probatiDao(emp);
		
	}

	

}
