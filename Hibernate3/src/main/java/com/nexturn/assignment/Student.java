package com.nexturn.assignment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int RollNo;
	@Column
	private String Name;
	@Column
	private int Age;
	@Column
	private String ClassSection;
	@Column
	private String Address;
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getClassSection() {
		return ClassSection;
	}
	public void setClassSection(String classSection) {
		ClassSection = classSection;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
//	public Student(int rollNo, String name, int age, String classSection, String address) {
//		super();
//		RollNo = rollNo;
//		Name = name;
//		Age = age;
//		ClassSection = classSection;
//		Address = address;
//	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + RollNo + ", name=" + Name + ", classSection=" + ClassSection + ", age=" + Age
				+ ", address=" + Address + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
