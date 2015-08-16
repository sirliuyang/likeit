package com.formula.likeit.entity;

public class User {
	
	public Long uid;
	
	public String nickName;
	
	public String contact;

	
	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	@Override
	public String toString(){
		return this.nickName + " " + this.contact;
	}
	
	
}
