package com.techelevator;

public abstract class Wall {
	// Instance variables
	private String name;
	private String color;
	
	// Constructor
	public Wall(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	// Methods

	public abstract int getArea();

	public String getColor() {
		return color;
	}
	public String getName() {
		return name;
	}
	
}
