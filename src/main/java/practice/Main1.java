package practice;

import com.sankya.shop.dto.CategoryBean;
import com.sankya.shop.dto.DetailsBean;
import com.sankya.shop.dto.DetailsId;
import com.sankya.shop.dto.PoductsBean;

public class Main1 {

	public static void main(String[] args) {


		
		char c = 'A';
		int i = c;
		System.out.println(i);
		
/*		int a = 65;
		char b = (char) a;
		String s = b+"aa";
		System.out.println(s);
*/
		
		/*
		char b1 = 65;
		System.out.println(b1);*/
		
		
			
			
			
		CategoryBean bean = new CategoryBean();
		bean.setCatId("1");
		bean.setCatName("Stationary");
		
		PoductsBean pbean = new PoductsBean();
		pbean.setCatId(bean);
		pbean.setId("1");
		pbean.setName("pen");
		
		for (int j = 0; j < 301; j++) {
			DetailsId detailsId= new DetailsId();
			detailsId.setBean(pbean);
			char id = (char) j;
			detailsId.setId(""+id);
			
			DetailsBean detailsbean= new  DetailsBean();
			detailsbean.setBean(pbean);
			detailsbean.setCatBean(bean);
			int count = 65;
			char countn = (char)count;
			int count1 = 65;
			char countn1 = (char)count1;
			String name;
		}
		
			
			
			
			
			
		
		
		

	}

}
