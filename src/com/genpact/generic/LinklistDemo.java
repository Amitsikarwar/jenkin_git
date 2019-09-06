package com.genpact.generic;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class LinklistDemo {
	public static void main(String[] args) {
		LinkedList<String>sList=new LinkedList<>();
		sList.add("Mango");
		sList.add("Apple");
		sList.add("banana");
		sList.add("pineapple");
		sList.add("Mango");
		System.out.println(sList);
		sList.addFirst("Guava");
		sList.addFirst("Pomegranate");
		System.out.println(sList);
		/*Iterator<String>itr=sList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		ListIterator<String>itr=sList.listIterator(sList.size());
		while(itr.hasPrevious()) {
			
			System.out.println(itr.previous());
		}
		System.out.println("-------------------------_______");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		
	}

}
}
