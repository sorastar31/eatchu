package com.eatchu.web.dao.hb;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eatchu.web.dao.NationalCategoryDao;
import com.eatchu.web.entity.NationalCategory;

@Repository
public class HbNationalCategoryDao implements NationalCategoryDao {

	@Autowired
	private SessionFactory SessionFactory;
	
	@Override
	@Transactional
	public int insert(NationalCategory nationalCategory) {
		Session session = SessionFactory.getCurrentSession();
		Object id = session.save(nationalCategory);
		if(id != null)
			return 1;
		return 0;
	}

	@Override
	@Transactional
	public int update(NationalCategory nationalCategory) {
		Session session = SessionFactory.getCurrentSession();
		session.update(nationalCategory);
		return 1;
	}

	@Override
	@Transactional
	public int delete(long id) {
		Session session = SessionFactory.getCurrentSession();
		NationalCategory nationalCategory = new NationalCategory();
		nationalCategory.setId(id);
		session.remove(nationalCategory);
		return 1;
	}

	@Override
	@Transactional
	public NationalCategory get(long id) {
		Session session = SessionFactory.getCurrentSession();
		NationalCategory nationalCategory = session.get(NationalCategory.class, id);
		return nationalCategory;
	}

	@Override
	@Transactional
	public List<NationalCategory> getList() {
		Session session = SessionFactory.getCurrentSession();
		String hql ="from NationalCategory";
		List<NationalCategory> list = session
											.createQuery(hql, NationalCategory.class)
											.getResultList();
		return list;
	}

}
