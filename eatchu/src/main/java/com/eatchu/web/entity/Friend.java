package com.eatchu.web.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Friend {
	
	@EmbeddedId
	private FriendId id;
		
	public Friend() {
		// TODO Auto-generated constructor stub
	}

	public Friend(long regId, long friendId) {
		super();
		this.id = new FriendId(regId, friendId);
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
		return "Friend [id=" + id + ", getRegId()=" + getRegId() + ", getFriendId()=" + getFriendId() + "]";
	}
	
	
}
