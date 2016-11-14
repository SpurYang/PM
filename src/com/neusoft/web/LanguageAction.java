package com.neusoft.web;

import java.util.List;

import com.neusoft.model.Language;
import com.neusoft.service.LanguageService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LanguageAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LanguageService languageService;
	private String EAbility;
	private String ELanguage;
	private long EId;

	public long getEId() {
		return EId;
	}
	
	public void setEId(long id) {
		EId = id;
	}

	public String getEAbility() {
		return EAbility;
	}

	public void setEAbility(String ability) {
		EAbility = ability;
	}

	public String getELanguage() {
		return ELanguage;
	}

	public void setELanguage(String language) {
		ELanguage = language;
	}

	public void setLanguageService(LanguageService languageService) {
		this.languageService = languageService;
	}

	public String isadd() {
		Language language = new Language();

		language.setEAbility(getEAbility());
		language.setELanguage(getELanguage());
		languageService.save(language);
		System.out.println("success save");
		return "success";

	}

	public String isshow() {
		Language language = new Language();

		language.setEId(getEId());
		language.setEAbility(getEAbility());
		language.setELanguage(getELanguage());

		List<Language> list = languageService.show();
		if (list == null) {
			return "error";
		} else {
			ActionContext.getContext().getSession().put("list", list);

			System.out.println("success save");
			return "success";
		}
	}

	public String isdelete() {
//		Language language = new Language();
//		language.getEId();
		languageService.delete(this.getEId());
		System.out.println("success delete");
		return "success";
	}
	public String ischange(){
		
		
		languageService.change(this.getEId(), this.getELanguage(), this.getEAbility());
		System.out.println("success update");
		return "success";
	}
	
	public String find(){
		Language la=languageService.findAll(this.getEId());
		ActionContext.getContext().getSession().put("l", la);
		return "success";	
	}




}
