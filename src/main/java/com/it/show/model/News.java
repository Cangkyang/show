package com.it.show.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * News entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "news", catalog = "exhibition")
public class News implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private Integer nid;
	private String npic;
	private String ntittle;
	private String ncontent;
	private String nauthor;
	private Timestamp ndate;

	// Constructors

	/** default constructor */
	public News() {
	}

	/** full constructor */
	public News(String npic, String ntittle, String ncontent, String nauthor,
			Timestamp ndate) {
		this.npic = npic;
		this.ntittle = ntittle;
		this.ncontent = ncontent;
		this.nauthor = nauthor;
		this.ndate = ndate;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "Nid", unique = true, nullable = false)
	public Integer getNid() {
		return this.nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	@Column(name = "Npic", length = 50)
	public String getNpic() {
		return this.npic;
	}

	public void setNpic(String npic) {
		this.npic = npic;
	}

	@Column(name = "Ntittle", length = 24)
	public String getNtittle() {
		return this.ntittle;
	}

	public void setNtittle(String ntittle) {
		this.ntittle = ntittle;
	}

	@Column(name = "Ncontent", length = 16777215)
	public String getNcontent() {
		return this.ncontent;
	}

	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}

	@Column(name = "Nauthor", length = 36)
	public String getNauthor() {
		return this.nauthor;
	}

	public void setNauthor(String nauthor) {
		this.nauthor = nauthor;
	}

	@Column(name = "Ndate", length = 19)
	public Timestamp getNdate() {
		return this.ndate;
	}

	public void setNdate(Timestamp ndate) {
		this.ndate = ndate;
	}

}