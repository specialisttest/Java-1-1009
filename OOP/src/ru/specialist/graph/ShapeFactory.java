package ru.specialist.graph;

public class ShapeFactory {
	
	// Фабричный метод
	public Circle createCircle(int x, int y, int r, String color) {
		Circle c = new Circle(x,y,r,color);
		Shape.scene.add(c); // hook
		return c;
	}
	public Point createPoint(int x, int y, String color) {
		Point p = new Point(x,y,color);
		Shape.scene.add(p); // hook
		return p;
	}
	public Line createLine(int x1, int y1, int x2, int y2, String color) {
		Line p = new Line(x1,y1,x2,y2,color);
		Shape.scene.add(p); // hook
		return p;
	}
	
	private ShapeFactory() {}
	
	public static ShapeFactory instance = new ShapeFactory();
}
