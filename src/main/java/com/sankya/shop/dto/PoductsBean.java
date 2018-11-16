package com.sankya.shop.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.log4j.Logger;

@Entity
@Table(name="PoductsBean")
public class PoductsBean implements Serializable {
	final static Logger LOGGER = Logger.getLogger(PoductsBean.class);

	@Id
	@Column
	private String id;

	@Column
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "catId", referencedColumnName ="catId")
	private CategoryBean catId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CategoryBean getCatId() {
		return catId;
	}

	public void setCatId(CategoryBean catId) {
		this.catId = catId;
	}
	
	



}
