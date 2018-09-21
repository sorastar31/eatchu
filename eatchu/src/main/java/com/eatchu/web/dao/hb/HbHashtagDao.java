package com.eatchu.web.dao.hb;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eatchu.web.dao.HashtagDao;
import com.eatchu.web.entity.Hashtag;

@Repository
public class HbHashtagDao implements HashtagDao {

	@Autowired
	private SessionFactory SessionFactory;
	
	@Override
	@Transactional
	public int insert(Hashtag hashtag) {
		Session session = SessionFactory.getCurrentSession();
		Object id = session.save(hashtag);
		if(id != null)
			return 1;
		return 0;
	}

	@Override
	@Transactional
	public int update(Hashtag hashtag) {
		Session session = SessionFactory.getCurrentSession();
		session.update(hashtag);
		return 1;
	}

	@Override
	@Transactional
	public int delete(long id) {
		Session session = SessionFactory.getCurrentSession();
		Hashtag hashtag = new Hashtag();
		hashtag.setId(id);
		session.remove(hashtag);
		return 1;
	}

	@Override
	@Transactional
	public Hashtag get(long id) {
		Session session = SessionFactory.getCurrentSession();
		Hashtag hashtag = session.get(Hashtag.class, id);
		return hashtag;
	}

	@Override
	@Transactional
	public List<Hashtag> getList() {
		Session session = SessionFactory.getCurrentSession();
		String hql = "from Hashtag";
		List<Hashtag> list = session
									.createQuery(hql, Hashtag.class)
									.getResultList();
		return list;
	}

}
