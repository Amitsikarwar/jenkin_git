package com.genpact.generic;
import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> aList= new ArrayList<>();
		aList.add(12);
		aList.add(new Integer(13));
		aList.add(15);
		aList.add(12);
		System.out.println(aList);
		System.out.println("Size "+aList.size());
		aList.add(1);
		System.out.println("Size "+aList.size()+" "+aList);
		System.out.println("is 13 present "+aList.contains(13));
		System.out.println("Value at 0 index "+aList.get(0));
		aList.set(1, 100);
		aList.remove(new Integer(12));
		System.out.println(" After deletion "+aList);
		System.out.println("After Removal "+aList);
		for(int x:aList) {
			System.out.println(x);
		}
		Iterator<Integer>itr=aList.iterator();
		while(itr.hasNext()) {
			int x=itr.next();
			System.out.println(" "+x+" ");
		}
}
}