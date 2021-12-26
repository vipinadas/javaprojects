package com.avantika.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.avantika.pojo.Library;

public class LibraryConnection {
	public Connection connection;
	public  String createJdbcConnection(Library book) throws ClassNotFoundException, SQLException
	{
	Class.forName("com.mysql.jdbc.Driver");
	 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/practicedb","root","vipina");
	System.out.println(connection);
	Statement stmt=connection.createStatement(); 
	//String s="create table bookManage2(bookid int,nme varchar(10),auth varchar(12),pub varchar(13),cst int)";
	//stmt.execute(s);
//	String m= "insert  into bookManage2 values(" + book.getBookId() + ","+"'"+book.getBookName()+"'"+","+"'"+book.getAuthor()+"'"+","+"'"+book.getPublisher()+"'"+","+book.getBookCost()+")";
//	stmt.execute(m);
//	ResultSet set=stmt.executeQuery("select * from bookManage2");
//	//System.out.println("Book Id " +" Book Name " +"Book Author Name " + " Publisher Name " + "Book cost ");
//	while(set.next())
//	{
//		System.out.println(set.getInt(1) +"         " +set.getString(2) + "       "+ set.getString(3) +"        " +set.getString(4) + "       " +set.getInt(5));
//	}
	connection.close();
return "Connection establshed sucessfully";
}

	}