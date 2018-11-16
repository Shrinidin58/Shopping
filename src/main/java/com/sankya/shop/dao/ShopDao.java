package com.sankya.shop.dao;

import java.util.List;

import com.sankya.shop.dto.DetailsBean;

public interface ShopDao {
	
	public List<DetailsBean> search(String name); 

}
