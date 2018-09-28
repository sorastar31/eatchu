package com.eatchu.web.dao.hb;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eatchu.web.dao.FriendDao;
import com.eatchu.web.entity.Friend;

@Repository
public class HbFriendDao implements FriendDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public int insert(Friend friend) {
		Session session = sessionFactory.getCurrentSession();
		Object id = session.save(friend);
		if(id != null)
			return 1;
		return 0;
	}

	@Override
	@Transactional
	public int update(Friend friend) {
		Session session = sessionFactory.getCurrentSession();
		session.update(friend);
		return 1;
	}

	@Override
	@Transactional
	public int delete(long regId, long friendId) {
		Session session = sessionFactory.getCurrentSession();
		Friend friend = new Friend();
		friend.setRegId(regId);
		friend.setFriendId(friendId);
		
		session.remove(friend);
		return 1;
	}

	@Override
	@Transactional
	public List<Friend> getList() {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Friend";
		List<Friend> list = session
								.createQuery(hql, Friend.class)
								.getResultList();
		return list;
	}

	@Override
	@Transactional
	public List<Friend> getList(long regId) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Friend where regId = ':regId'";
		List<Friend> list = session
								.createQuery(hql, Friend.class)
								.setParameter("regId", regId)
								.getResultList();
		return list;
	}

}
