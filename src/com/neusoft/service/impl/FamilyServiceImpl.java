package com.neusoft.service.impl;

import java.util.List;

import com.neusoft.dao.FamilyDao;
import com.neusoft.model.FamilyRelation;
import com.neusoft.service.FamilyService;

public class FamilyServiceImpl implements FamilyService {
	private FamilyDao familyDao;

	public void setFamilyDao(FamilyDao familyDao) {
		this.familyDao = familyDao;
	}
	public void save(FamilyRelation fa){
		familyDao.save(fa);
	}
	@Override
	public List<FamilyRelation> show() {
		// TODO Auto-generated method stub
		return familyDao.findAll();
	}
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		familyDao.deleteById(id);
		
	}
	@Override
	public void change(long id, String relation, String name, String unit,
			String post, String phone) {
		// TODO Auto-generated method stub
		familyDao.changeById(id, relation, name, unit, post, phone);
		
	}
	@Override
	public FamilyRelation findAll(Long id) {
		// TODO Auto-generated method stub
		return familyDao.findlaAll(id);
	}

}
