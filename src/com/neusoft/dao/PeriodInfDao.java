  package com.neusoft.dao;

import java.util.List;

import com.neusoft.model.PeriodEmpInf;
import com.neusoft.model.PeriodInf;


public interface PeriodInfDao extends GenericDao<PeriodInf,Integer>{
	//public PeriodInf isCheckProbation
	public List<PeriodEmpInf> isShow();
	public void deletebypid(Long id);
	public void deletebyeid(Long id);
	public void updateEstatus(String ETrialstatus);
	
}
