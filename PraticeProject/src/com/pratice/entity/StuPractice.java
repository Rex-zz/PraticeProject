package com.pratice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * StuPractice entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "stu_practice", catalog = "pratice")
public class StuPractice implements java.io.Serializable {

	// Fields

	private String SId;
	private Date SStartdate;
	private Date SEnddate;
	private String SPraName;
	private String SJob;

	// Constructors

	/** default constructor */
	public StuPractice() {
	}

	/** full constructor */
	public StuPractice(Date SStartdate, Date SEnddate, String SPraName,
			String SJob) {
		this.SStartdate = SStartdate;
		this.SEnddate = SEnddate;
		this.SPraName = SPraName;
		this.SJob = SJob;
	}

	// Property accessors
	@Id
	@Column(name = "s_id", unique = true, nullable = false, length = 45)
	public String getSId() {
		return this.SId;
	}

	public void setSId(String SId) {
		this.SId = SId;
	}

	@Column(name = "s_startdate", length = 19)
	public Date getSStartdate() {
		return this.SStartdate;
	}

	public void setSStartdate(Date start) {
		this.SStartdate = start;
	}

	@Column(name = "s_enddate", length = 19)
	public Date getSEnddate() {
		return this.SEnddate;
	}

	public void setSEnddate(Date end) {
		this.SEnddate = end;
	}

	@Column(name = "s_pra_name", length = 45)
	public String getSPraName() {
		return this.SPraName;
	}

	public void setSPraName(String SPraName) {
		this.SPraName = SPraName;
	}

	@Column(name = "s_job", length = 45)
	public String getSJob() {
		return this.SJob;
	}

	public void setSJob(String SJob) {
		this.SJob = SJob;
	}

}