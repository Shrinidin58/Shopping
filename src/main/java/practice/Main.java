package practice;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sankya.shop.dao.ShopDaoImpl;
import com.sankya.shop.dto.CategoryBean;
import com.sankya.shop.dto.DetailsBean;
import com.sankya.shop.dto.DetailsId;

import com.sankya.shop.dto.PoductsBean;

public class Main {

	public static void main(String[] args) {
		/*Configuration config = new Configuration();
		SessionFactory factory = config.configure().buildSessionFactory();
		Session session = factory.openSession();
		
		CategoryBean bean = new CategoryBean();
		bean.setCatId("4");
		bean.setCatName("AAA");
		
		
		PoductsBean pbean = new PoductsBean();
		pbean.setCatId(bean);
		pbean.setId("4");
		pbean.setName("pen");
		
		DetailsId detailsId = new DetailsId();
		detailsId.setBean(pbean);
		detailsId.setId("4");
		
		DetailsBean dbean = new DetailsBean();
		dbean.setBean(pbean);
		dbean.setFullName("renolds pen");
		dbean.setId(detailsId);
		dbean.setPrice(10);
		dbean.setSpecification("ble ink pen");
		dbean.setCatBean(bean);
		session.save(bean);
		session.save(pbean);
		session.save(dbean);
		
		
		
		Transaction transaction = session.getTransaction();
		transaction.begin();
		transaction.commit();
		session.close();
*/
		
		ShopDaoImpl daoImpl = new ShopDaoImpl();
		List<DetailsBean> data = daoImpl.search("pen");
		System.out.println(data);
		for (DetailsBean detailsBean : data) {
			System.out.println(detailsBean);
			
		}
		
	}
}
