package com.neusoft.dao;

import com.neusoft.model.CareerInf;


public interface CareerDao extends GenericDao<CareerInf, Integer>{
	public void deleteById(long id);
	public void changeById(final long id,String Sdate,String Edate,String unit,String Work,String Post,Long Money,String Proman,String pPost,String Phone,String Note);
	public CareerInf findlaAll(Long id);



}
