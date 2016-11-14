package com.neusoft.model;

/**
 * CareerInf entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class CareerInf implements java.io.Serializable {

	// Fields

	private long EId;
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

	// Constructors

	/** default constructor */
	public CareerInf() {
	}

	/** full constructor */
	public CareerInf(String caSdate, String caEdate, String caUnit,
			String caWork, String caPost, long caMoney, String caProman,
			String pmPost, String pmPhone, String pmNote) {
		this.caSdate = caSdate;
		this.caEdate = caEdate;
		this.caUnit = caUnit;
		this.caWork = caWork;
		this.caPost = caPost;
		this.caMoney = caMoney;
		this.caProman = caProman;
		this.pmPost = pmPost;
		this.pmPhone = pmPhone;
		this.pmNote = pmNote;
	}

	// Property accessors

	public long getEId() {
		return this.EId;
	}

	public void setEId(long EId) {
		this.EId = EId;
	}

	public String getCaSdate() {
		return this.caSdate;
	}

	public void setCaSdate(String caSdate) {
		this.caSdate = caSdate;
	}

	public String getCaEdate() {
		return this.caEdate;
	}

	public void setCaEdate(String caEdate) {
		this.caEdate = caEdate;
	}

	public String getCaUnit() {
		return this.caUnit;
	}

	public void setCaUnit(String caUnit) {
		this.caUnit = caUnit;
	}

	public String getCaWork() {
		return this.caWork;
	}

	public void setCaWork(String caWork) {
		this.caWork = caWork;
	}

	public String getCaPost() {
		return this.caPost;
	}

	public void setCaPost(String caPost) {
		this.caPost = caPost;
	}

	public long getCaMoney() {
		return this.caMoney;
	}

	public void setCaMoney(long caMoney) {
		this.caMoney = caMoney;
	}

	public String getCaProman() {
		return this.caProman;
	}

	public void setCaProman(String caProman) {
		this.caProman = caProman;
	}

	public String getPmPost() {
		return this.pmPost;
	}

	public void setPmPost(String pmPost) {
		this.pmPost = pmPost;
	}

	public String getPmPhone() {
		return this.pmPhone;
	}

	public void setPmPhone(String pmPhone) {
		this.pmPhone = pmPhone;
	}

	public String getPmNote() {
		return this.pmNote;
	}

	public void setPmNote(String pmNote) {
		this.pmNote = pmNote;
	}

}