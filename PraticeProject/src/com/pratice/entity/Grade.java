package com.pratice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Grade entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "grade", catalog = "pratice")

public class Grade implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer stuId;
	private String teaId;
	private String comment;
	private Integer score;

	// Constructors

	/** default constructor */
	public Grade() {
	}

	/** full constructor */
	public Grade(Integer stuId, String teaId, String comment, Integer score) {
		this.stuId = stuId;
		this.teaId = teaId;
		this.comment = comment;
		this.score = score;
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

	@Column(name = "tea_id", length = 45)

	public String getTeaId() {
		return this.teaId;
	}

	public void setTeaId(String teaId) {
		this.teaId = teaId;
	}

	@Column(name = "comment", length = 200)

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Column(name = "score")

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

}