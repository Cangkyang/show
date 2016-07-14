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
 * Zan entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "zan", catalog = "exhibition")
public class Zan implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	// Fields
	private Integer id;
	private User user;
	private Post post;
	private String ip;
	private Timestamp time;

	// Constructors

	/** default constructor */
	public Zan() {
	}

	/** minimal constructor */
	public Zan(String ip) {
		this.ip = ip;
	}

	/** full constructor */
	public Zan(User user, Post post, String ip, Timestamp time) {
		this.user = user;
		this.post = post;
		this.ip = ip;
		this.time = time;
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
	@JoinColumn(name = "uid")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pid")
	public Post getPost() {
		return this.post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@Column(name = "ip", nullable = false, length = 50)
	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Column(name = "time", length = 19)
	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

}