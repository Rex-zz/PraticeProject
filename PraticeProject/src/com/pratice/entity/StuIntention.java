package com.pratice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * StuIntention entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "stu_intention", catalog = "pratice")

public class StuIntention implements java.io.Serializable {

	// Fields

	private Integer id;
	private String SId;
	private String SName;
	private String STel;
	private String SSex;
	private Integer SInMode;

	// Constructors

	/** default constructor */
	public StuIntention() {
	}

	/** full constructor */
	public StuIntention(String SId, String SName, String STel, String SSex, Integer SInMode) {
		this.SId = SId;
		this.SName = SName;
		this.STel = STel;
		this.SSex = SSex;
		this.SInMode = SInMode;
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

	@Column(name = "s_id", length = 45)

	public String getSId() {
		return this.SId;
	}

	public void setSId(String SId) {
		this.SId = SId;
	}

	@Column(name = "s_name", length = 45)

	public String getSName() {
		return this.SName;
	}

	public void setSName(String SName) {
		this.SName = SName;
	}

	@Column(name = "s_tel", length = 45)

	public String getSTel() {
		return this.STel;
	}

	public void setSTel(String STel) {
		this.STel = STel;
	}

	@Column(name = "s_sex", length = 45)

	public String getSSex() {
		return this.SSex;
	}

	public void setSSex(String SSex) {
		this.SSex = SSex;
	}

	@Column(name = "s_in_mode")

	public Integer getSInMode() {
		return this.SInMode;
	}

	public void setSInMode(Integer SInMode) {
		this.SInMode = SInMode;
	}

}