package com.genpact.generic;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};
		for(int i=0;i<4;i++) {
			arr[i]+=10;
		}
		for(int x:arr) {
			x=x+10;
				}
		
		for(int x:arr) {
			System.out.println(x);
				}

	}

}
