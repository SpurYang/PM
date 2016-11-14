package com.neusoft.service;

import java.util.List;

import com.neusoft.model.Language;

public interface LanguageService {
	/**
	 * 增加信息
	 * @param language
	 */
	public void save(Language la);
//	/**
//	 * 删除信息
//	 */
	public void delete(Long id);
	
	public void change(Long id,String language,String ability);
//	/**
//	 * 修改信息
//	 */
	public List<Language> show();
//	public void update(Language la);
	/**
	 * 显示信息
	 */
	
	
	
	public Language findAll(Long id);

}
