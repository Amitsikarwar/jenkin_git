package com.genpact.generic;

public class Bag {
	private int id;
	private String type;
	private String color;
	private float price;
	public Bag(int id, String type, String color, float price) {
		super();
		this.id = id;
		this.type = type;
		this.color = color;
		this.price = price;
	}
	public Bag() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void display() {
		System.out.println(" "+id+" "+type+" "+color+" "+price);
	}

}
