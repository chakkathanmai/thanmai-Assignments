package com.trainings.basics;

public class Employee {
	
	String name;
	int salary;
	
	Employee(){
		
	}
	
	Employee(String name,int salary){
		this.name=name;
		this.salary=salary;
	}


	void getDetails() {
		System.out.print("Name"+name);
		System.out.print("SAlary"+salary);
	}

	String greet(String msg) {
		return msg;
	}
}
