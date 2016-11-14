package com.neusoft.service.impl;


import java.util.List;
import com.neusoft.dao.PeriodInfDao;
import com.neusoft.model.PeriodEmpInf;
import com.neusoft.service.PeriodInfService;

public class PeriodInfServiceImpl implements PeriodInfService{
	private PeriodInfDao periodinfDao;
	

	public void setPeriodinfDao(PeriodInfDao periodinfDao) {
		this.periodinfDao = periodinfDao;
	}
	//delete
public void deleteP(Long id){
		
		periodinfDao.deletebypid(id);
	}
public void deleteE(Long id){
	
	periodinfDao.deletebyeid(id);
}
//show
	@Override
	public List<PeriodEmpInf> isShow() {
		// TODO Auto-generated method stub
		 return periodinfDao.isShow();
	}
	
	
	//×ªÕý
	@Override
	public void updateEstatus(String ETrialstatus) {
		// TODO Auto-generated method stub
		periodinfDao.updateEstatus(ETrialstatus);
	}
	
	
	
	
	



	
	
	
}
