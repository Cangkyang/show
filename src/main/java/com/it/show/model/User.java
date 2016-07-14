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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user", catalog = "exhibition")
public class User implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private Integer uid;
	private String uname;
	private String upassword;
	private Short status;
	private String uemail;
	private String activationCode;
	private Timestamp createtime;
	private Timestamp login;
	private Set<Exhibitions> exhibitionses = new HashSet<Exhibitions>(0);
	private Set<Advert> adverts = new HashSet<Advert>(0);
	private Set<Discuss> discussesForToid = new HashSet<Discuss>(0);
	private Set<Discuss> discussesForUid = new HashSet<Discuss>(0);
	private Set<Zan> zans = new HashSet<Zan>(0);
	private Set<Post> posts = new HashSet<Post>(0);
	private Set<Repost> reposts = new HashSet<Repost>(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String uname, String upassword, Short status) {
		this.uname = uname;
		this.upassword = upassword;
		this.status = status;
	}

	/** full constructor */
	public User(String uname, String upassword, Short status, String uemail,
			String activationCode, Timestamp createtime, Timestamp login,
			Set<Exhibitions> exhibitionses, Set<Advert> adverts,
			Set<Discuss> discussesForToid, Set<Discuss> discussesForUid,
			Set<Zan> zans, Set<Post> posts, Set<Repost> reposts) {
		this.uname = uname;
		this.upassword = upassword;
		this.status = status;
		this.uemail = uemail;
		this.activationCode = activationCode;
		this.createtime = createtime;
		this.login = login;
		this.exhibitionses = exhibitionses;
		this.adverts = adverts;
		this.discussesForToid = discussesForToid;
		this.discussesForUid = discussesForUid;
		this.zans = zans;
		this.posts = posts;
		this.reposts = reposts;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "uid", unique = true, nullable = false)
	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	@Column(name = "uname", nullable = false, length = 8)
	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	@Column(name = "upassword", nullable = false, length = 32)
	public String getUpassword() {
		return this.upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	@Column(name = "status", nullable = false)
	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	@Column(name = "uemail", length = 50)
	public String getUemail() {
		return this.uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	@Column(name = "activationCode", length = 64)
	public String getActivationCode() {
		return this.activationCode;
	}

	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	@Column(name = "createtime", length = 19)
	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	@Column(name = "login", length = 19)
	public Timestamp getLogin() {
		return this.login;
	}

	public void setLogin(Timestamp login) {
		this.login = login;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Exhibitions> getExhibitionses() {
		return this.exhibitionses;
	}

	public void setExhibitionses(Set<Exhibitions> exhibitionses) {
		this.exhibitionses = exhibitionses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Advert> getAdverts() {
		return this.adverts;
	}

	public void setAdverts(Set<Advert> adverts) {
		this.adverts = adverts;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "userByToid")
	public Set<Discuss> getDiscussesForToid() {
		return this.discussesForToid;
	}

	public void setDiscussesForToid(Set<Discuss> discussesForToid) {
		this.discussesForToid = discussesForToid;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "userByUid")
	public Set<Discuss> getDiscussesForUid() {
		return this.discussesForUid;
	}

	public void setDiscussesForUid(Set<Discuss> discussesForUid) {
		this.discussesForUid = discussesForUid;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Zan> getZans() {
		return this.zans;
	}

	public void setZans(Set<Zan> zans) {
		this.zans = zans;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Post> getPosts() {
		return this.posts;
	}

	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Repost> getReposts() {
		return this.reposts;
	}

	public void setReposts(Set<Repost> reposts) {
		this.reposts = reposts;
	}

}