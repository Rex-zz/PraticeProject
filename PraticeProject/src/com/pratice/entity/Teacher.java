package com.pratice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "teacher", catalog = "pratice")

public class Teacher implements java.io.Serializable {

	// Fields

	private String TId;
	private String TName;
	private String TTel;
	private String TMajor;
	private Integer TStunum;
	private String TPassword;

	// Constructors

	/** default constructor */
	public Teacher() {
	}
	
	/** minimal constructor */
	public Teacher(String TName, String TTel, String TMajor, String TPassword) {
		this.TName = TName;
		this.TTel = TTel;
		this.TMajor = TMajor;
		this.TPassword = TPassword;
	}

	/** full constructor */
	public Teacher(String TId,String TName, String TTel, String TMajor, Integer TStunum, String TPassword) {
		this.TId=TId;
		this.TName = TName;
		this.TTel = TTel;
		this.TMajor = TMajor;
		this.TStunum = TStunum;
		this.TPassword = TPassword;
	}
	
	// Property accessors
	@Id

	@Column(name = "t_id", unique = true, nullable = false, length = 45)

	public String getTId() {
		return this.TId;
	}

	public void setTId(String TId) {
		this.TId = TId;
	}

	@Column(name = "t_name", nullable = false, length = 45)

	public String getTName() {
		return this.TName;
	}

	public void setTName(String TName) {
		this.TName = TName;
	}

	@Column(name = "t_tel", nullable = false, length = 45)

	public String getTTel() {
		return this.TTel;
	}

	public void setTTel(String TTel) {
		this.TTel = TTel;
	}

	@Column(name = "t_major", nullable = false, length = 45)

	public String getTMajor() {
		return this.TMajor;
	}

	public void setTMajor(String TMajor) {
		this.TMajor = TMajor;
	}

	@Column(name = "t_stunum")

	public Integer getTStunum() {
		return this.TStunum;
	}

	public void setTStunum(Integer TStunum) {
		this.TStunum = TStunum;
	}

	@Column(name = "t_password", nullable = false, length = 45)

	public String getTPassword() {
		return this.TPassword;
	}

	public void setTPassword(String TPassword) {
		this.TPassword = TPassword;
	}

}