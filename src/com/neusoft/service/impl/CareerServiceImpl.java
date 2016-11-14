package com.neusoft.service.impl;

import java.util.List;

import com.neusoft.dao.CareerDao;
import com.neusoft.model.CareerInf;
import com.neusoft.service.CareerService;

public class CareerServiceImpl implements CareerService{
	private CareerDao careerDao;

	public void setCareerDao(CareerDao careerDao) {
		this.careerDao = careerDao;
	}
	public void save(CareerInf ca){
		careerDao.save(ca);
	}
	
	public List<CareerInf> show(){
		return careerDao.findAll();
		
	}
	@Override
	public void delete(Long id) {
		careerDao.deleteById(id);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void changeById(long id, String Sdate, String Edate, String unit,
			String Work, String Post, Long Money, String Proman, String pPost,
			String Phone, String Note) {
		careerDao.changeById(id, Sdate, Edate, unit, Work, Post, Money, Proman, pPost, Phone, Note);
		// TODO Auto-generated method stub
		
	}
	@Override
	public CareerInf findAll(Long id) {
		// TODO Auto-generated method stub
		return careerDao.findlaAll(id);
	}

}
