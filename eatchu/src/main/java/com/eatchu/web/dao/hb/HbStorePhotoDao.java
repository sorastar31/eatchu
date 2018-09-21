package com.eatchu.web.dao.hb;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eatchu.web.dao.StorePhotoDao;
import com.eatchu.web.entity.StorePhoto;

@Repository
public class HbStorePhotoDao implements StorePhotoDao {

	@Autowired
	private SessionFactory SessionFactory;
	
	@Override
	@Transactional
	public int insert(StorePhoto storePhoto) {
		Session session = SessionFactory.getCurrentSession();
		Object id = session.save(storePhoto);
		if(id != null)
			return 1;
		return 0;
	}

	@Override
	@Transactional
	public int update(StorePhoto storePhoto) {
		Session session = SessionFactory.getCurrentSession();
		session.update(storePhoto);
		return 1;
	}

	@Override
	@Transactional
	public int delete(long id) {
		Session session = SessionFactory.getCurrentSession();
		StorePhoto storePhoto = new StorePhoto();
		storePhoto.setId(id);
		session.remove(storePhoto);
		return 1;
	}

	@Override
	@Transactional
	public StorePhoto get(long id) {
		Session session = SessionFactory.getCurrentSession();
		StorePhoto storePhoto = session.get(StorePhoto.class, id);
		return storePhoto;
	}

	@Override
	@Transactional
	public List<StorePhoto> getList() {
		Session session = SessionFactory.getCurrentSession();
		String hql = "from StorePhoto";
		List<StorePhoto> list = session
										.createQuery(hql, StorePhoto.class)
										.getResultList();
		return list;
	}

}
