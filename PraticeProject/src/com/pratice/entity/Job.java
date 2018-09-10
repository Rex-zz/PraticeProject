package com.pratice.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Job entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "job", catalog = "pratice")

public class Job implements java.io.Serializable {

	// Fields

	private Integer id;
	private Unit unit;
	private String position;
	private Integer number;
	private String professional;
	private String requirements;
	private String treatment;
	private Timestamp ps;

	// Constructors

	/** default constructor */
	public Job() {
	}

	/** full constructor */
	public Job(Unit unit, String position, Integer number, String professional, String requirements, String treatment,
			Timestamp ps) {
		this.unit = unit;
		this.position = position;
		this.number = number;
		this.professional = professional;
		this.requirements = requirements;
		this.treatment = treatment;
		this.ps = ps;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "unit")

	public Unit getUnit() {
		return this.unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	@Column(name = "position", length = 45)

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Column(name = "number")

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Column(name = "professional", length = 45)

	public String getProfessional() {
		return this.professional;
	}

	public void setProfessional(String professional) {
		this.professional = professional;
	}

	@Column(name = "requirements", length = 500)

	public String getRequirements() {
		return this.requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	@Column(name = "treatment", length = 500)

	public String getTreatment() {
		return this.treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	@Column(name = "ps", length = 19)

	public Timestamp getPs() {
		return this.ps;
	}

	public void setPs(Timestamp ps) {
		this.ps = ps;
	}

}