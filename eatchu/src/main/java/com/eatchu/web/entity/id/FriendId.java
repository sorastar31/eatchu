package com.eatchu.web.entity.id;

import javax.persistence.Embeddable;

@Embeddable
public class FriendId {

	private long regId;
	private long friendId;
		
	public FriendId() {
		// TODO Auto-generated constructor stub
	}

	public FriendId(long regId, long friendId) {
		super();
		this.regId = regId;
		this.friendId = friendId;
	}

	public long getRegId() {
		return regId;
	}

	public void setRegId(long regId) {
		this.regId = regId;
	}

	public long getFriendId() {
		return friendId;
	}

	public void setFriendId(long friendId) {
		this.friendId = friendId;
	}

	@Override
	public String toString() {
		return "FriendId [regId=" + regId + ", friendId=" + friendId + "]";
	}
	
	
}
