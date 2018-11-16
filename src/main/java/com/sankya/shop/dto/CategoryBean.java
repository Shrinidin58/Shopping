package com.sankya.shop.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.log4j.Logger;


@Entity
@Table(name="CategoryBean")
public class CategoryBean implements Serializable {
		final static Logger LOGGER = Logger.getLogger(CategoryBean.class);
	@Id
	@Column(name="catId")
	private String catId;
	
	@Column(name="catName")
	private String catName;
	
	
	public String getCatId() {
		LOGGER.info("getter method of catid");
		return catId;
	}

	public void setCatId(String catId) {
		
		LOGGER.info("setter method of catid");
		this.catId = catId;
	}

	public String getCatName() {
		LOGGER.info("getter method of catname");
		return catName;
	}

	public void setCatName(String catName) {
		LOGGER.info("setter method of cat");
		this.catName = catName;
	}

	@Override
	public String toString() {
		LOGGER.info("inside tostring method of categorybean class");
		return "CategoryBean [catId=" + catId + ", catName=" + catName + "]";
	}
	
	
	
	

}
