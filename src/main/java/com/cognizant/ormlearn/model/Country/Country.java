package com.cognizant.ormlearn.model.Country;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

	@Id
	@Column(name = "co_code")
	private String code;

	@Column(name = "co_name")
	private String name;

	// getters and setters
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// toString()
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}

	/*
	 * · @Entity is an indicator to Spring Data JPA that it is an entity class for
	        the application
	 * 
	 * · @Table helps in defining the mapping database table
	 * 
	 * · @Id helps is defining the primary key
	 * 
	 * · @Column helps in defining the mapping table column
	 */
}