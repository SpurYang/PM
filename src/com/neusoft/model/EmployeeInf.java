package com.neusoft.model;

/**
 * EmployeeInf entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class EmployeeInf implements java.io.Serializable {

	// Fields

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

	// Constructors

	/** default constructor */
	public EmployeeInf() {
	}

	/** full constructor */
	public EmployeeInf(String EName, String ESex, String EBithday, String ESid,
			String EDept, String EPost, String EIndate, String ECardate,
			String EFormat, String ESource, String EPolitical, String ENation,
			String ENaresidence, String EPhone, String EEmail, long EHeight,
			String EBlood, String EMarstatus, String EBirthplace,
			String ERegplace, String ERecord, String EDegree, String ESchool,
			String EProfession, String EGradate, String ETrialstatus,
			String ETrstartdate, String ETrenddate) {
		this.EName = EName;
		this.ESex = ESex;
		this.EBithday = EBithday;
		this.ESid = ESid;
		this.EDept = EDept;
		this.EPost = EPost;
		this.EIndate = EIndate;
		this.ECardate = ECardate;
		this.EFormat = EFormat;
		this.ESource = ESource;
		this.EPolitical = EPolitical;
		this.ENation = ENation;
		this.ENaresidence = ENaresidence;
		this.EPhone = EPhone;
		this.EEmail = EEmail;
		this.EHeight = EHeight;
		this.EBlood = EBlood;
		this.EMarstatus = EMarstatus;
		this.EBirthplace = EBirthplace;
		this.ERegplace = ERegplace;
		this.ERecord = ERecord;
		this.EDegree = EDegree;
		this.ESchool = ESchool;
		this.EProfession = EProfession;
		this.EGradate = EGradate;
		this.ETrialstatus = ETrialstatus;
		this.ETrstartdate = ETrstartdate;
		this.ETrenddate = ETrenddate;
	}

	// Property accessors

	public Integer getEId() {
		return this.EId;
	}

	public void setEId(Integer EId) {
		this.EId = EId;
	}

	public String getEName() {
		return this.EName;
	}

	public void setEName(String EName) {
		this.EName = EName;
	}

	public String getESex() {
		return this.ESex;
	}

	public void setESex(String ESex) {
		this.ESex = ESex;
	}

	public String getEBithday() {
		return this.EBithday;
	}

	public void setEBithday(String EBithday) {
		this.EBithday = EBithday;
	}

	public String getESid() {
		return this.ESid;
	}

	public void setESid(String ESid) {
		this.ESid = ESid;
	}

	public String getEDept() {
		return this.EDept;
	}

	public void setEDept(String EDept) {
		this.EDept = EDept;
	}

	public String getEPost() {
		return this.EPost;
	}

	public void setEPost(String EPost) {
		this.EPost = EPost;
	}

	public String getEIndate() {
		return this.EIndate;
	}

	public void setEIndate(String EIndate) {
		this.EIndate = EIndate;
	}

	public String getECardate() {
		return this.ECardate;
	}

	public void setECardate(String ECardate) {
		this.ECardate = ECardate;
	}

	public String getEFormat() {
		return this.EFormat;
	}

	public void setEFormat(String EFormat) {
		this.EFormat = EFormat;
	}

	public String getESource() {
		return this.ESource;
	}

	public void setESource(String ESource) {
		this.ESource = ESource;
	}

	public String getEPolitical() {
		return this.EPolitical;
	}

	public void setEPolitical(String EPolitical) {
		this.EPolitical = EPolitical;
	}

	public String getENation() {
		return this.ENation;
	}

	public void setENation(String ENation) {
		this.ENation = ENation;
	}

	public String getENaresidence() {
		return this.ENaresidence;
	}

	public void setENaresidence(String ENaresidence) {
		this.ENaresidence = ENaresidence;
	}

	public String getEPhone() {
		return this.EPhone;
	}

	public void setEPhone(String EPhone) {
		this.EPhone = EPhone;
	}

	public String getEEmail() {
		return this.EEmail;
	}

	public void setEEmail(String EEmail) {
		this.EEmail = EEmail;
	}

	public long getEHeight() {
		return this.EHeight;
	}

	public void setEHeight(long EHeight) {
		this.EHeight = EHeight;
	}

	public String getEBlood() {
		return this.EBlood;
	}

	public void setEBlood(String EBlood) {
		this.EBlood = EBlood;
	}

	public String getEMarstatus() {
		return this.EMarstatus;
	}

	public void setEMarstatus(String EMarstatus) {
		this.EMarstatus = EMarstatus;
	}

	public String getEBirthplace() {
		return this.EBirthplace;
	}

	public void setEBirthplace(String EBirthplace) {
		this.EBirthplace = EBirthplace;
	}

	public String getERegplace() {
		return this.ERegplace;
	}

	public void setERegplace(String ERegplace) {
		this.ERegplace = ERegplace;
	}

	public String getERecord() {
		return this.ERecord;
	}

	public void setERecord(String ERecord) {
		this.ERecord = ERecord;
	}

	public String getEDegree() {
		return this.EDegree;
	}

	public void setEDegree(String EDegree) {
		this.EDegree = EDegree;
	}

	public String getESchool() {
		return this.ESchool;
	}

	public void setESchool(String ESchool) {
		this.ESchool = ESchool;
	}

	public String getEProfession() {
		return this.EProfession;
	}

	public void setEProfession(String EProfession) {
		this.EProfession = EProfession;
	}

	public String getEGradate() {
		return this.EGradate;
	}

	public void setEGradate(String EGradate) {
		this.EGradate = EGradate;
	}

	public String getETrialstatus() {
		return this.ETrialstatus;
	}

	public void setETrialstatus(String ETrialstatus) {
		this.ETrialstatus = ETrialstatus;
	}

	public String getETrstartdate() {
		return this.ETrstartdate;
	}

	public void setETrstartdate(String ETrstartdate) {
		this.ETrstartdate = ETrstartdate;
	}

	public String getETrenddate() {
		return this.ETrenddate;
	}

	public void setETrenddate(String ETrenddate) {
		this.ETrenddate = ETrenddate;
	}

}