package com.neusoft.service;

import java.util.List;

import com.neusoft.model.CareerInf;

public interface CareerService {
	public void save(CareerInf ca);
	public void delete(Long id);
	public List<CareerInf> show();
	public void changeById(long id,String Sdate,String Edate,String unit,String Work,String Post,Long Money,String Proman,String pPost,String Phone,String Note);
	public CareerInf findAll(Long id);

}
