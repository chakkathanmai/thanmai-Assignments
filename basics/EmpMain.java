package com.trainings.basics;

public class EmpMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee employee1=new Employee();
		
		System.out.println(employee1.name);
		System.out.println(employee1.salary);
		employee1.name="Ram";
		employee1.salary=3000;
		System.out.println(employee1.name);
		System.out.println(employee1.salary);
		
		Employee employee2= employee1;
		
		System.out.println(employee2.name);
		System.out.println(employee2.salary);
		
		employee2.salary=5000;
		System.out.println(employee2.salary);
		System.out.println(employee1.salary);
		
		employee1=null;
		System.out.println(employee2.salary);
		System.out.println(employee1.salary);
	

	}

}
