package com.eatchu.web.dao.hb;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eatchu.web.dao.CategoryDao;
import com.eatchu.web.entity.Category;

@Repository
public class HbCategoryDao implements CategoryDao {

	@Autowired
	private SessionFactory SessionFactory;
	
	@Override
	@Transactional
	public int insert(Category category) {
		Session session = SessionFactory.getCurrentSession();
		Object id = session.save(category);
		if(id != null)
			return 1;
		return 0;
	}

	@Override
	@Transactional
	public int update(Category category) {
		Session session = SessionFactory.getCurrentSession();
		session.update(category);
		return 1;
	}

	@Override
	@Transactional
	public int delete(long id) {
		Session session = SessionFactory.getCurrentSession();
		Category category = new Category();
		category.setId(id);
		session.remove(category);
		return 1;
	}

	@Override
	@Transactional
	public Category get(long id) {
		Session session = SessionFactory.getCurrentSession();
		Category category = session.get(Category.class, id);
		return category;
	}

	@Override
	@Transactional
	public List<Category> getList() {
		Session session = SessionFactory.getCurrentSession();
		String hql = "from Category";
		List<Category> list = session
									.createQuery(hql, Category.class)
									.getResultList();
		return list;
	}

}
