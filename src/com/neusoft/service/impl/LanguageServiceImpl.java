package com.neusoft.service.impl;

import java.util.List;

import com.neusoft.dao.LanguageDao;
import com.neusoft.model.Language;
import com.neusoft.service.LanguageService;

public class LanguageServiceImpl implements LanguageService{
	
	private LanguageDao languageDao ;
	
	public void setLanguageDao(LanguageDao languageDao) {
		
		this.languageDao = languageDao;
	}

	public void save(Language la) {
		languageDao.save(la);
	}

	@Override
	
	public List<Language> show(){
		return languageDao.findAll();
		
		
	}
//
//	@Override
//	public void update(Language la) {
//		// TODO Auto-generated method stub
//		languageDao.update(la);
//
//	}

	@Override
	public void delete(Long id) {
		languageDao.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void change(Long id, String language, String ability) {
	// TODO Auto-generated method stub
		languageDao.changeById(id, language, ability);
	
}

	@Override
	public Language findAll(Long id) {
		// TODO Auto-generated method stub
		return languageDao.findlaAll(id);
	
	}


	
}
