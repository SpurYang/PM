package com.neusoft.web;

import java.util.List;


import com.neusoft.model.FamilyRelation;
import com.neusoft.service.FamilyService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FamilyAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private FamilyRelation family;
	private FamilyService familyService;
	private Long EId;
	private String ERelation;
	private String reName;
	private String reUnit;
	private String rePost;
	private String rePhone;
	
	public String getERelation() {
		return ERelation;
	}
	public void setERelation(String relation) {
		ERelation = relation;
	}
	public String getReName() {
		return reName;
	}
	public void setReName(String reName) {
		this.reName = reName;
	}
	public String getReUnit() {
		return reUnit;
	}
	public void setReUnit(String reUnit) {
		this.reUnit = reUnit;
	}
	public String getRePost() {
		return rePost;
	}
	public void setRePost(String rePost) {
		this.rePost = rePost;
	}
	public String getRePhone() {
		return rePhone;
	}
	public void setRePhone(String rePhone) {
		this.rePhone = rePhone;
	}
	public Long getEId() {
		return EId;
	}
	public void setEId(Long id) {
		EId = id;
	}
	public FamilyRelation getFamily() {
		return family;
	}
	public void setFamily(FamilyRelation family) {
		this.family = family;
	}
	public void setFamilyService(FamilyService familyService) {
		this.familyService = familyService;
	}
	public String add(){
		familyService.save(family);
		System.out.println("success save");
		return "success";
	}
	public String isshow(){
		List<FamilyRelation>list=familyService.show();
		if(list==null){
			return "error";
		}else{
			ActionContext.getContext().getSession().put("list",list);
		
		System.out.println("success save");
		return "success";
		}
	}
	public String isdelete(){
		familyService.delete(this.getEId());
		System.out.println("success delete");
		return "success";
	}
	public String ischange(){
		familyService.change(this.getEId(),this.getERelation(), this.getReName(), this.getReUnit(), this.getRePost(), this.getRePhone());
		System.out.println("success change");
		return "success";
	}
	public String find(){
		FamilyRelation fa=familyService.findAll(this.getEId());
		ActionContext.getContext().getSession().put("f", fa);
		System.out.println("success find");
		return "success";
	}

}
