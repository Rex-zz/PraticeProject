package com.pratice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * StuContactTea entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "stu _contact_tea", catalog = "pratice")

public class StuContactTea implements java.io.Serializable {

	// Fields

	private Integer id;
	private String stuName;
	private String stuId;
	private String teaId;
	private String teaName;
	private String note;

	// Constructors

	/** default constructor */
	public StuContactTea() {
	}

	/** full constructor */
	public StuContactTea(String stuName, String stuId, String teaId, String teaName, String note) {
		this.stuName = stuName;
		this.stuId = stuId;
		this.teaId = teaId;
		this.teaName = teaName;
		this.note = note;
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

	@Column(name = "tea_id", length = 45)

	public String getTeaId() {
		return this.teaId;
	}

	public void setTeaId(String teaId) {
		this.teaId = teaId;
	}

	@Column(name = "tea_name", length = 45)

	public String getTeaName() {
		return this.teaName;
	}

	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}

	@Column(name = "note", length = 500)

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}