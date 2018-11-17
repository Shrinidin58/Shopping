package com.sankya.shop.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sankya.shop.dao.ShopDao;
import com.sankya.shop.dao.ShopDaoImpl;
import com.sankya.shop.dto.DetailsBean;

@Controller
public class SearchController {
	
	@Autowired
	@Qualifier("dao")
	private ShopDao shopDao;
	
	
	final static Logger LOGGER = Logger.getLogger(SearchController.class);
	
	@RequestMapping(path = "/searchproduct", method = RequestMethod.GET)
	public String searchProduct(ModelMap map, String search) {
		System.out.println("inside controller");
		LOGGER.info("inside lot controller");
		LOGGER.info(search);
		System.out.println("before calling dao method");
		List<DetailsBean> detaisl = shopDao.search(search);
		map.addAttribute("detailsBean", detaisl);
		
		return "SearchResult";
	}

}
