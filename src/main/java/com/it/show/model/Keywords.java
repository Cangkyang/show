package com.it.show.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Keywords entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "keywords", catalog = "exhibition")
public class Keywords implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private Integer kid;
	private String keyword;
	private Integer knum;
	private Timestamp kdate;

	// Constructors

	/** default constructor */
	public Keywords() {
	}

	/** full constructor */
	public Keywords(String keyword, Integer knum, Timestamp kdate) {
		this.keyword = keyword;
		this.knum = knum;
		this.kdate = kdate;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "Kid", unique = true, nullable = false)
	public Integer getKid() {
		return this.kid;
	}

	public void setKid(Integer kid) {
		this.kid = kid;
	}

	@Column(name = "Keyword", length = 50)
	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Column(name = "Knum")
	public Integer getKnum() {
		return this.knum;
	}

	public void setKnum(Integer knum) {
		this.knum = knum;
	}

	@Column(name = "Kdate", length = 19)
	public Timestamp getKdate() {
		return this.kdate;
	}

	public void setKdate(Timestamp kdate) {
		this.kdate = kdate;
	}

}