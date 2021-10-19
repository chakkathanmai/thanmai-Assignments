package com.trainings.overloading;

public class Student {
	
	String name,city;
	int studentid;
	
	public Student() {
		System.out.println("in default");
	}
	
	public Student(String name,int id) {
		this.name=name;
		studentid=id;
	}
	
	public Student(String name,String city,int studentid) {
		this.name=name;
		this.city=city;
		this.studentid=studentid;
	}

	void getDetails() {
		if(name!=null)
			System.out.println("Name"+name);
		if(city!=null)
			System.out.println("city"+city);
		if(studentid>0)
			System.out.println("id"+studentid);
		else
			System.out.println("No input");
		}
}
