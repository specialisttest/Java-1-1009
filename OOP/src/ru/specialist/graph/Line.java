package ru.specialist.graph;

public class Line extends Shape implements Scaleable{
	public int x1,y1,x2,y2;
	
	Line(int x1, int y1, int x2, int y2) {
		this(x1,y1,x2,y2,DEFAULT_COLOR);
	}

	Line(int x1, int y1, int x2, int y2, String color) {
		super(color);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	@Override
	public void draw() {
		System.out.printf("Line from (%d, %d) to (%d, %d) : %s\n", 
				x1,y1,x2,y2,color);
	}
	
	// property double Length (readonly)
	
	public double getLength() {
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}

	@Override
	public void scale(double factor) {
		this.x2 = (int)Math.round(factor*(x2-x1))+x1;		
		this.y2 = (int)Math.round(factor*(y2-y1))+x1;
	}

	
	
}
