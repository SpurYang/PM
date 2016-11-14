package com.neusoft.web;

import com.neusoft.model.EmployeeInf;
import com.neusoft.service.EmployeeInfService;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateEmpAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private EmployeeInf empinf;

	private EmployeeInfService emps;

	private Integer EId;
	private String EName;
	private String ESex;
	private String EBithday;
	private String ESid;
	private String EDept;
	private String EPost;
	private String EIndate;
	private String ECardate;
	private String EFormat;
	private String ESource;
	private String EPolitical;
	private String ENation;
	private String ENaresidence;
	private String EPhone;
	private String EEmail;
	private long EHeight;
	private String EBlood;
	private String EMarstatus;
	private String EBirthplace;
	private String ERegplace;
	private String ERecord;
	private String EDegree;
	private String ESchool;
	private String EProfession;
	private String EGradate;
	private String ETrialstatus;
	private String ETrstartdate;
	private String ETrenddate;

	

	

	public EmployeeInf getEmpinf() {
		return empinf;
	}

	public void setEmpinf(EmployeeInf empinf) {
		this.empinf = empinf;
	}

	public EmployeeInfService getEmps() {
		return emps;
	}

	public void setEmps(EmployeeInfService emps) {
		this.emps = emps;
	}

	public Integer getEId() {
		return EId;
	}

	public void setEId(Integer id) {
		EId = id;
	}

	public String getEName() {
		return EName;
	}

	public void setEName(String name) {
		EName = name;
	}

	public String getESex() {
		return ESex;
	}

	public void setESex(String sex) {
		ESex = sex;
	}

	public String getEBithday() {
		return EBithday;
	}

	public void setEBithday(String bithday) {
		EBithday = bithday;
	}

	public String getESid() {
		return ESid;
	}

	public void setESid(String sid) {
		ESid = sid;
	}

	public String getEDept() {
		return EDept;
	}

	public void setEDept(String dept) {
		EDept = dept;
	}

	public String getEPost() {
		return EPost;
	}

	public void setEPost(String post) {
		EPost = post;
	}

	public String getEIndate() {
		return EIndate;
	}

	public void setEIndate(String indate) {
		EIndate = indate;
	}

	public String getECardate() {
		return ECardate;
	}

	public void setECardate(String cardate) {
		ECardate = cardate;
	}

	public String getEFormat() {
		return EFormat;
	}

	public void setEFormat(String format) {
		EFormat = format;
	}

	public String getESource() {
		return ESource;
	}

	public void setESource(String source) {
		ESource = source;
	}

	public String getEPolitical() {
		return EPolitical;
	}

	public void setEPolitical(String political) {
		EPolitical = political;
	}

	public String getENation() {
		return ENation;
	}

	public void setENation(String nation) {
		ENation = nation;
	}

	public String getENaresidence() {
		return ENaresidence;
	}

	public void setENaresidence(String naresidence) {
		ENaresidence = naresidence;
	}

	public String getEPhone() {
		return EPhone;
	}

	public void setEPhone(String phone) {
		EPhone = phone;
	}

	public String getEEmail() {
		return EEmail;
	}

	public void setEEmail(String email) {
		EEmail = email;
	}

	public long getEHeight() {
		return EHeight;
	}

	public void setEHeight(long height) {
		EHeight = height;
	}

	public String getEBlood() {
		return EBlood;
	}

	public void setEBlood(String blood) {
		EBlood = blood;
	}

	public String getEMarstatus() {
		return EMarstatus;
	}

	public void setEMarstatus(String marstatus) {
		EMarstatus = marstatus;
	}

	public String getEBirthplace() {
		return EBirthplace;
	}

	public void setEBirthplace(String birthplace) {
		EBirthplace = birthplace;
	}

	public String getERegplace() {
		return ERegplace;
	}

	public void setERegplace(String regplace) {
		ERegplace = regplace;
	}

	public String getERecord() {
		return ERecord;
	}

	public void setERecord(String record) {
		ERecord = record;
	}

	public String getEDegree() {
		return EDegree;
	}

	public void setEDegree(String degree) {
		EDegree = degree;
	}

	public String getESchool() {
		return ESchool;
	}

	public void setESchool(String school) {
		ESchool = school;
	}

	public String getEProfession() {
		return EProfession;
	}

	public void setEProfession(String profession) {
		EProfession = profession;
	}

	public String getEGradate() {
		return EGradate;
	}

	public void setEGradate(String gradate) {
		EGradate = gradate;
	}

	public String getETrialstatus() {
		return ETrialstatus;
	}

	public void setETrialstatus(String trialstatus) {
		ETrialstatus = trialstatus;
	}

	public String getETrstartdate() {
		return ETrstartdate;
	}

	public void setETrstartdate(String trstartdate) {
		ETrstartdate = trstartdate;
	}

	public String getETrenddate() {
		return ETrenddate;
	}

	public void setETrenddate(String trenddate) {
		ETrenddate = trenddate;
	}

	
	public String isUpdate() {

		emps.updateById(this.getEName(), this.getESex(), this.getEBithday(),
				this.getESid(), this.getEDept(), this.getEPost(), this
						.getEIndate(), this.getECardate(), this.getEFormat(),
				this.getESource(), this.getEPolitical(), this.getENation(),
				this.getENaresidence(), this.getEPhone(), this.getEEmail(),
				this.getEHeight(), this.getEBlood(), this.getEMarstatus(), this
						.getEBirthplace(), this.getERegplace(), this
						.getERecord(), this.getEDegree(), this.getESchool(),
				this.getEProfession(), this.getEGradate(), this
						.getETrialstatus(), this.getETrstartdate(), this
						.getETrenddate(), this.getEId());

		return "success";
	}
}
