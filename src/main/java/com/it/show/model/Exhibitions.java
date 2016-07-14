package com.it.show.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Exhibitions entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "exhibitions", catalog = "exhibition")
public class Exhibitions implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private Integer eid;
	private Category categoryByThemeid;
	private User user;
	private Category categoryByCategory;
	private String epic;
	private String eitemTitle;
	private String eitemContent;
	private String eplaceArea;
	private String econtact;
	private String ecompanyName;
	private String eteamContent;
	private String ecompanyContent;
	private Integer eclick;

	// Constructors

	/** default constructor */
	public Exhibitions() {
	}

	/** minimal constructor */
	public Exhibitions(User user) {
		this.user = user;
	}

	/** full constructor */
	public Exhibitions(Category categoryByThemeid, User user,
			Category categoryByCategory, String epic, String eitemTitle,
			String eitemContent, String eplaceArea, String econtact,
			String ecompanyName, String eteamContent, String ecompanyContent,
			Integer eclick) {
		this.categoryByThemeid = categoryByThemeid;
		this.user = user;
		this.categoryByCategory = categoryByCategory;
		this.epic = epic;
		this.eitemTitle = eitemTitle;
		this.eitemContent = eitemContent;
		this.eplaceArea = eplaceArea;
		this.econtact = econtact;
		this.ecompanyName = ecompanyName;
		this.eteamContent = eteamContent;
		this.ecompanyContent = ecompanyContent;
		this.eclick = eclick;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "Eid", unique = true, nullable = false)
	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "themeid")
	public Category getCategoryByThemeid() {
		return this.categoryByThemeid;
	}

	public void setCategoryByThemeid(Category categoryByThemeid) {
		this.categoryByThemeid = categoryByThemeid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "uid", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category")
	public Category getCategoryByCategory() {
		return this.categoryByCategory;
	}

	public void setCategoryByCategory(Category categoryByCategory) {
		this.categoryByCategory = categoryByCategory;
	}

	@Column(name = "Epic", length = 50)
	public String getEpic() {
		return this.epic;
	}

	public void setEpic(String epic) {
		this.epic = epic;
	}

	@Column(name = "Eitem_title", length = 50)
	public String getEitemTitle() {
		return this.eitemTitle;
	}

	public void setEitemTitle(String eitemTitle) {
		this.eitemTitle = eitemTitle;
	}

	@Column(name = "Eitem_content", length = 16777215)
	public String getEitemContent() {
		return this.eitemContent;
	}

	public void setEitemContent(String eitemContent) {
		this.eitemContent = eitemContent;
	}

	@Column(name = "Eplace_area", length = 30)
	public String getEplaceArea() {
		return this.eplaceArea;
	}

	public void setEplaceArea(String eplaceArea) {
		this.eplaceArea = eplaceArea;
	}

	@Column(name = "Econtact")
	public String getEcontact() {
		return this.econtact;
	}

	public void setEcontact(String econtact) {
		this.econtact = econtact;
	}

	@Column(name = "Ecompany_name", length = 30)
	public String getEcompanyName() {
		return this.ecompanyName;
	}

	public void setEcompanyName(String ecompanyName) {
		this.ecompanyName = ecompanyName;
	}

	@Column(name = "Eteam_content", length = 16777215)
	public String getEteamContent() {
		return this.eteamContent;
	}

	public void setEteamContent(String eteamContent) {
		this.eteamContent = eteamContent;
	}

	@Column(name = "Ecompany_content", length = 16777215)
	public String getEcompanyContent() {
		return this.ecompanyContent;
	}

	public void setEcompanyContent(String ecompanyContent) {
		this.ecompanyContent = ecompanyContent;
	}

	@Column(name = "Eclick")
	public Integer getEclick() {
		return this.eclick;
	}

	public void setEclick(Integer eclick) {
		this.eclick = eclick;
	}

}