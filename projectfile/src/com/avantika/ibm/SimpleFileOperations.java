package com.avantika.ibm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleFileOperations {
	public static void main(String args[]) throws IOException
	{
	File fp=new File("C:\\Users\\Acer\\Desktop\\SampleText.txt");
	fp.createNewFile();
	FileWriter fw=new FileWriter(fp);
	fw.write("I am a simple file program \n");
	fw.write("I am studying Java Programming now", 1, 10);
	fw.close();
	Scanner sf=new Scanner(fp);
	System.out.println(sf.nextLine());
	
	

}}
