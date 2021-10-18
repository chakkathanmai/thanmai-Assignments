package com.training.demos;

public class Typecastingdemo {

	public static void main(String[] args) {
		int x = 10, y = 20;
		long a = x + y; //upcasting
		System.out.println(a);
		
		int m=(int)a; //downcasting
		System.out.println(m);
		
		float k=21.0f;
		 
		System.out.println("Sum"+a+m+k);//concat
		System.out.println("Sum"+(a+m+k)); //Add
	}

}
