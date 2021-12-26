package com.avantika.infosy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnections {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 String QUERY = "SELECT * FROM school";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/practicedb","root","vipina");
		Statement stmt=(Statement) connection.createStatement(); 
//		String s="insert into school values(108,'Niy','Niyg@gmail.com','2015-09-01')";
//		 stmt.execute(s);
		 ResultSet rs = (stmt).executeQuery(QUERY);
	 		 while(rs.next())  
			 System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3) +" " +rs.getString(4));  
			 
	 		 connection.close();  
		 }
		 	

	}


