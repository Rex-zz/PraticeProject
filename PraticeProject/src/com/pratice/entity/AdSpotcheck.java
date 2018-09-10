package com.pratice.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AdSpotcheck entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ad_spotcheck", catalog = "pratice")

public class AdSpotcheck implements java.io.Serializable {

	// Fields

	private Integer id;
	private String stuName;
	private String stuId;
	private String adId;
	private String adName;
	private String note;
	private Timestamp date;

	// Constructors

	/** default constructor */
	public AdSpotcheck() {
	}

	/** full constructor */
	public AdSpotcheck(String stuName, String stuId, String adId, String adName, String note, Timestamp date) {
		this.stuName = stuName;
		this.stuId = stuId;
		this.adId = adId;
		this.adName = adName;
		this.note = note;
		this.date = date;
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

	@Column(name = "stu_name", length = 45)

	public String getStuName() {
		return this.stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	@Column(name = "stu_id", length = 45)

	public String getStuId() {
		return this.stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	@Column(name = "ad_id", length = 45)

	public String getAdId() {
		return this.adId;
	}

	public void setAdId(String adId) {
		this.adId = adId;
	}

	@Column(name = "ad_name", length = 45)

	public String getAdName() {
		return this.adName;
	}

	public void setAdName(String adName) {
		this.adName = adName;
	}

	@Column(name = "note", length = 45)

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "date", length = 19)

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

}