package ru.specialist.graph;

public class Shape {
	
	public static final String DEFAULT_COLOR = "black";
	
	public String color;

	public Shape() {
		this(DEFAULT_COLOR);
	}
	public Shape(String color) {
		this.color = color;
	}
	
	public void draw() {
		System.out.printf("Shape: %s\n", color);
	}
	

}
