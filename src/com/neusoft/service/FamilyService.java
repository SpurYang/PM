package com.neusoft.service;

import java.util.List;

import com.neusoft.model.FamilyRelation;

public interface FamilyService {
	public void save(FamilyRelation fa);
	public List<FamilyRelation> show();
	public void delete(Long id);
	public void change(long id,String relation,String name,String unit,String post,String phone);
	public FamilyRelation findAll(Long id);
}
