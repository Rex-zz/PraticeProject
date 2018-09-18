package com.pratice.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * StuDiary entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "stu_diary", catalog = "pratice")
public class StuDiary implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer stuId;
	private String stuName;
	private String stuClass;
	private String stuMajor;
	private String stuInstitute;
	private Date date;
	private String content;
	private String title;

	// Constructors

	/** default constructor */
	public StuDiary() {
	}

	/** full constructor */
	public StuDiary(Integer stuId, String stuName, String stuClass,
			String stuMajor, String stuInstitute, Date date, String content) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuClass = stuClass;
		this.stuMajor = stuMajor;
		this.stuInstitute = stuInstitute;
		this.date = date;
		this.content = content;
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

	@Column(name = "stu_id")
	public Integer getStuId() {
		return this.stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	@Column(name = "stu_name", length = 45)
	public String getStuName() {
		return this.stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	@Column(name = "stu_class", length = 45)
	public String getStuClass() {
		return this.stuClass;
	}

	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}

	@Column(name = "stu_major", length = 45)
	public String getStuMajor() {
		return this.stuMajor;
	}

	public void setStuMajor(String stuMajor) {
		this.stuMajor = stuMajor;
	}

	@Column(name = "stu_institute", length = 45)
	public String getStuInstitute() {
		return this.stuInstitute;
	}

	public void setStuInstitute(String stuInstitute) {
		this.stuInstitute = stuInstitute;
	}

	@Column(name = "date", length = 19)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "content", length = 500)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "title", length = 20)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}