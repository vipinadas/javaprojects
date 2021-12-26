package com.avantika.infosys;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPackage {
public static void main(String args[])
{
	Set<Integer> set1=new HashSet<>();
	set1.add(10);
	set1.add(20);
	set1.add(30);
	set1.add(40);
	set1.add(50);
	set1.add(60);
	set1.add(70);
	System.out.println("The first  elements of Set are :");
	Iterator<Integer> itr=set1.iterator();
	while(itr.hasNext())
		System.out.print(itr.next() +" ");
	Set<Integer> set2=new HashSet<>();
	set2.add(10);
	set2.add(15);
	set2.add(20);
	set2.add(25);
	set2.add(30);
	set2.add(35);
	set2.add(40);
	set2.add(null);
	System.out.println();
	System.out.println("The Second elements of Set are :");
	Iterator<Integer> itl=set2.iterator();
	while(itl.hasNext())
		System.out.print(itl.next()  +" ");
	Set<Integer> set3=new HashSet<>(set1);
	//System.out.println("\n"+set3);
	//find union of elements
	set1.addAll(set2);
	System.out.println("\n" + "The union of two sets 1 & 2 is :");
	Iterator<Integer> its=set1.iterator();
	while(its.hasNext())
		System.out.print(its.next()  +" ");
	System.out.print("\n"+"***********************************************************");
	// find Intersection of Two sets
	set3.retainAll(set2);
	Iterator<Integer> itk=set3.iterator();
	System.out.println("\n" + "The Intersection of two sets 1 & 2 is :");
	System.out.println();
	while(itk.hasNext())
		System.out.print(itk.next()  +" ");
	System.out.print(""+"************************************************************");
	//Difference between sets
	System.out.println("\n" +"Difference between two sets is ");
	System.out.println("\n");
	set1.removeAll(set2);
	Iterator<Integer> diff=set1.iterator();
	while(diff.hasNext())
		System.out.print(diff.next()+" ");
}	
}
