package com.genpact.generic;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class BagDemo 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Bag>bList= new ArrayList<>();
		
		boolean f=true;
		int n=0;
		Bag bag= new Bag();
		while(f) {
		System.out.println("Enter the id");
		Scanner s1=new Scanner(System.in);
	    int id=s1.nextInt();
		System.out.println("Enter the type");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Enter the color");
		String type=sc.nextLine();
		System.out.println("Enter the Price");
		float Price=s1.nextFloat();
		bag= new Bag(id,name,type, Price);
		bList.add(bag);
		System.out.println("if Enter more data press 1 else 0");
		int x=s1.nextInt();
		
		if(x==1) {
			f=true;
		}else {f=false;}
		
		}
		/*Bag bag = new Bag(101, "HandBag", "black",200);
		bList.add(bag);
		bag= new Bag(103,"Bag","blue", 500);
		bList.add(bag);*/
		for(Bag x:bList) {
			x.display();
		}
		int k=0;
		for(Bag x:bList) {
			String h=x.getColor();
			if(h.equalsIgnoreCase("red")) {
				k++;
				
			}
			
		}
		System.out.println("Red color bags :" +k);
		

		System.out.println("Enter the id u want to remove");
		Scanner s2=new Scanner(System.in);
	    int idr=s2.nextInt();


		for(Bag x:bList) {
			if(x.getId()==idr) {
				bList.remove(x);
				break;		
			}
			
		}
		
		Iterator<Bag>itr =bList.iterator();
		while(itr.hasNext()) {
			Bag b=itr.next();
			if(b.getId()==idr) {
		itr.remove();	
		}
		
		System.out.println("New price");
		for(Bag x:bList) {
			x.display();
		}
		

	}

}
}
