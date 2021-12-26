package com.avantika.infosys;

import java.util.Objects;

public class Employee {
	public int employee_id;
	String name;
	String address;
	public long salary;
	
	public Employee(int employee_id, String name, String address, long salary) {
		super();
		this.employee_id = employee_id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", name=" + name + ", address=" + address + ", salary=" + salary
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, employee_id, name, salary);
		}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && employee_id == other.employee_id
				&& Objects.equals(name, other.name) && salary == other.salary;
	}

	

	

}
