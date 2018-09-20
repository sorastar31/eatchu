package com.eatchu.web.dao.hb;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eatchu.web.dao.SituationCategoryDao;
import com.eatchu.web.entity.SituationCategory;

@Repository
public class HbSituationCategoryDao implements SituationCategoryDao {

	@Autowired
	private SessionFactory SessionFactory;
	
	@Override
	@Transactional
	public int insert(SituationCategory situationCategory) {
		Session session = SessionFactory.getCurrentSession();
		Object id = session.save(situationCategory);
		if(id != null)
			return 1;
		return 0;
	}

	@Override
	@Transactional
	public int update(SituationCategory situationCategory) {
		Session session = SessionFactory.getCurrentSession();
		session.update(situationCategory);
		return 1;
	}

	@Override
	@Transactional
	public int delete(long id) {
		Session session = SessionFactory.getCurrentSession();
		SituationCategory situationCategory = new SituationCategory();
		situationCategory.setId(id);
		session.remove(situationCategory);
		return 1;
	}

	@Override
	@Transactional
	public SituationCategory get(long id) {
		Session session = SessionFactory.getCurrentSession();
		SituationCategory situationCategory = session.get(SituationCategory.class, id);
		return situationCategory;
	}

	@Override
	@Transactional
	public List<SituationCategory> getList() {
		Session session = SessionFactory.getCurrentSession();
		String hql = "from SituationCategory";
		List<SituationCategory> list = session
												.createQuery(hql, SituationCategory.class)
												.getResultList();
		return list;
	}

}
