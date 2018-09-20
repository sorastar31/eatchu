package com.eatchu.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Store {
	
	@Id
	private long id;
	private String name;
	private String location;
	private double lat; 
	private double lng; 
	private String tel;
	private String content;
	private long regId;
	
	public Store() {
		// TODO Auto-generated constructor stub
	}

	public Store(long id, String name, String location, double lat, double lng, String tel, String content,
			long regId) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.lat = lat;
		this.lng = lng;
		this.tel = tel;
		this.content = content;
		this.regId = regId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getRegId() {
		return regId;
	}

	public void setRegId(long regId) {
		this.regId = regId;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", location=" + location + ", lat=" + lat + ", lng=" + lng
				+ ", tel=" + tel + ", content=" + content + ", regId=" + regId + "]";
	}
	
}
