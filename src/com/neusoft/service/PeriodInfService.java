package com.neusoft.service;

import java.util.List;

import com.neusoft.model.PeriodEmpInf;




public interface PeriodInfService {
	public List<PeriodEmpInf> isShow();
	public void deleteP(Long id);
	public void deleteE(Long id);
	public void updateEstatus(String ETrialstatus);

}
