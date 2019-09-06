package com.genpact.generic;


public class GenericMethodDemo {
	 static<T> void show(T a) {
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show(5);
		float b=2.0f;
		show(b);
		double c=12.00;
		show(c);
	}

}
