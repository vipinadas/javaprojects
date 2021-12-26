package com.avantika.dao;
import java.sql.Statement;
import com.avantika.dao.LibraryOperation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.avantika.pojo.Library;

public class LibraryOperation {

	public void insertValues(Library book) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/practicedb","root","vipina");
		System.out.println(connection);
		java.sql.Statement stmt=connection.createStatement();
		String m= "insert  into bookManage4 values(" + book.getBookId() + ","+"'"+book.getBookName()+"'"+","+"'"+book.getAuthor()+"'"+","+"'"+book.getPublisher()+"'"+","+book.getBookCost()+")";
		stmt.execute(m);
		
	}

	public void updateBookName(Library book) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/practicedb","root","vipina");
		System.out.println(connection);
		Statement stmt=connection.createStatement();
		String m="update bookManage4 set nme= "+"'"+book.getBookName()+"'"+"where pub=" +"'"+book.getPublisher()+"'"  ;
		stmt.execute(m);
		
	}

	public void selectDataFromTable(Library book) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/practicedb","root","vipina");
		System.out.println(connection);
		Statement stmt= connection.createStatement();
		String m="select bookid"+ ","+"auth"+ ","+"pub  from  bookManage4 where pub="+book.getPublisher();
		ResultSet rst=stmt.executeQuery(m);
		while(rst.next())  
			 System.out.println(rst.getInt(1)+"  "+rst.getString(3)+"  "+rst.getString(4) ); 
	}

	public void deleteOneRecord(Library book) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/practicedb","root","vipina");
		System.out.println(connection);
		Statement stmt=connection.createStatement();
		String m="delete from bookManage4  where bookId="+book.getBookId();
		ResultSet rst=stmt.executeQuery(m);	
		while(rst.next())  
			 System.out.println(rst.getInt(1)+"  "+rst.getString(2)+"  "+rst.getString(3) +" " +rst.getString(4)+""+rst.getInt(5));
	}

	public void selectAllContent(Library book) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/practicedb","root","vipina");
		System.out.println(connection);
		Statement stmt=connection.createStatement();
		String m="select"+" *"+"from bookManage4";
		ResultSet rst=stmt.executeQuery(m);
		while(rst.next())  
			 System.out.println(rst.getInt(1)+"  "+rst.getString(2)+"  "+rst.getString(3) +" " +rst.getString(4)+""+rst.getInt(5));
		
	}

	public int[] executebatch(String[] a) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/practicedb","root","vipina");
		Statement stmt=connection.createStatement();
		for(String str:a)
			stmt.addBatch(str);
		int[] result=stmt.executeBatch();
		return result;
	}

	public void preparedstatementexecute(Library book) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/practicedb","root","vipina");
		PreparedStatement stmt=connection.prepareStatement("insert into bookManage2 values(?,?,?,?,?)");
		stmt.setInt(1, book.getBookId());
		stmt.setString(2,book.getBookName());
		stmt.setString(3,book.getAuthor());
		stmt.setString(4,book.getPublisher());
		stmt.setInt(5, book.getBookCost());
		stmt.execute();
		
	}

}
