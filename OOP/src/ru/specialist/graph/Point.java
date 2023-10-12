package ru.specialist.graph;

/*class Point3D extends Point {
	int z;
}*/

public /*final*/ class Point extends Shape {
	
	public int x;
	public int y;
	
	// bad
	//public String color;
	
	Point() {
		this(0,0, DEFAULT_COLOR);
	}
	
	Point(int x, int y, String color) {
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
		//System.out.println(this);
	}
	
	@Override
	public String toString() {
		return String.format("Point (%d, %d) : %s", this.x, this.y, this.color);
	}
	
	// bad
	// public int draw;
	
	public void moveBy(int dx, int dy) {
		x += dx;
		y += dy;
	}

}
