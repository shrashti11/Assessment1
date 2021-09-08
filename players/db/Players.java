package com.hsbc.players.db;

public class Players {
	
	private String name, category;
	private int ranking;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public Players(String name, String category, int ranking) {
		super();
		this.name = name;
		this.category = category;
		this.ranking = ranking;
	}
	
	public String toString() {
		return "Players [name=" + name + ", category=" + category + ", ranking=" + ranking + "]";
	}
	

}
