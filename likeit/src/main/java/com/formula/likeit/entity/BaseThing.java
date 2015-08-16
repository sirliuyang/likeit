package com.formula.likeit.entity;

public class BaseThing {
	
	public Long id;

	public String category;
	
	public String name;
	
	public int rate;
	
	public String comments;
	
	public boolean likeit;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public boolean isLikeit() {
		return likeit;
	}

	public void setLikeit(boolean likeit) {
		this.likeit = likeit;
	}
	
	
	
}
