package com.avantika.infosys;
public class DriverClass {
	public static void main(String args[])
	{
		Employee obj1=new Employee(1010,"Avantika","ABC house,Kolkata",50000);
		Employee obj2=new Employee(1010,"Avantika","ABC house,Kolkata",50000);
		System.out.println(obj1.equals(obj2));
		System.out.println("The hashcode of object 1 is:" +obj1.hashCode());
		System.out.println("The hashcode of object 2 is:" +obj2.hashCode());
	}
}

