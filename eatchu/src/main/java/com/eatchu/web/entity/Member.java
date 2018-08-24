package com.eatchu.web.entity;

import java.sql.Date;

public class Member {
	
	private String id;
	private String nickname;
	private String pwd;
	private String img;
	private int birthYear;
	private String gender;
	private Date regDate;
	
	public Member() {
		
	}

	public Member(String id, String nickname, String pwd, String img, int birthYear, String gender, Date regDate) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.pwd = pwd;
		this.img = img;
		this.birthYear = birthYear;
		this.gender = gender;
		this.regDate = regDate;
	}
	
	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", nickname=" + nickname + ", pwd=" + pwd + ", img=" + img + ", birthYear="
				+ birthYear + ", gender=" + gender + ", regDate=" + regDate + "]";
	}
	
	
}
