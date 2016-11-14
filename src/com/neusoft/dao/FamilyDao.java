package com.neusoft.dao;

import com.neusoft.model.FamilyRelation;


public interface FamilyDao extends GenericDao<FamilyRelation, Integer>{
	public void deleteById(long id);
	public void changeById(final long id,String relation,String name,String unit,String post,String phone);
	public FamilyRelation findlaAll(Long id);

}
