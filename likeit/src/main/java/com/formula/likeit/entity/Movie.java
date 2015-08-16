package com.formula.likeit.entity;

import java.util.List;

public class Movie extends BaseThing{
	
	public String movieType;
	
	public List<String> actorList;

	public List<String> getActorList() {
		return actorList;
	}

	public void setActorList(List<String> actorList) {
		this.actorList = actorList;
	}

	public String getMovieType() {
		return movieType;
	}

	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}
	
	
	
}
