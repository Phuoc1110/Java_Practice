package com.NoVC_End;

import java.sql.*;

public class Lesson34_SQL {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost/jp_dict", "root", "Phuoclake2k4");
			
			Statement sqlState = conn.createStatement();
			
			String getKanji = "Select * from Words LIMIT 10";
			
			ResultSet rows = sqlState.executeQuery(getKanji);
			
			while (rows.next()) {
				System.out.println(rows.getString("Word"));
			}
			
		}
		catch (SQLException e) {
			// TODO: handle exception
			System.out.println("SQLException :" + e.getMessage());
			System.exit(0);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}