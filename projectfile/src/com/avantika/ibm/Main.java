package com.avantika.ibm;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
	LibraryManagement book1=new LibraryManagement();
	Publisher person1=new Publisher();
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the Book id");
	book1.bookId=obj.nextInt();
	System.out.println("Enter the Book name");
	book1.bookName=obj.next();
	System.out.println("Enter the Book author");
	book1.author=obj.next();
	System.out.println("Enter the Book price");
	book1.price=obj.nextInt();
	System.out.println("Enter the Book publisher name");
	person1.publisherName=obj.next();
	System.out.println("Enter the Book volume no");
	person1.vol=(short) obj.nextInt();
	System.out.println("Enter the Book publishing date");
	person1.date=obj.next();
	book1.publish=person1;
	System.out.println(book1.toString());
	//File Operations starts for serialization
	 File fp=new File("C:\\Users\\Acer\\Desktop\\LibraryData.doc");
	//fp.createNewFile();
//	FileOutputStream fis=new FileOutputStream(fp);
//	ObjectOutputStream oos=new ObjectOutputStream(fis);//created objectoutput stream object for writing obj to file
//	oos.writeObject(book1);
//	oos.flush();
//	oos.close();
//	fis.close();
	//File Operations starts for derialization
	FileInputStream fip=new FileInputStream(fp);
	ObjectInputStream ois=new ObjectInputStream(fip);
    LibraryManagement obj1=(LibraryManagement) ois.readObject();
    System.out.println("I am a content from file");
	System.out.println(obj1);
	ois.close();
	fip.close();
	
	

}}
