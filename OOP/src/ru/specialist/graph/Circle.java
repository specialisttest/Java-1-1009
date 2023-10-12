package ru.specialist.graph;

public class Circle extends Shape implements Scaleable, LogScaleable{
	
	private int x;
	private int y;
	
	private int r;
	
	// property R
	public int getR() {
		return r;
	}
	
	private void setR(int r) {
		if (r > 0)
			this.r = r;
		else
			throw new IllegalArgumentException("r <= 0");
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	Circle(int x, int y, int r) {
		this(x,y,r,DEFAULT_COLOR);
	}
	
	Circle(int x, int y, int r, String color) {
		super(color);
		this.x = x;
		this.y = y;
		//this.r = r;
		setR(r);
	}
	

	
	@Override
	public void draw() {
		System.out.printf("Circle (%d, %d) R: %d : %s\n", x, y, getR(), this.color);
	}
	
	@Override
	public void scale(double factor) {
		//this.r = (int)Math.round(r * factor);
		setR((int)Math.round(getR() * factor));
	}
	
	@Override 
	public void scale() {
		System.out.println("Scale circle");
		Scaleable.super.scale();
		LogScaleable.super.scale();
	}

		
	

}
