package com.it.show.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * List entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "list", catalog = "exhibition")
public class List implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String date;
	private String time;
	private String name;
	private String man;
	private String address;
	private Integer num;

	// Constructors

	/** default constructor */
	public List() {
	}

	/** minimal constructor */
	public List(Integer num) {
		this.num = num;
	}

	/** full constructor */
	public List(String date, String time, String name, String man,
			String address, Integer num) {
		this.date = date;
		this.time = time;
		this.name = name;
		this.man = man;
		this.address = address;
		this.num = num;
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

	@Column(name = "date", length = 20)
	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Column(name = "time", length = 20)
	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Column(name = "name", length = 30)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "man", length = 20)
	public String getMan() {
		return this.man;
	}

	public void setMan(String man) {
		this.man = man;
	}

	@Column(name = "address", length = 30)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "num", nullable = false)
	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

}