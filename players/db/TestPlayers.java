package com.hsbc.players.db;

public class TestPlayers {
	
	public static void main(String[] args) {
		PlayerDao dao = new PlayerDao();
		
		Players obj1 = new Players("Sachin","Batsmen",1);
		dao.addPlayer(obj1);
		
	}

}
