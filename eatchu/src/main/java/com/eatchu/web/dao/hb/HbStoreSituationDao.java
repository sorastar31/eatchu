package com.eatchu.web.dao.hb;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eatchu.web.dao.StoreSituationDao;
import com.eatchu.web.entity.StoreSituation;

@Repository
public class HbStoreSituationDao implements StoreSituationDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public int insert(StoreSituation storeSituation) {
		Session session = sessionFactory.getCurrentSession();
		Object id = session.save(storeSituation);
		if(id != null)
			return 1;
		return 0;
	}

	@Override
	@Transactional
	public int update(StoreSituation storeSituation) {
		Session session = sessionFactory.getCurrentSession();
		session.update(storeSituation);
		return 1;
	}

	@Override
	@Transactional
	public int delete(long storeId, long situationCategoryId) {
		Session session = sessionFactory.getCurrentSession();
		StoreSituation storeSituation = new StoreSituation();
		storeSituation.setStoreId(storeId);
		storeSituation.setSituationCategoryId(situationCategoryId);
		session.remove(storeSituation);
		return 1;
	}

	@Override
	@Transactional
	public List<StoreSituation> getList(long storeId) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from StoreSituation where storeId = :storeId";
		List<StoreSituation> list = session
											.createQuery(hql, StoreSituation.class)
											.setParameter("storeId", storeId)
											.getResultList();
		return list;
	}

}
