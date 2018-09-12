package com.pratice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "teacher", catalog = "pratice")
public class Teacher implements java.io.Serializable {

	// Fields

	private String Id;
	private String Name;
	private String Tel;
	private String Major;
	private Integer Stunum;
	private String Password;

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** minimal constructor */
	public Teacher(String TName, String TTel, String TMajor, String TPassword) {
		this.Name = TName;
		this.Tel = TTel;
		this.Major = TMajor;
		this.Password = TPassword;
	}

	/** full constructor */
	public Teacher(String TName, String TTel, String TMajor, Integer TStunum,
			String TPassword) {
		this.Name = TName;
		this.Tel = TTel;
		this.Major = TMajor;
		this.Stunum = TStunum;
		this.Password = TPassword;
	}

	// Property accessors
	@Id
	@Column(name = "t_id", unique = true, nullable = false, length = 45)
	public String getId() {
		return this.Id;
	}

	public void setId(String TId) {
		this.Id = TId;
	}

	@Column(name = "t_name", nullable = false, length = 45)
	public String getName() {
		return this.Name;
	}

	public void setName(String TName) {
		this.Name = TName;
	}

	@Column(name = "t_tel", nullable = false, length = 45)
	public String getTel() {
		return this.Tel;
	}

	public void setTel(String TTel) {
		this.Tel = TTel;
	}

	@Column(name = "t_major", nullable = false, length = 45)
	public String getMajor() {
		return this.Major;
	}

	public void setMajor(String TMajor) {
		this.Major = TMajor;
	}

	@Column(name = "t_stunum")
	public Integer getStunum() {
		return this.Stunum;
	}

	public void setStunum(Integer TStunum) {
		this.Stunum = TStunum;
	}

	@Column(name = "t_password", nullable = false, length = 45)
	public String getPassword() {
		return this.Password;
	}

	public void setPassword(String TPassword) {
		this.Password = TPassword;
	}

}