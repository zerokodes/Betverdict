package com.betverdict.berverdict.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Subscribers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String name;
	private String email;
	private String subType;
	private Date dateOfSub;
	private Date expiringDateOfSub;

	public Subscribers(Long id) {
		super();
		Id = id;
	}

	public Subscribers(Long id, String name, String email, String subType, Date dateOfSub, Date expiringDateOfSub) {
		super();
		Id = id;
		this.name = name;
		this.email = email;
		this.subType = subType;
		this.dateOfSub = dateOfSub;
		this.expiringDateOfSub = expiringDateOfSub;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public Date getDateOfSub() {
		return dateOfSub;
	}

	public void setDateOfSub(Date dateOfSub) {
		this.dateOfSub = dateOfSub;
	}

	public Date getExpiringDateOfSub() {
		return expiringDateOfSub;
	}

	public void setExpiringDateOfSub(Date expiringDateOfSub) {
		this.expiringDateOfSub = expiringDateOfSub;
	}

}
