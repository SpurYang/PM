package com.neusoft.service.impl;

import java.util.List;

import com.neusoft.dao.EmployeeInfDao;
import com.neusoft.model.EmployeeInf;
import com.neusoft.service.EmployeeInfService;

public class EmployeeInfServiceImpl implements EmployeeInfService {

	private EmployeeInfDao empInfDao;

	public void setEmpInfDao(EmployeeInfDao empInfDao) {
		this.empInfDao = empInfDao;
	}

	@Override
	public List<EmployeeInf> getMessage() {

		return empInfDao.findAll();
	}
	
	public EmployeeInf detailedMessage(Integer id) {
		
		return empInfDao.findById(id);
	}
	
	public void save(EmployeeInf ei) {
		empInfDao.save(ei);
	}
	
	public void updateById(String EName,String ESex,
			String EBithday, String ESid, String EDept,
			 String EPost, String EIndate, String ECardate,
			 String EFormat, String ESource,  String EPolitical,
			 String ENation, String ENaresidence, String EPhone,
			 String EEmail, Long EHeight, String EBlood,
			 String EMarstatus, String EBirthplace, String ERegplace,
			 String ERecord, String EDegree, String ESchool,
			 String EProfession, String EGradate, String ETrialstatus,
			 String ETrstartdate, String ETrenddate,Integer id) {
		empInfDao.updateById(EName,ESex,
				EBithday, ESid,  EDept,
				  EPost,  EIndate,  ECardate,
				 EFormat,  ESource,   EPolitical,
				  ENation,  ENaresidence, EPhone,
				  EEmail,  EHeight,  EBlood,
				  EMarstatus,  EBirthplace,  ERegplace,
				  ERecord,  EDegree,  ESchool,
				  EProfession,  EGradate,  ETrialstatus,
				  ETrstartdate,  ETrenddate,id);
	}
	
	public void delete(Integer id) {
		
		empInfDao.deleteById(id);
	}
	
	public void induction(Integer id,String EDept,String EPost,String EIndate,String ETrialstatus,String ETrstartdate,String ETrenddate) {
		
		empInfDao.induction(id, EDept, EPost, EIndate, ETrialstatus,ETrstartdate, ETrenddate);
	}
}
