package com.it.show.model;

import java.sql.Timestamp;
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
 * Post entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "post", catalog = "exhibition")
public class Post implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private Integer id;
	private User user;
	private String title;
	private String content;
	private Timestamp date;
	private Integer click;
	private Integer replay;
	private Integer up;
	private Integer down;
	private Short type;
	private Timestamp update;
	private Set<Zan> zans = new HashSet<Zan>(0);

	// Constructors

	/** default constructor */
	public Post() {
	}

	/** full constructor */
	public Post(User user, String title, String content, Timestamp date,
			Integer click, Integer replay, Integer up, Integer down,
			Short type, Timestamp update, Set<Zan> zans) {
		this.user = user;
		this.title = title;
		this.content = content;
		this.date = date;
		this.click = click;
		this.replay = replay;
		this.up = up;
		this.down = down;
		this.type = type;
		this.update = update;
		this.zans = zans;
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

	@Column(name = "title", length = 50)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "content")
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "date", length = 19)
	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	@Column(name = "click")
	public Integer getClick() {
		return this.click;
	}

	public void setClick(Integer click) {
		this.click = click;
	}

	@Column(name = "replay")
	public Integer getReplay() {
		return this.replay;
	}

	public void setReplay(Integer replay) {
		this.replay = replay;
	}

	@Column(name = "up")
	public Integer getUp() {
		return this.up;
	}

	public void setUp(Integer up) {
		this.up = up;
	}

	@Column(name = "down")
	public Integer getDown() {
		return this.down;
	}

	public void setDown(Integer down) {
		this.down = down;
	}

	@Column(name = "type")
	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	@Column(name = "update", length = 19)
	public Timestamp getUpdate() {
		return this.update;
	}

	public void setUpdate(Timestamp update) {
		this.update = update;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "post")
	public Set<Zan> getZans() {
		return this.zans;
	}

	public void setZans(Set<Zan> zans) {
		this.zans = zans;
	}

}