package com.eatchu.web.dao.hb;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eatchu.web.dao.GenderDao;
import com.eatchu.web.entity.Gender;

@Repository
public class HbGenderDao implements GenderDao {

	@Autowired
	private SessionFactory SessionFactory;
	
	@Override
	@Transactional
	public int insert(Gender gender) {
		Session session = SessionFactory.getCurrentSession();
		Object id = session.save(gender);
		if(id != null)
			return 1;
		return 0;
	}

	@Override
	@Transactional
	public int update(Gender gender) {
		Session session = SessionFactory.getCurrentSession();
		session.update(gender);
		return 1;
	}

	@Override
	@Transactional
	public int delete(int id) {
		Session session = SessionFactory.getCurrentSession();
		Gender gender = new Gender();
		gender.setId(id);
		session.remove(gender);
		return 1;
	}

	@Override
	@Transactional
	public Gender get(int id) {
		Session session = SessionFactory.getCurrentSession();
		Gender gender = session.get(Gender.class, id);
		return gender;
	}

	@Override
	@Transactional
	public List<Gender> getList() {
		Session session = SessionFactory.getCurrentSession();
		String hql = "from Gender";
		List<Gender> list = session
									.createQuery(hql, Gender.class)
									.getResultList();
		return list;
	}

}
