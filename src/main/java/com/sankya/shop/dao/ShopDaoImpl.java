package com.sankya.shop.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.sankya.shop.dto.DetailsBean;


public class ShopDaoImpl implements ShopDao {
	
	public static final Configuration CONFIG = new Configuration();
	public static final SessionFactory FACTORY = CONFIG.configure().buildSessionFactory();
	final static Logger LOGGER = Logger.getLogger(ShopDaoImpl.class);

	public List<DetailsBean> search(String name) {
		
		
		LOGGER.info("inside search method");
	
		LOGGER.info("After configure");
		Session session = FACTORY.openSession();
		LOGGER.info("after session");
		Transaction transaction=session.beginTransaction();
		
		Criteria criteria = session.createCriteria(DetailsBean.class);
		criteria.add(Restrictions.like("fullName", ("%"+name+"%")));
		List<DetailsBean> res = criteria.list();
		
		/*String hql = "From DetailsId where fullName like "+name;
		Query query = session.createQuery(hql);
		List<DetailsBean> res = query.list();*/
		transaction.commit();
		session.close();
		
		
	
		
		return res;
	}
	
	
	

}
