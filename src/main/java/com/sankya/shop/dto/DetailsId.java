package com.sankya.shop.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Embeddable
public class DetailsId implements Serializable{
	
	@ManyToOne
	@JoinColumn(name = "DetailsId", referencedColumnName="id")
	private PoductsBean bean;
	
	@Column
	private String id ;

	public PoductsBean getBean() {
		return bean;
	}

	public void setBean(PoductsBean bean) {
		this.bean = bean;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	

}
