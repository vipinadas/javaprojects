package com.avantika.infosy;

public class Employee1 implements Comparable<Employee1>,Cloneable{
	private int empId,salary;
	private String empNme;
	Address address;
	public Employee1(int empId, int salary, String empNme, Address address) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.empNme = empNme;
		this.address = address;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmpNme() {
		return empNme;
	}
	public void setEmpNme(String empNme) {
		this.empNme = empNme;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", empNme=" + empNme + ", address=" + address + "]";
	}
	@Override
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee1 e =(Employee1) super.clone();
	    e.setAddress((Address)this.address.clone());
	    return e;
	
	}
		

}
