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
 * Discuss entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "discuss", catalog = "exhibition")
public class Discuss implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private Integer id;
	private User userByToid;
	private User userByUid;
	private String content;
	private Timestamp date;

	// Constructors

	/** default constructor */
	public Discuss() {
	}

	/** full constructor */
	public Discuss(User userByToid, User userByUid, String content,
			Timestamp date) {
		this.userByToid = userByToid;
		this.userByUid = userByUid;
		this.content = content;
		this.date = date;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "toid", nullable = false)
	public User getUserByToid() {
		return this.userByToid;
	}

	public void setUserByToid(User userByToid) {
		this.userByToid = userByToid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "uid", nullable = false)
	public User getUserByUid() {
		return this.userByUid;
	}

	public void setUserByUid(User userByUid) {
		this.userByUid = userByUid;
	}

	@Column(name = "content", nullable = false)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "date", nullable = false, length = 19)
	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

}