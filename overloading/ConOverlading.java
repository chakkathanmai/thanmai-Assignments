package com.trainings.overloading;

public class ConOverlading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stud=new Student();
		Student stud1=new Student("ram",1);
		Student stud2=new Student("tom","bangalaore",20);
		
		stud.getDetails();
		stud1.getDetails();
		stud2.getDetails();
		}

}
