package com.eatchu.web.dao.hb;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eatchu.web.dao.StoreHashtagDao;
import com.eatchu.web.entity.StoreHashtag;

@Repository
public class HbStoreHashtagDao implements StoreHashtagDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public int insert(StoreHashtag storeHashtag) {
		Session session = sessionFactory.getCurrentSession();
		Object id = session.save(storeHashtag);
		if(id != null)
			return 1;
		return 0;
	}

	@Override
	@Transactional
	public int update(StoreHashtag storeHashtag) {
		Session session = sessionFactory.getCurrentSession();
		session.update(storeHashtag);
		return 1;
	}

	@Override
	@Transactional
	public int delete(long storeId, long hashtagId) {
		Session session = sessionFactory.getCurrentSession();
		StoreHashtag storeHashtag = new StoreHashtag();
		storeHashtag.setStoreId(storeId);
		storeHashtag.setHashtagId(hashtagId);
		session.remove(storeHashtag);
		return 1;
	}

	@Override
	@Transactional
	public List<StoreHashtag> getList(long storeId) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from StoreHashtag where storeId = :storeId";
		List<StoreHashtag> list = session
										.createQuery(hql, StoreHashtag.class)
										.setParameter("storeId", storeId)
										.getResultList();
		return list;
	}

}
