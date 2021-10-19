package com.trainings.basics;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1=new Employee();
		employee1.name="Ram";
		employee1.salary=3000;
		employee1.getDetails();
		String msg=employee1.greet("have a good day");
		System.out.println(msg);
		
		Employee employee2=new Employee();
		employee2.name="Ram";
		employee2.salary=3000;
		employee2.getDetails();
		System.out.println(employee2.greet("have a nice"
				+ " day"));
		
	}

}
