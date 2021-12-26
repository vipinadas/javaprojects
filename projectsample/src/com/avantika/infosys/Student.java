package com.avantika.infosys;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Student {
//private int roll_no;
public int m1,m2,m3,m4,m5,total=0,percent=0;
public Student( int m1, int m2, int m3, int m4, int m5) 
{
	//this.roll_no = roll_no;
	this.m1 = m1;
	this.m2 = m2;
	this.m3 = m3;
	this.m4 = m4;
	this.m5 = m5;
}
public int add()
{
	Set<Integer> mrks=new HashSet<>();
	mrks.add(this.m1);
	mrks.add(this.m2);
	mrks.add(this.m3);
	mrks.add(this.m4);
	mrks.add(this.m5);
	Iterator<Integer> i=mrks.iterator();
	while(i.hasNext())
	{
		int val=(int) i.next();
	    this.total=this.total+val;
	}
	

	return this.total;
	}
public int percentage()
{
	percent=(((this.total)/500)*100);
	return percent;
	}


}
