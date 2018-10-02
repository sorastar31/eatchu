package com.eatchu.web.dao.hb;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eatchu.web.dao.MemberDao;
import com.eatchu.web.entity.Member;

@Repository
public class HbMemberDao implements MemberDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public int insert(Member member) {
		Session session = sessionFactory.getCurrentSession();
		Object id = session.save(member);
		if(id != null)
			return 1;
		return 0;
	}

	@Override
	@Transactional
	public int update(Member member) {
		Session session = sessionFactory.getCurrentSession();
		session.update(member);
		return 1;
	}

	@Override
	@Transactional
	public int delete(String id) {
		Session session = sessionFactory.getCurrentSession();
		Member member = new Member();
		member.setId(id);
		session.remove(member);
		return 1;
	}

	@Override
	@Transactional
	public Member get(String id) {
		Session session = sessionFactory.getCurrentSession();
		Member member = session.get(Member.class, id);
		return member;
	}

	@Override
	@Transactional
	public List<Member> getList() {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Member";
		List<Member> list = session
								.createQuery(hql, Member.class)
								.getResultList();
		return list;
	}

	@Override
	@Transactional
	public List<Member> getList(String nickname) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Member where nickname like '%:nickname%'";
		List<Member> list = session
								.createQuery(hql, Member.class)
								.setParameter("nickname", nickname)
								.getResultList();
		return list;
	}

}
