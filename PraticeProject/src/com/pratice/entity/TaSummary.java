package com.pratice.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TaSummary entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ta_summary", catalog = "pratice")

public class TaSummary implements java.io.Serializable {

	// Fields

	private Integer TId;
	private String summary;
	private Timestamp startdate;
	private Timestamp enddate;

	// Constructors

	/** default constructor */
	public TaSummary() {
	}

	/** full constructor */
	public TaSummary(String summary, Timestamp startdate, Timestamp enddate) {
		this.summary = summary;
		this.startdate = startdate;
		this.enddate = enddate;
	}

	// Property accessors
	@Id

	@Column(name = "t_id", unique = true, nullable = false)

	public Integer getTId() {
		return this.TId;
	}

	public void setTId(Integer TId) {
		this.TId = TId;
	}

	@Column(name = "summary", length = 45)

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Column(name = "startdate", length = 19)

	public Timestamp getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Timestamp startdate) {
		this.startdate = startdate;
	}

	@Column(name = "enddate", length = 19)

	public Timestamp getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Timestamp enddate) {
		this.enddate = enddate;
	}

}