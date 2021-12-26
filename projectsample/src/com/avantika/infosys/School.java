package com.avantika.infosys;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class School {
public static void main(String args[])
{
	Student stud1=new Student(60,80,90, 95, 100);
	Student stud2=new Student(90,80,90, 95, 50);
	Student stud3=new Student(60,80,90, 95, 100);
	Student stud4=new Student(60,80,90,80, 100);
	Student stud5=new Student(50,80,90, 95, 100);
	System.out.println("The student1's total mark and Percentage is :"+stud1.add()+"and" +stud1.percentage());
	System.out.println("The student2's total mark and Percentage is :"+stud2.add()+"and" +stud2.percentage());
	System.out.println("The student3's total mark and Percentage is :"+stud3.add()+"and" +stud3.percentage());
	System.out.println("The student4's total mark and Percentage is :"+stud4.add()+"and" +stud4.percentage());
	System.out.println("The student5's total mark and Percentage is :"+stud5.add()+"and" +stud5.percentage());
	ExtraCurricularGrade ec1=new ExtraCurricularGrade("A", "B", "A", "C"); 
	ExtraCurricularGrade ec2=new ExtraCurricularGrade("B", "B", "A", "C"); 
	ExtraCurricularGrade ec3=new ExtraCurricularGrade("C", "B", "A", "C"); 
	ExtraCurricularGrade ec4=new ExtraCurricularGrade("C", "B", "A", "C"); 
	ExtraCurricularGrade ec5=new ExtraCurricularGrade("C", "B", "C", "C"); 
	System.out.println("The EAG for student 1 is " +ec1.extra_acivity());
	System.out.println("The EAG for student 2 is " +ec2.extra_acivity());
	System.out.println("The EAG for student 3 is " +ec3.extra_acivity());
	System.out.println("The EAG for student 4 is " +ec4.extra_acivity());
	System.out.println("The EAG for student 5 is " +ec5.extra_acivity());
	Height hgt1=new Height();
	TreeSet<Integer> ht=new TreeSet<>();
	ht.addAll(hgt1.height_order(190,160,150,180,150));
	Iterator<Integer> val=ht.iterator();
	while(val.hasNext())
	{
		System.out.print("Height order  of the class is :" +val.next() +" ");
	}
	
	
}
}