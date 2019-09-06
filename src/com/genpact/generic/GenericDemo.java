package com.genpact.generic;
public class GenericDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass<Integer> m1=new MyClass<>(12 );
		System.out.println(m1.getValue());
		m1.setValue(10);
		System.out.println(m1.getValue());
		MyClass m2=new MyClass(10.01);
		System.out.println(m2.getValue());
		m2.setValue(10.0);
		System.out.println(m2.getValue());
		int x=14;
		//Integer I=new Integer(x);
		//System.out.println(I);
		//int y=I.intValue();
		Integer I=x;
	}
}