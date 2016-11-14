package com.neusoft.web;

import java.util.List;

import com.neusoft.model.CareerInf;
import com.neusoft.service.CareerService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CareerAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CareerInf career;
	private CareerService careerService;
	private Long EId;
	private String caSdate;
	private String caEdate;
	private String caUnit;
	private String caWork;
	private String caPost;
	private long caMoney;
	private String caProman;
	private String pmPost;
	private String pmPhone;
	private String pmNote;
	
	public Long getEId() {
		return EId;
	}
	public void setEId(Long id) {
		EId = id;
	}
	
	public String getCaSdate() {
		return caSdate;
	}
	public void setCaSdate(String caSdate) {
		this.caSdate = caSdate;
	}
	public String getCaEdate() {
		return caEdate;
	}
	public void setCaEdate(String caEdate) {
		this.caEdate = caEdate;
	}
	public String getCaUnit() {
		return caUnit;
	}
	public void setCaUnit(String caUnit) {
		this.caUnit = caUnit;
	}
	public String getCaWork() {
		return caWork;
	}
	public void setCaWork(String caWork) {
		this.caWork = caWork;
	}
	public String getCaPost() {
		return caPost;
	}
	public void setCaPost(String caPost) {
		this.caPost = caPost;
	}
	public long getCaMoney() {
		return caMoney;
	}
	public void setCaMoney(long caMoney) {
		this.caMoney = caMoney;
	}
	public String getCaProman() {
		return caProman;
	}
	public void setCaProman(String caProman) {
		this.caProman = caProman;
	}
	public String getPmPost() {
		return pmPost;
	}
	public void setPmPost(String pmPost) {
		this.pmPost = pmPost;
	}
	public String getPmPhone() {
		return pmPhone;
	}
	public void setPmPhone(String pmPhone) {
		this.pmPhone = pmPhone;
	}
	public String getPmNote() {
		return pmNote;
	}
	public void setPmNote(String pmNote) {
		this.pmNote = pmNote;
	}
	
	
	public CareerInf getCareer() {
		return career;
	}
	public void setCareer(CareerInf career) {
		this.career = career;
	}
	public void setCareerService(CareerService careerService) {
		this.careerService = careerService;
	}
	public String add(){
		careerService.save(career);
		System.out.println("success save");
		return "success";
	}
	public String isdelete(){
		careerService.delete(this.getEId());
		System.out.println("success delete");
		return "success";
	}
	public String isshow(){
		List<CareerInf>list=careerService.show();
		if(list==null){
			return "error";
		}else{
			ActionContext.getContext().getSession().put("list",list);
		
		System.out.println("success save");
		return "success";
		}
	}
	
	/*public String isshow() {
		
	}*/
	public String ischange(){
		careerService.changeById(this.getEId(),this.getCaSdate(),this.getCaEdate(),this.getCaUnit(),this.getCaWork(),this.getCaPost(),this.getCaMoney(),this.getCaProman(), this.getPmPost(), this.getPmPhone(), this.getPmNote());
		System.out.println("success change");
		return "success";
	}
	public String find(){
		CareerInf ca=careerService.findAll(this.getEId());
		ActionContext.getContext().getSession().put("c", ca);
		System.out.println("success find");
		return "success";
	}
	

}
