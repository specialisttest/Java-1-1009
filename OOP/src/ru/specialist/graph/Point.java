package ru.specialist.graph;

public class Point extends Shape{
	
	public int x;
	public int y;
	
	// bad
	//public String color;
	
	public Point() {
		this(0,0, DEFAULT_COLOR);
	}
	
	public Point(int x, int y, String color) {
		super(color);
		
		this.x = x;
		this.y = y;
		//this.color = color;
	}
	
	
	@Override
	public void draw() {
		//super.draw();
		System.out.printf("%s (%d, %d) : %s\n",
				this.getClass().getSimpleName(),  this.x, this.y, this.color);
	}
	
	// bad
	// public int draw;
	
	public void moveBy(int dx, int dy) {
		x += dx;
		y += dy;
	}

}
