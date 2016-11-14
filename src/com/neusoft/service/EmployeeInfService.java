package com.neusoft.service;

import java.util.List;

import com.neusoft.model.EmployeeInf;

public interface EmployeeInfService {
	
	public List<EmployeeInf> getMessage();
	
	public EmployeeInf detailedMessage(Integer id);
	
	/*public void save(Integer id,String EName,String ESex,
			String EBithday, String ESid, String EDept,
			 String EPost, String EIndate, String ECardate,
			 String EFormat, String ESource,  String EPolitical,
			 String ENation, String ENaresidence, String EPhone,
			 String EEmail, Long EHeight, String EBlood,
			 String EMarstatus, String EBirthplace, String ERegplace,
			 String ERecord, String EDegree, String ESchool,
			 String EProfession, String EGradate, String ETrialstatus,
			 String ETrstartdate, String ETrenddate);*/
	public void save(EmployeeInf ei);
	
	public void updateById(String EName,String ESex,
			String EBithday, String ESid, String EDept,
			 String EPost, String EIndate, String ECardate,
			 String EFormat, String ESource,  String EPolitical,
			 String ENation, String ENaresidence, String EPhone,
			 String EEmail, Long EHeight, String EBlood,
			 String EMarstatus, String EBirthplace, String ERegplace,
			 String ERecord, String EDegree, String ESchool,
			 String EProfession, String EGradate, String ETrialstatus,
			 String ETrstartdate, String ETrenddate,Integer id);
	
	public void delete(Integer id);
	
	public void induction(Integer id,String EDept,String EPost,String EIndate,String ETrialstatus,String ETrstartdate,String ETrenddate);
}
