package com.it.show.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Category entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "category", catalog = "exhibition")
public class Category implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private Integer cid;
	private Category category;
	private String cname;
	private String desc;
	private Short status;
	private Set<Exhibitions> exhibitionsesForThemeid = new HashSet<Exhibitions>(
			0);
	private Set<Exhibitions> exhibitionsesForCategory = new HashSet<Exhibitions>(
			0);
	private Set<Category> categories = new HashSet<Category>(0);
	private Set<Advert> adverts = new HashSet<Advert>(0);

	// Constructors

	/** default constructor */
	public Category() {
	}

	/** minimal constructor */
	public Category(String cname, Short status) {
		this.cname = cname;
		this.status = status;
	}

	/** full constructor */
	public Category(Category category, String cname, String desc, Short status,
			Set<Exhibitions> exhibitionsesForThemeid,
			Set<Exhibitions> exhibitionsesForCategory,
			Set<Category> categories, Set<Advert> adverts) {
		this.category = category;
		this.cname = cname;
		this.desc = desc;
		this.status = status;
		this.exhibitionsesForThemeid = exhibitionsesForThemeid;
		this.exhibitionsesForCategory = exhibitionsesForCategory;
		this.categories = categories;
		this.adverts = adverts;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "cid", unique = true, nullable = false)
	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pid")
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Column(name = "cname", nullable = false, length = 50)
	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Column(name = "desc", length = 100)
	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Column(name = "status", nullable = false)
	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "categoryByThemeid")
	public Set<Exhibitions> getExhibitionsesForThemeid() {
		return this.exhibitionsesForThemeid;
	}

	public void setExhibitionsesForThemeid(
			Set<Exhibitions> exhibitionsesForThemeid) {
		this.exhibitionsesForThemeid = exhibitionsesForThemeid;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "categoryByCategory")
	public Set<Exhibitions> getExhibitionsesForCategory() {
		return this.exhibitionsesForCategory;
	}

	public void setExhibitionsesForCategory(
			Set<Exhibitions> exhibitionsesForCategory) {
		this.exhibitionsesForCategory = exhibitionsesForCategory;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "category")
	public Set<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "category")
	public Set<Advert> getAdverts() {
		return this.adverts;
	}

	public void setAdverts(Set<Advert> adverts) {
		this.adverts = adverts;
	}

}