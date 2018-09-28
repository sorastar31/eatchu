package com.eatchu.web.entity;

import java.sql.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.eatchu.web.entity.id.FriendId;

@Entity
public class Friend {
	
	@EmbeddedId
	private FriendId id;
	private Date regDate;
		
	public Friend() {
		// TODO Auto-generated constructor stub
	}

	public Friend(long regId, long friendId, Date regDate) {
		super();
		this.id = new FriendId(regId, friendId);
		this.regDate = regDate;
	}
	
	public long getRegId() {	
		return id.getRegId();
	}
	
	public void setRegId(long regId) {
		id.setRegId(regId);
	}
	
	public long getFriendId() {	
		return id.getFriendId();
	}
	public void setFriendId(long friendId) {
		id.setFriendId(friendId);
	}

	@Override
	public String toString() {
		return "Friend [id=" + id + ", getRegId()=" + getRegId() + ", getFriendId()=" + getFriendId() +", regDate="+ regDate +"]";
	}
	
	
}
