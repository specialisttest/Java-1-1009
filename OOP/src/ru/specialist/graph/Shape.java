package ru.specialist.graph;

import java.util.ArrayList;
import java.util.List;

/*
 * Class, Interface, Enum
 * 
 * Modifier		Access level	Visibility
 *  public		 public			 world
 *				 package		 only current package  
 */
public abstract class Shape {
	
	// global variable
	public static List<Shape> scene = new ArrayList<Shape>();
	
	public static final String DEFAULT_COLOR = "black";
	
	/*
	 * Field, Method,Constructor, static and non-static
	 * 
	 * Modifier		Access level	Visibility
 	 *  public		 public			 world
 	 *  private		 private		 only this class
 	 *  			 package		 this package
 	 *  protected	 protected		 this package + subclass	
	 * 
	 */
	String color;

	public Shape() {
		this(DEFAULT_COLOR);
	}
	public Shape(String color) {
		this.color = color;
		//scene.add(this); // bad
	}
	
	public abstract void draw();
	
	public static void drawScene() {
		for(Shape s : scene)
			s.draw();
	}
	
	public static void scaleScene(double factor) {
		for(Shape s : scene) {
			if (s instanceof Scaleable) {
				Scaleable sc = (Scaleable)s;
				sc.scale(factor);
			}
		}
	}
	
	public static void clearScene() {
		scene.clear();
	}

}
