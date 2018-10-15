package com.eatchu.web.entity;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {
	
	@Id
	private String id;
	private String email;
	private String nickname;
	private String pwd;
	private int genderId;
	private int birthYear;
	private String photo;
	@Column(insertable=false)
	private Date regDate;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String id, String email, String nickname, String pwd, int genderId, int birthYear, String photo,
			Date regDate) {
		super();
		this.id = id;
		this.email = email;
		this.nickname = nickname;
		this.pwd = pwd;
		this.genderId = genderId;
		this.birthYear = birthYear;
		this.photo = photo;
		this.regDate = regDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getGenderId() {
		return genderId;
	}

	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", email=" + email + ", nickname=" + nickname + ", pwd=" + pwd + ", genderId="
				+ genderId + ", birthYear=" + birthYear + ", photo=" + photo + ", regDate=" + regDate + "]";
	}


}
