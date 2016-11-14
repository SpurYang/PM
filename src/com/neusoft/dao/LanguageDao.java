package com.neusoft.dao;

import com.neusoft.model.Language;


public interface LanguageDao extends GenericDao<Language, Integer>{
	
	public void deleteById(long id);
	public void changeById(final long id,String language,String ability);
	public Language findlaAll(Long id);

}
