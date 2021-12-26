package com.avantika.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import com.avantika.dao.LibraryConnection;
import com.avantika.dao.LibraryOperation;
import com.avantika.pojo.Library;

public class BookDetails {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		
		Library book=new Library();
		LibraryConnection val=new LibraryConnection();
		LibraryOperation op=new LibraryOperation();
		Scanner obj=new Scanner(System.in);
//		Class.forName("com.mysql.jdbc.Driver");
//		 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/practicedb","root","vipina");
////		Statement stmt=connection.createStatement(); 
////		String s="create table bookManage4(bookid int,nme varchar(10),auth varchar(12),pub varchar(13),cst int)";
////		stmt.execute(s);
		
		
//System.out.println("Enter the Book Id");
//	book.setBookId(obj.nextInt());
//		System.out.println("Enter the Book Name");
//	book.setBookName(obj.next());
//		System.out.println("Enter the Book Author Name");
//		book.setAuthor(obj.next());
//		System.out.println("Enter the Book Publisher Name");
//	book.setPublisher(obj.next());		
//		System.out.println("Enter the rate of Book ");
//		book.setBookCost(obj.nextInt());
 do
 {System.out.println("1.Insert Values "+"\n"+ "2.Update" +"\n"+"3.Select "+"\n"+"4.Delete " +"\n"+"5.Select All" +"\n"+"6.BatchExecution" +"\n"+"7.Prepared Statement Execution");
 System.out.println("Enter the choice");
	int ch=obj.nextInt();
	switch(ch) 
	 {
	 case 1:    System.out.println("Enter the Book Id");
                book.setBookId(obj.nextInt());
                System.out.println("Enter the Book Name");
         	    book.setBookName(obj.next());
         		System.out.println("Enter the Book Author Name");
         		book.setAuthor(obj.next());
         		System.out.println("Enter the Book Publisher Name");
         	    book.setPublisher(obj.next());		
         		System.out.println("Enter the rate of Book ");
        		book.setBookCost(obj.nextInt());
                op.insertValues(book);
                break;
	 case 2:    System.out.println("Enter the Book name you want to update"); 
	            book.setBookName(obj.next());
                System.out.println("Enter the Publisher Name you want to take as condition");
                book.setPublisher(obj.next());
                op.updateBookName(book);
                break;
	 case 3:    System.out.println("Select BookId ,AuthorName and Rate of Book from the table of a Publisher");
	            op.selectDataFromTable(book);
	            break;
	 case 4:    System.out.println("Delete from table by using BookId ");
	            System.out.println("Enter the Book Id");
                book.setBookId(obj.nextInt());
                op.deleteOneRecord(book);
                break;
	 case 5:    System.out.println("Select all the content from the table"); 
	            op.selectAllContent(book);
	            break;
	 
	 case 6:    System.out.println("Enter Number of Queries"); 
	            String s1="delete from bookManage4 where nme= 'java'" ;
	            String s2="update bookManage4 set nme"+"="+"'"+"java"+"'"+ " where bookid"+"="+101;
	            String[] a= {s1,s2};
	            System.out.println(s1);
	            System.out.println(s2);
	            //System.out.println(s3);
	        
	            int[] arrayReturn=op.executebatch(a);
	            for(int sval:arrayReturn)
	            	System.out.println(sval);
	            break;
	 case 7:   System.out.println("Execute the query using prepared statement");
		       System.out.println("Enter the Book Id");
               book.setBookId(obj.nextInt());
               System.out.println("Enter the Book Name");
	           book.setBookName(obj.next());
		       System.out.println("Enter the Book Author Name");
		       book.setAuthor(obj.next());
		       System.out.println("Enter the Book Publisher Name");
	           book.setPublisher(obj.next());		
		       System.out.println("Enter the rate of Book ");
		       book.setBookCost(obj.nextInt());
		       op.preparedstatementexecute(book);
		       break;
	default : System.out.println("The option is not valid");
	           System.exit(0);
     
	 }
 }while(1!=0);
		
	}}


