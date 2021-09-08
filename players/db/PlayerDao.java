package com.hsbc.players.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hsbc.exception.*;

public class PlayerDao {

	Connection conn = null;

	PlayerDao() {
		conn = ConnectionFactory.getDBConnection();
	}
	PreparedStatement pstmt = null;

	String sql = "insert into players values(?,?,?)";

	public void addPlayer(Players players) {

		

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, players.getName());
			pstmt.setString(2, players.getCategory());
			pstmt.setInt(3, players.getRanking());

			int i = pstmt.executeUpdate();

			if (i > 0)
				System.out.println("Insert is successful!!");

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	
	}
	public void formTeam(Players team) throws TeamNotFormedException{
		
		ResultSet rs = null;
		try {
			rs = pstmt.executeQuery(sql);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		try {
			while (rs.next()) {
				System.out.println(rs.getString(1) + "   " + rs.getString(2) + "   " + rs.getInt(3));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			
	}
}
