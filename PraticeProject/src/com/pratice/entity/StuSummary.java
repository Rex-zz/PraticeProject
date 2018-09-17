package com.pratice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * StuSummary entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "stu_summary", catalog = "pratice")

public class StuSummary implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private String class_;
	private String major;
	private String content;

	// Constructors

	/** default constructor */
	public StuSummary() {
	}

	/** full constructor */
	public StuSummary(String name, String class_, String major, String content) {
		this.name = name;
		this.class_ = class_;
		this.major = major;
		this.content = content;
	}

	// Property accessors
	@Id

	@Column(name = "id", unique = true, nullable = false, length = 20)

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "name", length = 45)

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "class", length = 45)

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	@Column(name = "major", length = 45)

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Column(name = "content", length = 500)

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}