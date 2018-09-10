package com.pratice.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "class", catalog = "pratice")

public class Class implements java.io.Serializable {

	// Fields

	private Integer id;
	private String class_;
	private String major;
	private String institute;
	private Timestamp starttime;
	private Timestamp endtime;

	// Constructors

	/** default constructor */
	public Class() {
	}

	/** full constructor */
	public Class(String class_, String major, String institute, Timestamp starttime, Timestamp endtime) {
		this.class_ = class_;
		this.major = major;
		this.institute = institute;
		this.starttime = starttime;
		this.endtime = endtime;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "class", nullable = false, length = 45)

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	@Column(name = "major", nullable = false, length = 45)

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Column(name = "institute", nullable = false, length = 45)

	public String getInstitute() {
		return this.institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	@Column(name = "starttime", nullable = false, length = 19)

	public Timestamp getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}

	@Column(name = "endtime", nullable = false, length = 19)

	public Timestamp getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}

}