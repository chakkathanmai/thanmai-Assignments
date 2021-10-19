package com.trainings.basics;

public class ConstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee1 = new Employee("RAm",1000);
		employee1.getDetails();
		String msg = employee1.greet("have a good day");
		System.out.println(msg);

		Employee employee2 = new Employee("Tom",2000);
		employee2.getDetails();
		System.out.println(employee2.greet("have a nice day"));

	}

}
