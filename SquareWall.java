package com.techelevator;

public class SquareWall extends RectangleWall {
	
	// Constructor
	public SquareWall(String name, String color, int sideLength) {
		super(name, color, sideLength, sideLength);
		
	}
	
	// Methods
	public String toString() {
		return getName() + " (" + getHeight() + "x" + getLength() + ") square";
	}
	

}
