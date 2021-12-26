package com.avantika.infosy;

public class Address implements Comparable<Employee1>,Cloneable
{ private int house_no;
private String loctnNum;
private String city;
private int pin;

	public Address(int house_no, String loctnNum, String city, int pin)
	{
		
		this.house_no = house_no;
		this.loctnNum = loctnNum;
		this.city = city;
		this.pin = pin;
	}
		@Override
	public String toString() {
		return "Address [house_no=" + house_no + ", loctnNum=" + loctnNum + ", city=" + city + ", pin=" + pin + "]";
	}
		@Override
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		return 0;
	}
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
		public int getHouse_no() {
			return house_no;
		}
		public void setHouse_no(int house_no) {
			this.house_no = house_no;
		}
		public String getLoctnNum() {
			return loctnNum;
		}
		public void setLoctnNum(String loctnNum) {
			this.loctnNum = loctnNum;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getPin() {
			return pin;
		}
		public void setPin(int pin) {
			this.pin = pin;
		}
		
		
		 
	

}
