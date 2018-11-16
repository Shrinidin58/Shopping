package com.sankya.shop.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.log4j.Logger;


@Entity
@Table(name = "DetailsBean")
public class DetailsBean implements Serializable {
final static Logger LOGGER = Logger.getLogger(DetailsBean.class);
	
	
	@EmbeddedId
	private DetailsId id;
	
	@Column
	private String fullName;
	
	@Column
	private String specification;
	
	@Column
	private int price;
	
	@ManyToOne
	@JoinColumn(name = "pid", referencedColumnName="id")
	private PoductsBean bean;
	
	@ManyToOne
	@JoinColumn(name= "catId", referencedColumnName="catId")
	private CategoryBean catBean;
	

	
	
	public CategoryBean getCatBean() {
		return catBean;
	}

	public void setCatBean(CategoryBean catBean) {
		this.catBean = catBean;
	}

	public PoductsBean getBean() {
		return bean;
	}

	public void setBean(PoductsBean bean) {
		this.bean = bean;
	}

	public DetailsId getId() {
		return id;
	}

	public void setId(DetailsId id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "DetailsBean [id=" + id + ", fullName=" + fullName + ", specification=" + specification + ", price="
				+ price + ", bean=" + bean + ", catBean=" + catBean + "]";
	}
	
	
	

}
