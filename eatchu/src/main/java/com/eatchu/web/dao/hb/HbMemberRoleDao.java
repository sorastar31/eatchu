package com.eatchu.web.dao.hb;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eatchu.web.dao.MemberRoleDao;
import com.eatchu.web.entity.MemberRole;

@Repository
public class HbMemberRoleDao implements MemberRoleDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public int insert(MemberRole memberRole) {
		Session session = sessionFactory.getCurrentSession();
		Object id = session.save(memberRole);
		if(id != null)
			return 1;
		return 0;
	}

	@Override
	@Transactional
	public int update(MemberRole memberRole) {
		Session session = sessionFactory.getCurrentSession();
		session.update(memberRole);
		return 1;
	}

	@Override
	@Transactional
	public int delete(MemberRole memberRole) {
		Session session = sessionFactory.getCurrentSession();
		session.remove(memberRole);
		return 1;
	}

	@Override
	@Transactional
	public List<MemberRole> getList() {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from MemberRole";
		List<MemberRole> list = session
									.createQuery(hql, MemberRole.class)
									.getResultList();
		return list;
	}

	@Override
	@Transactional
	public List<MemberRole> getList(String memberId) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from MemberRole where memberId = :memberId";
		List<MemberRole> list = session
									.createQuery(hql, MemberRole.class)
									.setParameter("memberId", memberId)
									.getResultList();
		return list;
	}

}
