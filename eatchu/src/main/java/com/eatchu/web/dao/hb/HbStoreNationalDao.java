package com.eatchu.web.dao.hb;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eatchu.web.dao.StoreNatinalDao;
import com.eatchu.web.entity.StoreNational;

@Repository
public class HbStoreNationalDao implements StoreNatinalDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public int insert(StoreNational storeNational) {
		Session session = sessionFactory.getCurrentSession();
		Object id = session.save(storeNational);
		if(id != null)
			return 1;
		return 0;
	}

	@Override
	@Transactional
	public int update(StoreNational storeNational) {
		Session session = sessionFactory.getCurrentSession();
		session.update(storeNational);
		return 1;
	}

	@Override
	@Transactional
	public int delete(long storeId, long nationalCategoryId) {
		Session session = sessionFactory.getCurrentSession();
		StoreNational storeNational = new StoreNational();
		storeNational.setStoreId(storeId);
		storeNational.setNationalCategoryId(nationalCategoryId);
		session.remove(storeNational);
		return 1;
	}

	@Override
	@Transactional
	public List<StoreNational> getList(long storeId) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from StoreNational where storeId = :storeId";
		List<StoreNational> list = session
											.createQuery(hql, StoreNational.class)
											.setParameter("storeId", storeId)
											.getResultList();
		return list;
	}

}
