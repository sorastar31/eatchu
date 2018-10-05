package com.eatchu.web.dao.hb;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eatchu.web.dao.StoreDao;
import com.eatchu.web.entity.Store;

@Repository
public class HbStoreDao implements StoreDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public int insert(Store store) {
		Session session = sessionFactory.getCurrentSession();
		Object id = session.save(store);
		if(id != null)
			return 1;
		return 0;
	}

	@Override
	@Transactional
	public int update(Store store) {
		Session session = sessionFactory.getCurrentSession();
		session.update(store);
		return 1;
	}

	@Override
	@Transactional
	public int delete(long id) {
		Session session = sessionFactory.getCurrentSession();
		Store store = new Store();
		store.setId(id);
		session.remove(store);
		return 1;
	}

	@Override
	@Transactional
	public Store get(long id) {
		Session session = sessionFactory.getCurrentSession();
		Store store = session.get(Store.class, id);
		return store;
	}

	@Override
	@Transactional
	public List<Store> getList() {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Store";
		List<Store> list = session
								.createQuery(hql, Store.class)
								.getResultList();
		return list;
	}

	@Override
	@Transactional
	public List<Store> getList(long regId) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Store where regId = :regId";
		List<Store> list = session
								.createQuery(hql, Store.class)
								.setParameter("regId", regId)
								.getResultList();
		return list;
	}

}
