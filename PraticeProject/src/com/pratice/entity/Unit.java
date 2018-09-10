package com.pratice.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Unit entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "unit", catalog = "pratice")

public class Unit implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String department;
	private String manager;
	private String email;
	private String tel;
	private String phone;
	private String qq;
	private String postCode;
	private String address;
	private String properties;
	private String introduction;
	private String schoolLinkman;
	private Set<Job> jobs = new HashSet<Job>(0);

	// Constructors

	/** default constructor */
	public Unit() {
	}

	/** full constructor */
	public Unit(String name, String department, String manager, String email, String tel, String phone, String qq,
			String postCode, String address, String properties, String introduction, String schoolLinkman,
			Set<Job> jobs) {
		this.name = name;
		this.department = department;
		this.manager = manager;
		this.email = email;
		this.tel = tel;
		this.phone = phone;
		this.qq = qq;
		this.postCode = postCode;
		this.address = address;
		this.properties = properties;
		this.introduction = introduction;
		this.schoolLinkman = schoolLinkman;
		this.jobs = jobs;
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

	@Column(name = "name", length = 45)

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "department", length = 45)

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Column(name = "manager", length = 45)

	public String getManager() {
		return this.manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	@Column(name = "email", length = 45)

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "tel", length = 45)

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "phone", length = 45)

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "qq", length = 45)

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	@Column(name = "post_code", length = 45)

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@Column(name = "address", length = 45)

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "properties", length = 45)

	public String getProperties() {
		return this.properties;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}

	@Column(name = "introduction", length = 500)

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	@Column(name = "school_linkman", length = 45)

	public String getSchoolLinkman() {
		return this.schoolLinkman;
	}

	public void setSchoolLinkman(String schoolLinkman) {
		this.schoolLinkman = schoolLinkman;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "unit")

	public Set<Job> getJobs() {
		return this.jobs;
	}

	public void setJobs(Set<Job> jobs) {
		this.jobs = jobs;
	}

}