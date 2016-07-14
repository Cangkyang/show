package com.it.show.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Advert entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "advert", catalog = "exhibition")
public class Advert implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private Short aid;
	private User user;
	private Category category;
	private String atitle;
	private String acontent;
	private String apic;
	private Timestamp adate;
	private Integer aclick;

	// Constructors

	/** default constructor */
	public Advert() {
	}

	/** minimal constructor */
	public Advert(User user) {
		this.user = user;
	}

	/** full constructor */
	public Advert(User user, Category category, String atitle, String acontent,
			String apic, Timestamp adate, Integer aclick) {
		this.user = user;
		this.category = category;
		this.atitle = atitle;
		this.acontent = acontent;
		this.apic = apic;
		this.adate = adate;
		this.aclick = aclick;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "Aid", unique = true, nullable = false)
	public Short getAid() {
		return this.aid;
	}

	public void setAid(Short aid) {
		this.aid = aid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Uid", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Atype")
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Column(name = "Atitle", length = 50)
	public String getAtitle() {
		return this.atitle;
	}

	public void setAtitle(String atitle) {
		this.atitle = atitle;
	}

	@Column(name = "Acontent", length = 65535)
	public String getAcontent() {
		return this.acontent;
	}

	public void setAcontent(String acontent) {
		this.acontent = acontent;
	}

	@Column(name = "Apic", length = 50)
	public String getApic() {
		return this.apic;
	}

	public void setApic(String apic) {
		this.apic = apic;
	}

	@Column(name = "Adate", length = 19)
	public Timestamp getAdate() {
		return this.adate;
	}

	public void setAdate(Timestamp adate) {
		this.adate = adate;
	}

	@Column(name = "Aclick")
	public Integer getAclick() {
		return this.aclick;
	}

	public void setAclick(Integer aclick) {
		this.aclick = aclick;
	}

}