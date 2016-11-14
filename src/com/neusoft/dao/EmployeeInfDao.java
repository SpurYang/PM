package com.neusoft.dao;

import com.neusoft.model.EmployeeInf;

public interface EmployeeInfDao extends GenericDao<EmployeeInf, Integer>{
	
	public void updateById(final String EName,final String ESex,
			final String EBithday,final String ESid,final String EDept,
			final String EPost,final String EIndate,final String ECardate,
			final String EFormat,final String ESource, final String EPolitical,
			final String ENation,final String ENaresidence,final String EPhone,
			final String EEmail,final Long EHeight,final String EBlood,
			final String EMarstatus,final String EBirthplace,final String ERegplace,
			final String ERecord,final String EDegree,final String ESchool,
			final String EProfession,final String EGradate,final String ETrialstatus,
			final String ETrstartdate,final String ETrenddate,final Integer id);

	public void deleteById(final Integer id);
	
	public void induction(final Integer id,final String EDept,final String EPost,final String EIndate,
			final String ETrialstatus,final String ETrstartdate,final String ETrenddate);
}
